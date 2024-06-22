package prova.experimental;

import prova.experimental.Produto;

import java.util.List;

public class ListagemProduto {
    private List<Produto> produtos;

    public ListagemProduto(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public void listar() {
        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
            return;
        }


        for (int i = 0; i < produtos.size() - 1; i++) {
            for (int j = i + 1; j < produtos.size(); j++) {
                if (produtos.get(i).getValor() > produtos.get(j).getValor()) {
                    Produto temp = produtos.get(i);
                    produtos.set(i, produtos.get(j));
                    produtos.set(j, temp);
                }
            }
        }

        System.out.println("Listagem de Produtos:");
        for (Produto produto : produtos) {
            System.out.printf("Nome: %s, Descrição: %s, Valor: %.2f, Disponível: %s\n",
                    produto.getNome(), produto.getDescricao(), produto.getValor(), produto.isDisponivel() ? "Sim" : "Não");
        }
        System.out.println();

    }
}
