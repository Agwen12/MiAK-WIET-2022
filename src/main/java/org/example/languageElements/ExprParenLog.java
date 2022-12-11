package org.example.languageElements;

public class ExprParenLog extends Stmt {

    Stmt inner;

    public ExprParenLog(Stmt inner) {
        this.inner = inner;
    }

    @Override
    public String toString() {
        return "(" + inner + ")";
    }
}
