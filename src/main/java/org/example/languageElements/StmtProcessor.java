package org.example.languageElements;

import org.example.languageElements.comparisons.*;
import org.example.languageElements.exceptions.VariableNotExistException;
import org.example.utils.VariableHolder;

import java.util.*;
import java.util.stream.Collectors;

public class StmtProcessor {


    private final static String POOP = """
            ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⡛⠛⠷⣶⣤⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
            ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣿⡇⠀⠀⠀⠙⠻⣷⣄⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
            ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣾⠟⠀⠀⠀⠀⠀⠀⠈⣹⣿⣆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
            ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⡇⠀⠀⠀⠀⠀⣠⡴⠞⠉⠈⠻⣷⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
            ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣤⣿⡧⠤⠤⠶⠖⠋⠉⠀⠀⠀⠀⠀⢹⣷⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
            ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣾⠟⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣰⣿⣦⣄⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
            ⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣾⠟⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣴⠞⠉⠀⠉⠙⠻⣶⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀
            ⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⠀⠀⠀⣀⣀⣀⠀⠀⠀⠀⢀⣠⡴⠞⠉⠀⢀⣀⣀⣀⠀⠀⠘⣿⡄⠀⠀⠀⠀⠀⠀⠀⠀
            ⠀⠀⠀⠀⠀⠀⠀⠀⠀⢈⣿⣆⣴⠟⠉⠉⠉⠛⢶⡖⠛⠉⠁⠀⠀⢠⡾⠋⠉⠈⠉⠻⣦⣰⣿⣀⠀⠀⠀⠀⠀⠀⠀⠀
            ⠀⠀⠀⠀⠀⠀⢀⣤⣾⠟⠋⡿⠁⢀⣾⣿⣷⣄⠈⢿⡀⠀⠀⠀⢠⡟⠀⢠⣾⣿⣷⡄⠘⣿⠉⠛⢿⣦⡀⠀⠀⠀⠀⠀
            ⠀⠀⠀⠀⠀⢠⣿⠏⠀⠀⢸⡇⠀⢸⣿⣿⣿⣿⠀⢸⡇⠀⠀⠀⢸⡇⠀⣿⣿⣿⣿⣧⠀⢹⡇⠀⠀⠙⣿⡆⠀⠀⠀⠀
            ⠀⠀⠀⠀⠀⢸⡏⠀⠀⠀⠘⣧⠀⠘⣿⣿⣿⡟⠀⣸⠇⠀⣀⣤⢾⣇⠀⠹⣿⣿⣿⠇⠀⣾⠁⠀⠀⠀⢸⣿⠀⠀⠀⠀
            ⠀⠀⠀⠀⠀⢸⣷⠀⠀⠀⠀⠹⣧⡀⠈⠉⠁⢀⣴⠿⠞⠋⠉⠀⠀⠻⣦⡀⠈⠉⠁⣠⡾⠃⠀⠀⠀⠀⣾⡏⠀⠀⠀⠀
            ⠀⠀⢀⣠⣶⠿⠛⠛⠛⠛⠛⠛⠉⠙⠛⠒⠛⠋⠁⠀⠀⠀⠀⠀⠀⠀⠈⠙⠛⠚⠛⠉⠀⠀⠀⠀⢀⡼⠿⢷⣦⣄⠀⠀
            ⠀⣠⡿⠋⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣟⠛⠛⠒⠶⠶⠶⠶⠶⠶⠶⠖⠚⠛⢛⡷⠀⠀⠀⣀⡴⠋⠀⠀⠀⠈⠻⣷⡄
            ⢰⣿⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⢷⣄⡀⠀⠀⠀⠀⠀⠀⠀⢀⣠⡶⠛⢁⣠⡴⠞⠋⠀⠀⠀⠀⠀⠀⠀⠘⣿
            ⢸⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠙⠓⠶⠶⠦⠶⠶⣚⣫⡥⠶⠚⠋⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣿
            ⠈⢿⣆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣀⣤⡤⠴⠖⠚⠛⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣴⡿⠃
            ⠀⠈⠛⣷⣦⣤⣤⣤⣤⣤⣤⣶⡶⠾⠿⠟⠿⠿⠿⠶⣶⣶⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣶⠶⠿⠛⠉⠀⠀
            """;
    private final static String BUG = """
            ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
            ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
            ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡀⠀⠀⠀⠀⢸⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
            ⠀⠀⠀⠀⠀⠀⠀⠀⣤⡀⠀⣰⣿⣶⣄⠀⠀⣾⠃⠀⠀⠀⣶⠀⠀⠀⠀⠀⠀⠀
            ⠀⠀⡀⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⣶⣶⣿⣤⡀⠀⠀⣹⡇⠀⠀⠀⠀⠀⠀
            ⠀⠈⠻⣦⡀⠀⠀⠀⢻⣿⣿⡿⠛⠛⢻⣿⡟⠉⠉⠻⣷⣴⠟⠀⠀⠀⠀⠀⠀⠀
            ⠀⠀⠀⠈⠿⣦⣤⣤⣾⣿⣿⣇⣀⣠⣾⣿⣷⣀⢀⣠⣿⣿⡄⠀⠀⠀⠀⠀⠀⠀            #######                                 #
            ⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⠿⠻⢿⣿⣿⣿⣿⣿⣿⣿⣇⢈⣿⠀⠀⠀⠀⠀⠀⠀            #       #####  #####   ####  #####     ###
            ⠀⠀⠀⣤⡀⠀⠀⢸⣿⣏⠀⠀⠈⣿⣿⣿⣿⣿⠟⠉⠙⢿⣿⣀⣀⣀⡀⠀⠀⠀            #       #    # #    # #    # #    #    ###
            ⠀⠀⠀⠈⠙⠷⠤⠼⢿⣿⣦⣤⣴⠟⠋⠛⢿⣿⣄⠀⣀⣾⠏⠉⠉⠉⠙⠳⠀⠀            #       #    # #    # #    # #    #    ###
            ⠀⠀⠀⠀⠀⠀⠀⠀⠈⠻⣇⣘⣧⡀⠀⠀⣸⣿⣿⣿⡿⠋⠀⠀⠀⠀⠀⠀⠀⠀            #####   #    # #    # #    # #    #     #
            ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢈⡿⠿⣿⣿⣿⣧⡤⠜⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀            #       #####  #####  #    # #####
            ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣼⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀            #       #   #  #   #  #    # #   #      #
            ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀            ####### #    # #    #  ####  #    #     #
            """;
    private final static String ERROR_SIGN = """
                    #######
                    #       #####  #####   ####  #####
                    #       #    # #    # #    # #    #
                    #####   #    # #    # #    # #    #
                    #       #####  #####  #    # #####
                    #       #   #  #   #  #    # #   #
                    ####### #    # #    #  ####  #    #
        """;
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
    }

    public List<String> getEvaluationResult(List<Stmt> stmts) {
        List<String> evaluations = new ArrayList<>();
        stmtList = stmts.stream().filter(Objects::nonNull).collect(Collectors.toList());
        for (Stmt stmt : stmtList) {
            if (stmt instanceof Assignment ass) {
                var res = getEval(ass.value);
                boolean success = false;
                if (isDeclared(ass.name)) throwError("Variable: " + ass.name + " is already defined", ass);
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
                    throwError("Error while assigning variable: " + ass.name + " of type: " + ass.type +
                            " to value: " + ass.value, ass);
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
                        done = true;
                    } else if (scope.valuesFloat.containsKey(name)) {
                        scope.valuesFloat.put(name, (Float) res);
                        done = true;
                    } else if (scope.valuesString.containsKey(name)) {
                        scope.valuesString.put(name, (String) res);
                        done = true;
                    } else if (scope.valuesBoolean.containsKey(name)) {
                        scope.valuesBoolean.put(name, (Integer) res);
                        done = true;
                    }
                    idx--;
                }

                if (idx < 0 && !done) {
                    throwError("The variable: " + name + " is not declared", reAssignment);
                }

            } else if (stmt instanceof ScopeBlock scopeBlock) {
                vars.add(new VariableHolder());
                evaluations.addAll(getEvaluationResult(scopeBlock.getStmts()));
                vars.removeLast();
            } else if (stmt instanceof Condition condition) {
                vars.add(new VariableHolder());
                List<Stmt> conditionBlocks = condition.getConditionBlocks();
                Stmt blockToEvaluate = null;
                for (Stmt block : conditionBlocks) {
                    Object res = getEval(block);
                    if (res != null) {
                        blockToEvaluate = block;
                        break;
                    }
                }

                if (blockToEvaluate == null) {
                    blockToEvaluate = condition.getElseBlock();
                }

                evaluations.addAll(getEvaluationResult(List.of(blockToEvaluate)));
                vars.removeLast();
            } else if (stmt instanceof Block block) {
                vars.add(new VariableHolder());
                evaluations.addAll(getEvaluationResult(block.getStmts()));
                vars.removeLast();
            } else if (stmt instanceof ConditionBlock conditionBlock) {
                vars.add(new VariableHolder());
                evaluations.addAll(getEvaluationResult(List.of(conditionBlock.getBlock())));
                vars.removeLast();
            } else if (stmt instanceof Whilee whilee) {
                vars.add(new VariableHolder());
                Stmt block = whilee.getBlock();
                while(true) {
                    Object res = getEval(block);
                    if (res == null) {
                        break;
                    }
                    evaluations.addAll(getEvaluationResult(List.of(block)));
                }
                vars.removeLast();
            }  else {
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
//            if (idx < 0) throw new RuntimeException("Trying to access scope that doesn't exist!");
            if (idx < 0) throwError("Trying to access scope that doesn't exist!", var);
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
                throwError("Error while performing addition! Types dont match", add);
//                throw new RuntimeException("Error while performing addition! Types dont match");
            }

        } else if (stmt instanceof Multiplication mul) {
            var left = getEval(mul.left);
            var right = getEval(mul.right);
            if (left instanceof Float && right instanceof Float) {
                res = (Float) left * (Float) right;
            } else if (left instanceof Integer && right instanceof Integer) {
                res = (Integer) left * (Integer) right;
            } else {
                throwError("Error while performing multiplication! Types dont match", mul);
            }

        } else if (stmt instanceof Subtraction sub) {
            var left = getEval(sub.left);
            var right = getEval(sub.right);
            if (left instanceof Float && right instanceof Float) {
                res = (Float) left - (Float) right;
            } else if (left instanceof Integer && right instanceof Integer) {
                res = (Integer) left - (Integer) right;
            } else {
                throwError("Error while performing subtraction! Types dont match", sub);
            }
        } else if (stmt instanceof Division div) {
            var left = getEval(div.left);
            var right = getEval(div.right);
            if (left instanceof Float && right instanceof Float) {
                res = (Float) left / (Float) right;
            } else if (left instanceof Integer && right instanceof Integer) {
                res = (Integer) left / (Integer) right;
            } else {
                throwError("Error while performing division! Types dont match", div);
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
                throwError("Error while comparing variables: variables are not of the same type", gt);
            }

        } else if (stmt instanceof Lt lt) {
            var left =  getEval(lt.left);
            var right =  getEval(lt.right);
            if (left instanceof Float && right instanceof Float) {
                res = (float) left < (float) right ? 1 : 0;
            } else if (left instanceof  Integer && right instanceof  Integer) {
                res = (int)left < (int)right ? 1 : 0;
            } else {
                throwError("Error while comparing variables: variables are not of the same type", lt);
            }

        } else if (stmt instanceof Let let) {
            var left = getEval(let.left);
            var right = getEval(let.right);
            if (left instanceof Float && right instanceof Float) {
                res = (float) left <= (float) right ? 1 : 0;
            } else if (left instanceof  Integer && right instanceof  Integer) {
                res = (int)left <= (int)right ? 1 : 0;
            } else {
                throwError("Error while comparing variables: variables are not of the same type", let);
            }

        } else if (stmt instanceof Get get) {
            var left =  getEval(get.left);
            var right =  getEval(get.right);
            if (left instanceof Float && right instanceof Float) {
                res = (float) left >= (float) right ? 1 : 0;
            } else if (left instanceof  Integer && right instanceof  Integer) {
                res = (int)left >= (int)right ? 1 : 0;
            } else {
                throwError("Error while comparing variables: variables are not of the same type", get);
            }
        } else if (stmt instanceof Eq eq) {
            var left = (int)getEval(eq.left);
            var right = (int)getEval(eq.right);
            res = left == right ? 1 : 0;
        } else if (stmt instanceof Neq neq) {
            var left =(int) getEval(neq.left);
            var right = (int)getEval(neq.right);
            res = left != right ? 1 : 0;
        } else if (stmt instanceof FloatNumber floatNumber) {
            res = floatNumber.number;
        } else if (stmt instanceof  Striing str) {
            res = str.value;
        } else if (stmt instanceof ConditionBlock conditionBlock) {
            var doIt = (int) getEval(conditionBlock.getLogicalExpression());
            res = (doIt == 1) ? conditionBlock.getBlock() : null;
        }

        return res;
    }

    private boolean isDeclared(String name) {
        VariableHolder holder = vars.getLast();
        return holder.valuesInt.containsKey(name) || holder.valuesFloat.containsKey(name)
                || holder.valuesString.containsKey(name) || holder.valuesBoolean.containsKey(name);
    }

    private void throwError(String msg, Stmt stmt) {
        StringBuilder builder = new StringBuilder();
        builder.append("=".repeat(89));
        System.err.println("+" + builder.toString() + "+");
        System.err.println(BUG);
        System.err.println("+" + builder.toString() + "+");
        System.err.println("||  " + "Error encountered in line: " + stmt.getLine() + " position: " + stmt.getColumn());
        System.err.println("||  Message:  " + msg);
        System.err.println("+=============----- --- -");
        System.exit(1);
    }
}
