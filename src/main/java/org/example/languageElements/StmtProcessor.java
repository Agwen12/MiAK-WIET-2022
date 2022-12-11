package org.example.languageElements;

import org.example.languageElements.comparisons.*;

import java.util.*;
import java.util.stream.Collectors;

public class StmtProcessor {

    public List<Stmt> stmtList;

    // TODO mapa z mapami do typów
    public Map<String, Integer> values; //symbol table used for storing values for variables


    public StmtProcessor(List<Stmt> stmtList) {
        this.stmtList = stmtList;
        this.values = new HashMap<>();
    }

    public List<String> getEvaluationResult() {
        List<String> evaluations = new ArrayList<>();
        stmtList = stmtList.stream().filter(Objects::nonNull).collect(Collectors.toList());
        for (Stmt stmt: stmtList) {
            if (stmt instanceof Assignment ass) {
                values.put(ass.name, getEval(ass.value));
                evaluations.add(ass.name + " declared with value: " + getEval(ass.value));
            } else {
                String input = stmt.toString();
                int res = getEval(stmt);
                evaluations.add(input + " is " + res);
            }
        }



        return evaluations;
    }

    // TODO reszta możliwości
    // chłop mówił coś o tym że można to bez castów robić visitor patternem ale ja już nie kminię jak

    private int getEval(Stmt stmt) {
        int res = 0;

        if (stmt instanceof Number num) {
            res = num.number;
        } else if (stmt instanceof Variable var) {
            res = values.get(var.name);
        } else if (stmt instanceof Addition add) {
            int left = getEval(add.left);
            int right = getEval(add.right);
            res = left + right;
        } else if (stmt instanceof Multiplication mul) {
            int left = getEval(mul.left);
            int right = getEval(mul.right);
            res = left * right;
        } else if (stmt instanceof Subtraction sub) {
            int left = getEval(sub.left);
            int right = getEval(sub.right);
            res = left - right;
        } else if (stmt instanceof Division div) {
            int left = getEval(div.left);
            int right = getEval(div.right);
            res = left / right;
        } else if (stmt instanceof ExprParen paren) {
            res = getEval(paren.inner);
        } else if (stmt instanceof Gt gt) {
            int left = getEval(gt.left);
            int right = getEval(gt.right);
            res = left > right ? 1 : 0;
        } else if (stmt instanceof Lt lt) {
            int left = getEval(lt.left);
            int right = getEval(lt.right);
            res = left < right ? 1 : 0;
        } else if (stmt instanceof Let let) {
            int left = getEval(let.left);
            int right = getEval(let.right);
            res = left <= right ? 1 : 0;
        } else if (stmt instanceof Get get) {
            int left = getEval(get.left);
            int right = getEval(get.right);
            res = left >= right ? 1 : 0;
        } else if (stmt instanceof Eq eq) {
            int left = getEval(eq.left);
            int right = getEval(eq.right);
            res = left == right ? 1 : 0;
        } else if (stmt instanceof Neq neq) {
            int left = getEval(neq.left);
            int right = getEval(neq.right);
            res = left != right ? 1 : 0;
        }

        return res;
    }

}
