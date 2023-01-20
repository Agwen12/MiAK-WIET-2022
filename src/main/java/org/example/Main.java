package org.example;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.example.languageElements.AntlrToFIleInput;
import org.example.languageElements.FileInput;
import org.example.languageElements.StmtProcessor;

import java.io.IOException;


//TODO errory
public class Main {

    public static void main(String[] args) throws IOException {
        try {
//            String source = "src/test/java/assignments/reAssignmentTest";
//            String source = "src/test/java/scopes/shadowingTest";
//            String source = "src/test/java/assignments/assignTypesTest";
            String source = "src/test/java/assignments/assignTypesFailTest";
//            String source = "src/test/java/assignments/unsuccessfulReassignmentTest";

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
                for (String ev : sp.getEvaluationResult(file.stmts)) {
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
