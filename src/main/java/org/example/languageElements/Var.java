package org.example.languageElements;

public class Var<T> {

    T value;
    String type;

    public Var(T value, String type) {
        this.value = value;
        this.type = type;
    }

    public Var(T value) {
        this.value = value;
    }


    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Var{" +
                ", value=" + value +
                ", type='" + type + '\'' +
                '}';
    }
}
