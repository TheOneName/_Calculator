package calc;
public class Calculator {

    
    public double Calc(final int firstValue, final String operator, final int secondValue) {
        double result = 0;

        switch (operator) {
            case "+":
                result = firstValue + secondValue;
                break;
            case "-":
                result = firstValue - secondValue;
                break;
            case "*":
                result = firstValue * secondValue;
                break;
            case "/":
                result = (double) firstValue / secondValue;
        }

        return result;
    }
}
     /**
     * Berechnet abhängig vom Operator das Ergebnis
     *
     * @param firstValue  Erste Zahl
     * @param operator    '+', '-', '*' und '/' sind erlaubte Operatoren
     * @param secondValue Zweite Zahl
     * @return
     *   operator '+': Die Summe von erster und zweiter Zahl
     *   operator '-': Die Differenz von erster und zweiter Zahl
     *   operator '*': Das Produkt von erster und zweiter Zahl
     *   operator '/': Der Quotient von erster und zweiter Zahl
     */
