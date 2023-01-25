package org.example.languageElements;

public class Variable extends Stmt {
    String name;
    String type;


    boolean isShadowed = false;

    public Variable(String name) {
        this.name = name;
    }
    public Variable(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public Variable(String name, boolean isShadowed) {
        this.name = name;
        this.isShadowed = isShadowed;
    }

    @Override
    public String toString() {
        if (type != null) return "(" + type + "): " + name;
        if (isShadowed) return "@" + name;
        return name;
    }
}
