package org.example.languageElements;

public class Variable extends Stmt {
    String name;

    public Variable(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
