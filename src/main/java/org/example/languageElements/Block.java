package org.example.languageElements;

import java.util.List;

public class Block extends Stmt {

    List<Stmt> stmts;

    public Block(List<Stmt> stmts) {
        this.stmts = stmts;
    }

    public List<Stmt> getStmts() {
        return stmts;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
