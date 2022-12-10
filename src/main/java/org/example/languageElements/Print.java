package org.example.languageElements;

public class Print extends Stmt {
    Stmt content;

    public Print(Stmt content) {
        this.content = content;
    }
}
