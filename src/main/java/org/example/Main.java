package org.example;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;
import java.io.InputStreamReader;


//TODO Sprawdzanie typów
//TODO nie można przerzucać na C
//TODO rejestry na zmienne
//TODO errory
//TODO scope'y
public class Main {

    public static void main(String[] args) throws IOException {

        InputStreamReader a = new InputStreamReader(System.in);;
        CharStream input = CharStreams.fromReader(a);
        System.out.println("INPUT TO STRING:");
        System.out.println(input.toString());
// Get our lexer
        Python3Lexer lexer = new Python3Lexer(input);

// Get a list of matched tokens
        CommonTokenStream tokens = new CommonTokenStream(lexer);

// Pass the tokens to the parser
        Python3Parser parser = new Python3Parser(tokens);

        ParseTree tree = parser.file_input();
        System.out.println("TREE GET TEXT:");
        System.out.println(tree.getText());

// Specify our entry point
//        yourGrammarContext yourGrammarContext = yourGrammarRule.drinkSentence();

// Walk it and attach our listener
        ParseTreeWalker walker = new ParseTreeWalker();
        OurFileWriter ourFileWriter = new OurFileWriter("output.c");
        Python3Listener listener = new MyListener(ourFileWriter);
        walker.walk(listener, tree);

        ourFileWriter.writeToFile();
    }
}
