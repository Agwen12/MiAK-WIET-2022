package org.example.languageElements;

public class ConditionBlock extends Stmt {

    Stmt logicalExpression;
    Stmt block;

    public ConditionBlock(Stmt logicalExpression, Stmt block) {
        this.logicalExpression = logicalExpression;
        this.block = block;
    }

    public Stmt getLogicalExpression() {
        return logicalExpression;
    }

    public Stmt getBlock() {
        return block;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
