package org.example.languageElements;

import org.example.languageElements.comparisons.*;

import java.util.*;
import java.util.stream.Collectors;

public class StmtProcessor {

    public List<Stmt> stmtList;

    // TODO mapa z mapami do typów
    public Map<String, Integer> valuesInt; //symbol table used for storing values for variables
    public Map<String, Float> valuesFloat; //symbol table used for storing values for variables
    public Map<String, String> valuesString; //symbol table used for storing values for variables
    public Map<String, Integer> valuesBoolean; //symbol table used for storing values for variables


    public StmtProcessor(List<Stmt> stmtList) {
        this.stmtList = stmtList;
        this.valuesInt = new HashMap<>();
        this.valuesFloat = new HashMap<>();
        this.valuesString = new HashMap<>();
        this.valuesBoolean = new HashMap<>();
    }

    public List<String> getEvaluationResult() {
        List<String> evaluations = new ArrayList<>();
        stmtList = stmtList.stream().filter(Objects::nonNull).collect(Collectors.toList());
        for (Stmt stmt : stmtList) {
            if (stmt instanceof Assignment ass) {
                var res = getEval(ass.value);
                boolean success = false;
                switch (ass.type) {
                    case "int" -> {
                        if (res instanceof Integer) {
                            valuesInt.put(ass.name, (Integer) res);
                            success = true;
                        }
                    }
                    case "float" -> {
                        if (res instanceof Float) {
                            valuesFloat.put(ass.name, (Float) res);
                            success = true;
                        }
                    }
                    case "string" -> {
                        if (res instanceof String) {
                            valuesString.put(ass.name, (String) res);
                            success = true;
                        }
                    }
                    case "boolean" -> {
                        if (res instanceof Integer) {
                            valuesBoolean.put(ass.name, (Integer) res);
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
            } else {
                String input = stmt.toString();
                var res = getEval(stmt);
                evaluations.add(input + " is " + res);
            }
        }


        return evaluations;
    }

    // TODO reszta możliwości
    // chłop mówił coś o tym że można to bez castów robić visitor patternem ale ja już nie kminię jak

    private Object getEval(Stmt stmt) {
        Object res = null;
        if (stmt instanceof Number num) {
            res = num.number;
        } else if (stmt instanceof Variable var) {
            if (valuesInt.containsKey(var.name)) res = valuesInt.get(var.name);
            if (valuesFloat.containsKey(var.name)) res = valuesFloat.get(var.name);
            if (valuesString.containsKey(var.name)) res = valuesString.get(var.name);
            if (valuesBoolean.containsKey(var.name)) res = valuesBoolean.get(var.name);
        } else if (stmt instanceof Addition add) {
            var left = getEval(add.left);
            var right = getEval(add.right);
            if (left instanceof Float && right instanceof Float) {
                res = (Float) left + (Float) right;
            } else if (left instanceof Integer && right instanceof Integer) {
                res = (Integer) left + (Integer) right;
            } else {
                throw new RuntimeException("Error while performing addition!");
            }

        } else if (stmt instanceof Multiplication mul) {
            var left = getEval(mul.left);
            var right = getEval(mul.right);
            if (left instanceof Float && right instanceof Float) {
                res = (Float) left * (Float) right;
            } else if (left instanceof Integer && right instanceof Integer) {
                res = (Integer) left * (Integer) right;
            } else {
                throw new RuntimeException("Error while performing addition!");
            }

        } else if (stmt instanceof Subtraction sub) {
            var left = getEval(sub.left);
            var right = getEval(sub.right);
            if (left instanceof Float && right instanceof Float) {
                res = (Float) left - (Float) right;
            } else if (left instanceof Integer && right instanceof Integer) {
                res = (Integer) left - (Integer) right;
            } else {
                throw new RuntimeException("Error while performing addition!");
            }
        } else if (stmt instanceof Division div) {
            var left = getEval(div.left);
            var right = getEval(div.right);
            if (left instanceof Float && right instanceof Float) {
                res = (Float) left / (Float) right;
            } else if (left instanceof Integer && right instanceof Integer) {
                res = (Integer) left / (Integer) right;
            } else {
                throw new RuntimeException("Error while performing addition!");
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
            int left = (int) getEval(gt.left);
            int right = (int) getEval(gt.right);
            res = left > right ? 1 : 0;
        } else if (stmt instanceof Lt lt) {
            var left = (double) getEval(lt.left);
            var right = (double) getEval(lt.right);
            res = left < right ? 1 : 0;
        } else if (stmt instanceof Let let) {
            var left = (double) getEval(let.left);
            var right = (double) getEval(let.right);
            res = left <= right ? 1 : 0;
        } else if (stmt instanceof Get get) {
            var left = (double) getEval(get.left);
            var right = (double) getEval(get.right);
            res = left >= right ? 1 : 0;
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
}
