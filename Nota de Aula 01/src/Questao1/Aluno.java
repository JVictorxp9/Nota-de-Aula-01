package Questao1;
    import java.util.Scanner;

    public class Aluno {

        String nome;
        double nota1, nota2, nota3;


        public Aluno(String nome, double nota1, double nota2, double nota3) {
            this.nome = nome;
            this.nota1 = nota1;
            this.nota2 = nota2;
            this.nota3 = nota3;
        }

        public double calcularMedia() {
            return (nota1 + nota2 + nota3) / 3;
        }

        public String verificarSituacao() {
            double media = calcularMedia();
            if (media >= 70) {
                return "Parabéns o aluno está aprovado! >-<";
            } else if (media < 40) {
                return "O aluno está reprovado!";
            } else {
                return "O aluno está na final";
            }
        }
    }