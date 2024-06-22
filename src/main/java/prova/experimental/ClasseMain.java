package prova.experimental;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClasseMain {
    public static void main(String[] args) {

        List<Produto> produtos = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        CadastroProduto cadastroProduto = new CadastroProduto(produtos, sc);
        ListagemProduto listagemProduto = new ListagemProduto(produtos);


        while(true){
            System.out.println("1. Cadastrar novo produto");
            System.out.println("2. Listar Produtos");
            System.out.println("3. Sair");
            System.out.println("Escolha uma opção: ");
            int opcao = Integer.parseInt(sc.nextLine());

            switch (opcao){
                case 1:
                    cadastroProduto.cadastrar();
                    listagemProduto.listar();
                    break;
                case 2:
                    listagemProduto.listar();
                    break;
                case 3:
                    System.out.println("Você saiu da tela de opções");
                    sc.close();
                    return;
                default:
                    System.out.println("Opção inválida.");

            }

        }


    }
}
