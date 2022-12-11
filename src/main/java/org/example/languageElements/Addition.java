package org.example.languageElements;

public class Addition extends Stmt {
    Stmt left;
    Stmt right;

    public Addition(Stmt left, Stmt right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return left.toString() + " + " + right.toString();
    }
}
