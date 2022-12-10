package org.example;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class OurFileWriter {

    public final String output;
    private final List<String> dataLines = new LinkedList<>();

    public OurFileWriter(String outputFile) {
        this.output = outputFile;
    }

    public void addData(String line) {
        dataLines.add(line);
    }

    public void addDataToRow(String str) {
        addData(dataLines.get(dataLines.size() - 1) + str);
    }

    public void writeToFile() {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(output));
            for (String row : this.dataLines) {
                writer.write(row + "\n");
            }
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
