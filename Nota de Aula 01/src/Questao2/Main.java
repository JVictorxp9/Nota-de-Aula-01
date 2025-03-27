/package Questao2;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Matematica mat = new Matematica();

            System.out.println("Escolha a operação:");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Divisão");
            System.out.println("4 - Multiplicação");
            System.out.print("Opção: ");
            int opcao = sc.nextInt();

            System.out.print("Informe o primeiro número: ");
            double num1 = sc.nextDouble();
            System.out.print("Informe o segundo número: ");
            double num2 = sc.nextDouble();

            double resultado = 0;
            switch (opcao) {
                case 1:
                    resultado = mat.soma(num1, num2);
                    System.out.println("Resultado da soma: " + resultado);
                    break;
                case 2:
                    resultado = mat.subtracao(num1, num2);
                    System.out.println("Resultado da subtração: " + resultado);
                    break;
                case 3:
                    resultado = mat.divisao(num1, num2);
                    System.out.println("Resultado da divisão: " + resultado);
                    break;
                case 4:
                    resultado = mat.multiplicacao(num1, num2);
                    System.out.println("Resultado da multiplicação: " + resultado);
                    break;
                default:
                    System.out.println("Opção inválida! Escolha um número de 1 a 4.");
            }

            System.out.println("Obrigado por usar a calculadora!>_< ");
            sc.close();
        }
    }



