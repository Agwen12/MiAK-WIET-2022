package org.example.languageElements;

public class Assignment extends Stmt {
    String type;
    String name;
    Stmt value;

    public Assignment(String type, String name, Stmt value) {
        this.type = type;
        this.name = name;
        this.value = value;
    }
}
