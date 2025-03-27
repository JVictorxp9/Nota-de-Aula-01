package Questao2;
import java.util.Scanner;
public class Matematica {

    public double soma(double a, double b) {
        return a + b;
    }

    public double subtracao(double a, double b) {
        return a - b;
    }

    public double divisao(double a, double b) {
        if (b == 0) {
            System.out.println("Não existe número dividido por zero!");
            return 0;
        }
        return a / b;
    }

    public double multiplicacao(double a, double b) {
        return a * b;
    }
}

