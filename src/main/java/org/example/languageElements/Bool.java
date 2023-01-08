package org.example.languageElements;

public class Bool extends Stmt {
    boolean value;

    public Bool(boolean value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
