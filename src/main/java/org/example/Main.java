package org.example;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.example.languageElements.AntlrToFIleInput;
import org.example.languageElements.FileInput;
import org.example.languageElements.StmtProcessor;

import java.io.IOException;


//TODO Sprawdzanie typów
//TODO nie można przerzucać na C
//TODO rejestry na zmienne
//TODO errory
//TODO scope'y
public class Main {

    public static void main(String[] args) throws IOException {
        try {
            String source = "src/test/java/compare/comparionTest2.cmm";

            Python3Parser parser = getParser(source);
            ParseTree antlrTree = parser.file_input();


            AntlrToFIleInput fIleInputVisitor = new AntlrToFIleInput();
            FileInput file = fIleInputVisitor.visit(antlrTree);

            if (fIleInputVisitor.semanticErrors.size() != 0) {
                for (String err: fIleInputVisitor.semanticErrors) {
                    System.err.println(err);
                }
            } else {
                StmtProcessor sp = new StmtProcessor(file.stmts);
                for (String ev : sp.getEvaluationResult()) {
                    System.out.println(ev);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static Python3Parser getParser(String filename) throws IOException {
        Python3Parser parser = null;
        CharStream charStream = CharStreams.fromFileName(filename);
        Python3Lexer lexer = new Python3Lexer(charStream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        parser = new Python3Parser(tokenStream);
        return parser;
    }
}
