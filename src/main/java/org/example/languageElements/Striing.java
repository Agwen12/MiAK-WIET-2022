package org.example.languageElements;

public class Striing extends Stmt {

    String value;

    public Striing(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
