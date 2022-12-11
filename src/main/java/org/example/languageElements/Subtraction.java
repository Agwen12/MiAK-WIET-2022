package org.example.languageElements;

public class Subtraction extends Stmt {
    Stmt left;
    Stmt right;

    public Subtraction(Stmt left, Stmt right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return left.toString() + " - " + right.toString();
    }
}

