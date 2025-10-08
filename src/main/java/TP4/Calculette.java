package TP4;

import java.util.Stack;

public class Calculette {
    private Stack<Double> pile = new Stack<>();

    public void push(double valeur) {
        pile.push(valeur);
    }

    public void addition() {
        pile.push(pile.pop() + pile.pop());
    }

    public void soustraction() {
        double b = pile.pop();
        double a = pile.pop();
        pile.push(a - b);
    }

    public void multiplication() {
        pile.push(pile.pop() * pile.pop());
    }

    public void division() {
        double b = pile.pop();
        double a = pile.pop();
        if (b == 0) throw new ArithmeticException("Division par zéro");
        pile.push(a / b);
    }

    public double resultat() {
        return pile.peek();
    }

    // 👉 Méthode à ajouter ici :
    public double evaluer(String expression) {
        String[] tokens = expression.split(" ");
        for (String token : tokens) {
            switch (token) {
                case "+":
                    addition();
                    break;
                case "-":
                    soustraction();
                    break;
                case "*":
                    multiplication();
                    break;
                case "/":
                    division();
                    break;
                default:
                    pile.push(Double.parseDouble(token));
            }
        }
        return resultat();
    }
}
