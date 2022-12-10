package org.example;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;


//TODO Sprawdzanie typów
//TODO nie można przerzucać na C
//TODO rejestry na zmienne
//TODO errory
//TODO scope'y
public class Main {

    public static void main(String[] args) throws IOException {
        try {
            String source = "source.cmm";
            CharStream charStream = CharStreams.fromFileName(source);
            Python3Lexer lexer = new Python3Lexer(charStream);
            CommonTokenStream tokenStream = new CommonTokenStream(lexer);
            Python3Parser parser = new Python3Parser(tokenStream);
            ParseTree tree = parser.single_input();


            MyVisitor<Object> visitor = new MyVisitor<>();
            visitor.visit(tree);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
