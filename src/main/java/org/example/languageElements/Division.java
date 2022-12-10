package org.example.languageElements;

public class Division extends Stmt {
    Stmt left;
    Stmt right;

    public Division(Stmt left, Stmt right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return left.toString() + " / " + right.toString();
    }
}

