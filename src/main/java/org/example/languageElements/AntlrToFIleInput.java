package org.example.languageElements;

import org.antlr.v4.runtime.Lexer;
import org.example.Python3BaseVisitor;
import org.example.Python3Parser;

import java.util.LinkedList;
import java.util.List;

public class AntlrToFIleInput extends Python3BaseVisitor<FileInput> {

    public List<String> semanticErrors;

    @Override
    public FileInput visitFileInput(Python3Parser.FileInputContext ctx) {
        FileInput fileInput = new FileInput();

        semanticErrors = new LinkedList<>();
        AntlrToStmt visitor = new AntlrToStmt(semanticErrors);
        for (int i = 0; i < ctx.getChildCount(); i++) {
            if (i  == ctx.getChildCount() - 1) {
                System.out.println("LAST");
            } else {
                fileInput.addStmt(visitor.visit(ctx.getChild(i)));
            }
        }
        return fileInput;
    }
}
