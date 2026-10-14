package com.example;

public class Calculator {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }

    public static void main(String[] args) {
        System.out.println("Add: " + add(10, 5));
        System.out.println("Subtract: " + subtract(10, 5));
        System.out.println("Multiply: " + multiply(10, 5));
        System.out.println("Divide: " + divide(10, 5));
    }
}