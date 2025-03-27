package Questao3;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void adicionarEstoque(int quantidade) {
        if (quantidade > 0) {
            this.quantidade += quantidade;
            System.out.println(quantidade + " unidades adicionadas ao estoque.");
        } else {
            System.out.println("Quantidade inválida para adicionar ao estoque!");
        }
    }

    public void venderProduto(int quantidade) {
        if (quantidade > 0 && quantidade <= this.quantidade) {
            this.quantidade -= quantidade;
            System.out.println(quantidade + " unidades vendidas.");
        } else {
            System.out.println("Quantidade inválida ou estoque insuficiente!");
        }
    }

    public void exibirEstoque() {
        System.out.println("Produto: " + nome);
        System.out.println("Preço: R$" + preco);
        System.out.println("Quantidade em estoque: " + quantidade);
    }
}


