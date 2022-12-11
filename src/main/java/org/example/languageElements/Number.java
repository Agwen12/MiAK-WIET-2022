package org.example.languageElements;

public class Number extends Stmt {
    int number;

    public Number(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return String.valueOf(number);
    }
}
