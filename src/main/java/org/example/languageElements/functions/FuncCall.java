package org.example.languageElements.functions;

import org.example.languageElements.Stmt;
import org.example.languageElements.Variable;
import org.example.utils.Types;

import java.util.List;

public class FuncCall extends Stmt {

    String funcName;
    List<Stmt> args;


    public FuncCall(String funcName, List<Stmt> args) {
        this.funcName = funcName;
        this.args = args;
    }

    public String getFuncName() {
        return funcName;
    }

    public List<Stmt> getArgs() {
        return args;
    }

    @Override
    public String toString() {
        return "FuncCall:" +
                "funcName:" + funcName +
                " args:" + args;
    }
}
