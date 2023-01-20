package org.example.languageElements;

public class ReAssignment extends Stmt {

    String name;
    Stmt value;

    public ReAssignment(String name, Stmt value) {
        this.name = name;
        this.value = value;
    }
}
