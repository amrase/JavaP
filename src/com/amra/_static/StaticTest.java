package com.amra._static;

public class StaticTest {
    private static int numInstances = 0;
    private String name;
    public StaticTest(String name){
        this.name = name;
        numInstances++;
    }

    public String getName() {
        return name;
    }

    public int getNumInstances() {
        return numInstances;
    }
}
