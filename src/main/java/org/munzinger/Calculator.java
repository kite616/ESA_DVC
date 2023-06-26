package org.munzinger;
/**
 * Beispielklasse aus der zweiten Präsenz, wiederverwendet für ESA8.
 *
 * @author Maximilian Munzinger
 * @since 1.0
 */
public class Calculator {

    /**
     * Einstiegspunkt zu Beispielzwecken
     *
     * @param args Argumente, werden einfach wieder ausgegeben
     */
    public static void main(String[] args) {
        System.out.println("Ich bin ein Taschenrechner.");
        for (String arg : args) {
            System.out.println(arg);
        }
    }

    /**
     * Standard-Konstruktor ohne Parameter
     */
    public Calculator() {
    }

    /**
     * Addition
     *
     * @param a Erster Paramter
     * @param b Erster Paramter
     * @return Summe der beiden Parameter
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * Division
     *
     * @param a Erster Paramter
     * @param b Erster Paramter
     * @return Divisionsergebnis der beiden Parameter
     */
    public int div(int a, int b) {
        if(b==0){throw new IllegalArgumentException("Keine Null als Divident erlaubt.");}
        return a / b;
    }

    /**
     * Subtraktion
     *
     * @param a Erster Paramter
     * @param b Erster Paramter
     * @return Subtraktionsergebnis der beiden Parameter
     */
    public int sub(int a, int b) {
        return a - b;
    }

    /**
     * Multiplikation
     *
     * @param a Erster Paramter
     * @param b Erster Paramter
     * @return Multiplikationsergebnis der beiden Parameter
     */
    public int multi(int a, int b) {
        return a * b;
    }
}