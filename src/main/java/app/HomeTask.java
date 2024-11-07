package app;

import app.Modules.Calculator;

public class HomeTask {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(101, 89);

        double result = calculator.add();
        System.out.println("add = " + result);

        result = calculator.subtract();
        System.out.println("subtract = " + result);

        result = calculator.multiply();
        System.out.println("multiply = " + result);

        result = calculator.divide();
        System.out.printf("divide = %.2f", result);
    }
}
