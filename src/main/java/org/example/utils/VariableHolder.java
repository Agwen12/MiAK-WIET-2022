package org.example.utils;

import java.util.*;

public class VariableHolder {


    public Map<String, Integer> valuesInt;
    public Map<String, Float> valuesFloat;
    public Map<String, String> valuesString;
    public Map<String, Integer> valuesBoolean;


    public VariableHolder() {
        this.valuesInt = new HashMap<>();
        this.valuesFloat = new HashMap<>();
        this.valuesString = new HashMap<>();
        this.valuesBoolean = new HashMap<>();
    }
}
