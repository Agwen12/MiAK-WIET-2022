package org.example.languageElements.functions;

import org.example.languageElements.Stmt;
import org.example.languageElements.Variable;
import org.example.utils.Types;

import java.util.LinkedList;
import java.util.List;

public class Function extends Stmt {

    private final List<Variable> vars;
    private final String name;
    private final Types type;
    private final List<Stmt> body;

    public Function(String name, Types type, List<Variable> vars, List<Stmt> body) {
        this.name = name;
        this.type = type;
        this.body = body;
        this.vars = vars;
    }

    public List<Variable> getVars() {
        return vars;
    }

    public String getName() {
        return name;
    }

    public Types getType() {
        return type;
    }

    public List<Stmt> getBody() {
        return body;
    }



    @Override
    public String toString() {
        return "Function: " + name + " type: " + type + " vars: " + vars.toString()
                + " body: " + body.toString();
    }
}
