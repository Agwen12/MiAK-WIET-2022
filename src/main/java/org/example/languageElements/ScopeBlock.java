package org.example.languageElements;

import java.util.List;

public class ScopeBlock extends Stmt {

    String name;
    List<Stmt> stmts;

    public ScopeBlock(String name, List<Stmt> stmts) {
        this.name = name;
        this.stmts = stmts;
    }

    void addStmt(Stmt stmt) {
        stmts.add(stmt);
    }

    public List<Stmt> getStmts() {
        return stmts;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
