package org.example.languageElements;

import org.example.languageElements.comparisons.*;
import org.example.utils.VariableHolder;

import java.util.*;
import java.util.stream.Collectors;

public class StmtProcessor {

    public List<Stmt> stmtList;
    public  LinkedList<VariableHolder> vars = new LinkedList<>();

    // TODO mapa z mapami do typów
    public Map<String, Integer> valuesInt; //symbol table used for storing values for variables
    public Map<String, Float> valuesFloat; //symbol table used for storing values for variables
    public Map<String, String> valuesString; //symbol table used for storing values for variables
    public Map<String, Integer> valuesBoolean; //symbol table used for storing values for variables


    public StmtProcessor(List<Stmt> stmtList) {
        this.stmtList = stmtList;
        vars.add(new VariableHolder());
//        this.valuesInt = new HashMap<>();
//        this.valuesFloat = new HashMap<>();
//        this.valuesString = new HashMap<>();
//        this.valuesBoolean = new HashMap<>();
    }

    public List<String> getEvaluationResult(List<Stmt> stmts) {
        List<String> evaluations = new ArrayList<>();
        stmtList = stmts.stream().filter(Objects::nonNull).collect(Collectors.toList());
        for (Stmt stmt : stmtList) {
            if (stmt instanceof Assignment ass) {
                var res = getEval(ass.value);
                boolean success = false;
                if (isDeclared(ass.name)) throw new RuntimeException("Variable: " + ass.name + " is already declared!");
                switch (ass.type) {
                    case "int" -> {
                        if (res instanceof Integer) {
                            vars.getLast().valuesInt.put(ass.name, (Integer) res);
                            success = true;
                        }
                    }
                    case "float" -> {
                        if (res instanceof Float) {
                            vars.getLast().valuesFloat.put(ass.name, (Float) res);
                            success = true;
                        }
                    }
                    case "string" -> {
                        if (res instanceof String) {
                            vars.getLast().valuesString.put(ass.name, (String) res);
                            success = true;
                        }
                    }
                    case "boolean" -> {
                        if (res instanceof Integer) {
                            vars.getLast().valuesBoolean.put(ass.name, (Integer) res);
                            success = true;
                        }
                    }
                }
                if (success) {
                    evaluations.add(ass.name + " declared with value: " + getEval(ass.value) + " and type: " + ass.type);
                } else {
                    throw new RuntimeException("Error while assigning variable: " + ass.name + " of type: " + ass.type +
                            "to value: " + ass.value);
                }
            } else if (stmt instanceof ReAssignment reAssignment) {
                String name = reAssignment.name;
                var res = getEval(reAssignment.value);
                VariableHolder scopeLast = vars.getLast();
                VariableHolder scope;
                int idx = vars.size() - 1;
                boolean done = false;
                while (idx >= 0 && !done) {
                    scope = vars.get(idx);
                    if (scope.valuesInt.containsKey(name)) {
                        scope.valuesInt.put(name, (Integer) res);
//                        scopeLast.valuesInt.put(name, (Integer) res);
                        done = true;
                    } else if (scope.valuesFloat.containsKey(name)) {
                        scope.valuesFloat.put(name, (Float) res);
//                        scopeLast.valuesFloat.put(name, (Float) res);
                        done = true;
                    } else if (scope.valuesString.containsKey(name)) {
                        scope.valuesString.put(name, (String) res);
//                        scopeLast.valuesString.put(name, (String) res);
                        done = true;
                    } else if (scope.valuesBoolean.containsKey(name)) {
                        scope.valuesBoolean.put(name, (Integer) res);
//                        scopeLast.valuesBoolean.put(name, (Integer) res);
                        done = true;
                    }
                    idx--;
                }

            } else if (stmt instanceof ScopeBlock scopeBlock) {
                vars.add(new VariableHolder());
                evaluations.addAll(getEvaluationResult(scopeBlock.getStmts()));
                vars.removeLast();
            } else {
                String input = stmt.toString();
                var res = getEval(stmt);
                evaluations.add(input + " is " + res);
            }
        }


        return evaluations;
    }


    // TODO reszta możliwości, re-assignment


    private Object getEval(Stmt stmt) {
        Object res = null;
        if (stmt instanceof Number num) {
            res = num.number;
        } else if (stmt instanceof Variable var) {
            int idx =  var.isShadowed  ? vars.size() - 2 : vars.size() - 1;
            if (idx < 0) throw new RuntimeException("Trying to access scope that doesn't exist!");
            while (idx >= 0 && res == null) {
                VariableHolder c = vars.get(idx);
                if (c.valuesInt.containsKey(var.name)) res = c.valuesInt.get(var.name);
                if (c.valuesFloat.containsKey(var.name)) res = c.valuesFloat.get(var.name);
                if (c.valuesString.containsKey(var.name)) res = c.valuesString.get(var.name);
                if (c.valuesBoolean.containsKey(var.name)) res = c.valuesBoolean.get(var.name);

                idx--;
            }
        } else if (stmt instanceof Addition add) {
            var left = getEval(add.left);
            var right = getEval(add.right);
            if (left instanceof Float && right instanceof Float) {
                res = (Float) left + (Float) right;
            } else if (left instanceof Integer && right instanceof Integer) {
                res = (Integer) left + (Integer) right;
            } else {
                throw new RuntimeException("Error while performing addition! Types dont match");
            }

        } else if (stmt instanceof Multiplication mul) {
            var left = getEval(mul.left);
            var right = getEval(mul.right);
            if (left instanceof Float && right instanceof Float) {
                res = (Float) left * (Float) right;
            } else if (left instanceof Integer && right instanceof Integer) {
                res = (Integer) left * (Integer) right;
            } else {
                throw new RuntimeException("Error while performing multiplication! Types dont match");
            }

        } else if (stmt instanceof Subtraction sub) {
            var left = getEval(sub.left);
            var right = getEval(sub.right);
            if (left instanceof Float && right instanceof Float) {
                res = (Float) left - (Float) right;
            } else if (left instanceof Integer && right instanceof Integer) {
                res = (Integer) left - (Integer) right;
            } else {
                throw new RuntimeException("Error while performing subtraction! Types dont match");
            }
        } else if (stmt instanceof Division div) {
            var left = getEval(div.left);
            var right = getEval(div.right);
            if (left instanceof Float && right instanceof Float) {
                res = (Float) left / (Float) right;
            } else if (left instanceof Integer && right instanceof Integer) {
                res = (Integer) left / (Integer) right;
            } else {
                throw new RuntimeException("Error while performing division! Types dont match");
            }
        } else if (stmt instanceof ExprParenLog paren) {
            res = getEval(paren.inner);
        } else if (stmt instanceof Not not) {
            res = ( (int) getEval(not.inner) == 1) ? 0 : 1;
        } else if (stmt instanceof And and) {
            int left = (int) getEval(and.left);
            int right = (int) getEval(and.right);
            res = (left + right) == 2 ? 1 : 0;
        } else if (stmt instanceof Or or) {
            int left = (int) getEval(or.left);
            int right = (int) getEval(or.right);
            res = (left + right) > 0 ? 1 : 0;
        } else if (stmt instanceof ExprParen paren) {
            res = getEval(paren.inner);

        } else if (stmt instanceof Gt gt) {
            var left = getEval(gt.left);
            var right = getEval(gt.right);
            if (left instanceof Float && right instanceof Float) {
                res = (float) left > (float) right ? 1 : 0;
            } else if (left instanceof  Integer && right instanceof  Integer) {
                res = (int)left > (int)right ? 1 : 0;
            } else {
                throw new RuntimeException("Error while comparing variables: Variables are not of the same type" );
            }

        } else if (stmt instanceof Lt lt) {
            var left =  getEval(lt.left);
            var right =  getEval(lt.right);
            if (left instanceof Float && right instanceof Float) {
                res = (float) left < (float) right ? 1 : 0;
            } else if (left instanceof  Integer && right instanceof  Integer) {
                res = (int)left < (int)right ? 1 : 0;
            } else {
                throw new RuntimeException("Error while comparing variables: Variables are not of the same type" );
            }

        } else if (stmt instanceof Let let) {
            var left = getEval(let.left);
            var right = getEval(let.right);
            if (left instanceof Float && right instanceof Float) {
                res = (float) left <= (float) right ? 1 : 0;
            } else if (left instanceof  Integer && right instanceof  Integer) {
                res = (int)left <= (int)right ? 1 : 0;
            } else {
                throw new RuntimeException("Error while comparing variables: Variables are not of the same type" );
            }

        } else if (stmt instanceof Get get) {
            var left =  getEval(get.left);
            var right =  getEval(get.right);
            if (left instanceof Float && right instanceof Float) {
                res = (float) left >= (float) right ? 1 : 0;
            } else if (left instanceof  Integer && right instanceof  Integer) {
                res = (int)left >= (int)right ? 1 : 0;
            } else {
                throw new RuntimeException("Error while comparing variables: Variables are not of the same type" );
            }
        } else if (stmt instanceof Eq eq) {
            var left = (double)getEval(eq.left);
            var right = (double)getEval(eq.right);
            res = left == right ? 1 : 0;
        } else if (stmt instanceof Neq neq) {
            var left =(double) getEval(neq.left);
            var right = (double)getEval(neq.right);
            res = left != right ? 1 : 0;
        } else if (stmt instanceof FloatNumber floatNumber) {
            res = floatNumber.number;
        } else if (stmt instanceof  Striing str) {
            res = str.value;
        }

        return res;
    }

    private boolean isDeclared(String name) {
        VariableHolder holder = vars.getLast();
        return holder.valuesInt.containsKey(name) || holder.valuesFloat.containsKey(name)
                || holder.valuesString.containsKey(name) || holder.valuesBoolean.containsKey(name);
    }
}
