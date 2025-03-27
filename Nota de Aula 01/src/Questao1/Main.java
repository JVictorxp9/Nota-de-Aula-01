package Questao1;

import java.util.Scanner;

class Questao1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Cadastro do Aluno");
        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Informe a primeira nota: ");
        double nota1 = sc.nextDouble();
        System.out.print("Informe a segunda nota: ");
        double nota2 = sc.nextDouble();
        System.out.print("Infome a terceira nota: ");
        double nota3 = sc.nextDouble();


        Aluno aluno = new Aluno(nome, nota1, nota2, nota3);


        System.out.println("Aluno: " + aluno.nome);
        System.out.println("Média: " + aluno.calcularMedia());
        System.out.println("Situação: " + aluno.verificarSituacao());
        System.out.println("Obrigado por usar o programa! :)");

        sc.close();
    }
}

