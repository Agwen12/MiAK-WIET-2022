package org.example.languageElements.comparisons;

import org.example.languageElements.Stmt;

public class Get extends Stmt {
    public Stmt left;
    public Stmt right;

    public Get(Stmt left, Stmt right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return left.toString() +  " >= " + right.toString();
    }
}
