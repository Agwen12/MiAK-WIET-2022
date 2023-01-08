package org.example.languageElements;

public class FloatNumber extends Stmt {
    float number;

    public FloatNumber(float number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return String.valueOf(number);
    }
}
