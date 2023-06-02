package app;

import calc.Calculator;
import java.util.Scanner;

public class App {
    public static void main(final String[] args) throws Exception {

        final Calculator calculator = new Calculator();

    
        try (Scanner scanner = new Scanner(System.in)) {
            {
                System.out.print("Geben Sie die erste Zahl ein: ");
                int firstValue = scanner.nextInt();

                System.out.print("Geben Sie den Operator ein (+, -, *, /): ");
                String operator = scanner.next();

                System.out.print("Geben Sie die zweite Zahl ein: ");
                int secondValue = scanner.nextInt();

                double result = calculator.Calc(firstValue, operator, secondValue);

                System.out.println("Ergebnis: " + result);
   }
        }
}}
