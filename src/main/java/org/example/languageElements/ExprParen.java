package org.example.languageElements;

public class ExprParen extends Stmt {

    Stmt inner;

    public ExprParen(Stmt inner) {
        this.inner = inner;
    }

    @Override
    public String toString() {
        return "( " + inner + " )";
    }
}
