package com.example;

import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

public class Calculaterut {

    @Test
    public void testMainOutput() {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        try {
            Calculator.main(new String[] {});
        } finally {
            System.setOut(originalOut);
        }

        String result = out.toString();
        assertTrue(result.contains("Addition: 15"));
        assertTrue(result.contains("Subtraction: 5"));
        assertTrue(result.contains("Multiplication: 50"));
        assertTrue(result.contains("Division: 2.0"));
    }
}