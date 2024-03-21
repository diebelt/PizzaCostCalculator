package org.example;

import java.util.List;

public class Calculator {

    public static double sum(List<Double> numbers) {

        double sum = 0;

        for (int i = 0; i < numbers.size(); i++) {

            sum += numbers.get(i);

        }
        return sum;

    }
    public static int add(int a, int b) {
        return a + b;
    }
    public static double div (double a, double b){
        return a / b;
    }
    public static void main(String[] args) {
        List<Integer> numbers = null;

        System.out.println();
    }
}
