package org.example.languageElements.comparisons;

import org.example.languageElements.Stmt;

public class Not extends Stmt {

    public Stmt inner;

    public Not(Stmt inner) {
        this.inner = inner;
    }

    @Override
    public String toString() {
        return "!(" + inner + ")";
    }
}
