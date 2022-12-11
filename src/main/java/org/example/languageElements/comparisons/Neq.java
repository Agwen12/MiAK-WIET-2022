package org.example.languageElements.comparisons;

import org.example.languageElements.Stmt;

public class Neq extends Stmt {
    public Stmt left;
    public Stmt right;

    public Neq(Stmt left, Stmt right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return left.toString() +  " != " + right.toString();
    }
}