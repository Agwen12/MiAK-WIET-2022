package org.example.languageElements;

import java.util.ArrayList;
import java.util.List;

public class FileInput {

    public List<Stmt> stmts;

    public FileInput() {
        this.stmts = new ArrayList<>();
    }

    public void addStmt(Stmt stmt) {
        this.stmts.add(stmt);
    }

}
