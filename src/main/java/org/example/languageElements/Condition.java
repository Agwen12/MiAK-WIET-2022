package org.example.languageElements;

import java.util.List;

public class Condition extends Stmt {

    List<Stmt> conditionBlocks;

    public Condition(List<Stmt> conditionBlocks) {
        this.conditionBlocks = conditionBlocks;
    }

    @Override
    public String toString() {
        return String.valueOf(conditionBlocks);
    }

}
