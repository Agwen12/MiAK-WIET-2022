package org.example.languageElements;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.example.languageElements.exceptions.InvalidOperationException;

import javax.management.OperationsException;

public abstract class Stmt {

    private int line;
    private int column;
    boolean isSet = false;


    public int getLine() {
        return line;
    }

    public int getColumn() {
        return column;
    }

    public String getPositionString() {
        return "(" + line + ", " + column + ")";
    }

    public Stmt setPosition(Token token) {
        setPosition(token.getLine(), token.getCharPositionInLine() + 1);
        return this;
    }
    public Stmt setPosition(ParserRuleContext ctx) {
        Token token = ctx.start;
        setPosition(token.getLine(), token.getCharPositionInLine() + 1);
        return this;
    }

    public void setPosition(int line, int column) {
        if (!isSet) {
            this.line = line;
            this.column = column;
        } else {
            throw new RuntimeException("The position has already been set");
        }
    }
}
