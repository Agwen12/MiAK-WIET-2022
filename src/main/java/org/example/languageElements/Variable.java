package org.example.languageElements;

public class Variable extends Stmt {
    String name;
    String type;

    public Variable(String name) {
        this.name = name;
    }
    public Variable(String name, String type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String toString() {
        if (type != null) return "(" + type + "): " + name;
        return name;
    }
}
