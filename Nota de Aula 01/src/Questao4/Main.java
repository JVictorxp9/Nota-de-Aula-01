package Questao4;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    ContaBancaria minhaConta = new ContaBancaria();
    ContaBancaria contaDestino = new ContaBancaria();

    int opcao;
        do {
        System.out.println("\n1 - Consultar saldo");
        System.out.println("2 - Depositar");
        System.out.println("3 - Sacar");
        System.out.println("4 - Transferir");
        System.out.println("0 - Sair");
        System.out.print("Escolha uma opção: ");
        opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Saldo atual: R$" + minhaConta.getSaldo());
                break;
            case 2:
                System.out.print("Valor para depósito: ");
                double deposito = sc.nextDouble();
                minhaConta.depositar(deposito);
                break;
            case 3:
                System.out.print("Valor para saque: ");
                double saque = sc.nextDouble();
                minhaConta.sacar(saque);
                break;
            case 4:
                System.out.print("Valor para transferência: ");
                double transferencia = sc.nextDouble();
                minhaConta.transferir(contaDestino, transferencia);
                break;
            case 0:
                System.out.println("Saindo do sistema bancário...");
                break;
            default:
                System.out.println("Opção inválida! Tente novamente.");
        }
    } while (opcao != 0);

        sc.close();
}
}


