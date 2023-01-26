package org.example.languageElements;

import java.util.List;

public class Condition extends Stmt {

    List<Stmt> conditionBlocks;
    Stmt elseBlock;

    public Condition(List<Stmt> conditionBlocks, Stmt elseBlock) {
        this.conditionBlocks = conditionBlocks;
        this.elseBlock = elseBlock;
    }

    public List<Stmt> getConditionBlocks() {
        return conditionBlocks;
    }

    public Stmt getElseBlock() {
        return elseBlock;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
