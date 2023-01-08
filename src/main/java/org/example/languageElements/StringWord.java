package org.example.languageElements;

public class StringWord extends Stmt {
    String word;

    public StringWord(String word) {
        this.word = word;
    }

    @Override
    public String toString() {
        return word;
    }
}
