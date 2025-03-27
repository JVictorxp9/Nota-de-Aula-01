package Questao3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome do produto: ");
        String nome = sc.nextLine();
        System.out.print("Preço do produto: ");
        double preco = sc.nextDouble();
        System.out.print("Quantidade inicial em estoque: ");
        int quantidade = sc.nextInt();

        Produto produto = new Produto(nome, preco, quantidade);

        int opcao;
        do {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Adicionar estoque");
            System.out.println("2 - Vender produto");
            System.out.println("3 - Exibir estoque");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Quantidade para adicionar: ");
                    int adicionar = sc.nextInt();
                    produto.adicionarEstoque(adicionar);
                    break;
                case 2:
                    System.out.print("Quantidade para vender: ");
                    int vender = sc.nextInt();
                    produto.venderProduto(vender);
                    break;
                case 3:
                    produto.exibirEstoque();
                    break;
                case 0:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 0);

        sc.close();
    }
}


