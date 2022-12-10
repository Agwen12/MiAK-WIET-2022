package org.example;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class OurFileWriter {

    public final String output;
    private final List<String> dataLines = new LinkedList<>();
    BufferedWriter writer;

    public OurFileWriter(String outputFile) throws IOException {
        this.output = outputFile;
        this.writer = new BufferedWriter(new FileWriter(output));
    }

    public void addData(String line) {
        try {
            writer.write(line + "\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void addDataToRow(String str) {
        try {
            writer.write(str);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void writeToFile() {
        try {
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
//        try {
//            BufferedWriter writer = new BufferedWriter(new FileWriter(output));
//            for (String row : this.dataLines) {
//                writer.write(row + "\n");
//            }
//            writer.close();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
    }
}
