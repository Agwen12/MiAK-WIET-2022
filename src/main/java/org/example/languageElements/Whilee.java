package org.example.languageElements;

public class Whilee extends Stmt{

    Stmt block;

    public Whilee(Stmt block) {
        this.block = block;
    }

    public Stmt getBlock() {
        return block;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
