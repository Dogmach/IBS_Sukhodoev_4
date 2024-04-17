package org.example.operations;

public class Multiply implements MathOperations {

    @Override
    public double result(double a, double b) {
        return a * b;
    }

    public Multiply() {
        System.out.println("Рассчёт произведен успешно.");
    }
}