package org.example.languageElements;

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
        }

        return res;
    }

}
