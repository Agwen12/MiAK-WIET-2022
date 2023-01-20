package org.example.languageElements.exceptions;

public class VariableNotExistException extends RuntimeException {
    public VariableNotExistException(String msg) {
        super(msg);
    }
}
