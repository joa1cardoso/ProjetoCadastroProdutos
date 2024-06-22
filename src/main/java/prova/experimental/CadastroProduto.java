package prova.experimental;

import java.util.List;
import java.util.Scanner;

public class CadastroProduto {

    private List<Produto> produtos;
    private Scanner scanner;

    public CadastroProduto(List<Produto> produtos, Scanner scanner) {
        this.produtos = produtos;
        this.scanner = scanner;
    }


    public void cadastrarProdutos(){
        System.out.println("Cadastro de Produtos");

        System.out.println("Nome do Produto: ");
        String nome = scanner.nextLine();

        System.out.println("Descrição do Produto: ");
        String descricao = scanner.nextLine();

        System.out.println("Valor do Produto: ");
        double valor = Double.parseDouble(scanner.nextLine());

        System.out.println("Disponível para venda (sim/não): ");
        boolean disponivel = scanner.nextLine().equalsIgnoreCase("sim");

        Produto produto = new Produto(nome, descricao, valor, disponivel);
        produtos.add(produto);

        System.out.println("Produto cadastrado com sucesso!");
    }
}
