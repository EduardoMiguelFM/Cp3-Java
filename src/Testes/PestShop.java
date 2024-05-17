package Testes;
import Enums.Categoria;
import Models.*;
import java.util.ArrayList;
import java.util.Scanner;

public class PestShop {
    public static void main(String[] args) {
        ArrayList<Produtos> produtos = new ArrayList<>();
        produtos.add(new Produtos("Ração para Cachorro", 50.0, Categoria.PASSAROS));
        produtos.add(new Produtos("Areia para Gato", 20.0, Categoria.PASSAROS));
        produtos.add(new Produtos("Gaiola para Pássaros", 98.90, Categoria.PASSAROS));
        produtos.add(new Produtos("Bola de Borracha para Cachorro", 15.99, Categoria.CACHORROS));
        produtos.add(new Produtos("Arranhador para Gato", 29.99, Categoria.GATOS));
        produtos.add(new Produtos("Espelho para Pássaros", 10.0, Categoria.PASSAROS));

        System.out.println("Bem-vindo ao Pet Shop!");
        System.out.println("-------MENU DE PRODUTOS-------" +
                "\n1-Ração para Cachorro" +
                "\n2-Areia para Gato" +
                "\n3-Gaiola para Pássaros" +
                "\n4-Bola de Borracha para Cachorro" +
                "\n5-Arranhador para Gato" +
                "\n6-Espelho para Pássaros");



        //carrinho para o cliente
        Carrinho carrinho = new Carrinho();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Selecione o número do produto que deseja adicionar ao carrinho (ou 0 para sair):");
            int escolha = scanner.nextInt();
            if (escolha == 0) {
                break;
            } else if (escolha < 1 || escolha > produtos.size()) {
                System.out.println("Escolha inválida! Tente novamente.");
                continue;
            }
            Produtos produtoSelecionado = produtos.get(escolha - 1);
            carrinho.adicionarItem(produtoSelecionado);
            System.out.println(produtoSelecionado.getNome() + " adicionado ao carrinho!");
        }


        for (int i = 0; i < produtos.size(); i++) {
            System.out.println((i + 1) + ". " + produtos.get(i));

            // exibindo conteudo do carrinho
            System.out.println("\nConteúdo do Carrinho:");
            carrinho.exibirConteudo();
        }

        }
    }

