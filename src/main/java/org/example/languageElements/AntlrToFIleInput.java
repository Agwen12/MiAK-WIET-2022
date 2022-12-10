package org.example.languageElements;

import org.example.Python3BaseVisitor;
import org.example.Python3Parser;

public class AntlrToFIleInput extends Python3BaseVisitor<FileInput> {
    @Override
    public FileInput visitFileInput(Python3Parser.FileInputContext ctx) {
        return super.visitFileInput(ctx);
    }
}
