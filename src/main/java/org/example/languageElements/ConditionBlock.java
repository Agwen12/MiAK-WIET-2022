package org.example.languageElements;

public class ConditionBlock {

    Stmt logicalExpression;
    Stmt block;

    public ConditionBlock(Stmt logicalExpression, Stmt block) {
        this.logicalExpression = logicalExpression;
        this.block = block;
    }
}
