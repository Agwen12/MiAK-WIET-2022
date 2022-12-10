package org.example.languageElements;

public class Multiplication extends Stmt {
    Stmt left;
    Stmt right;

    public Multiplication(Stmt left, Stmt right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return left.toString() + " * " + right.toString();
    }
}
