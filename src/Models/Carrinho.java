package Models;
import Models.*;
import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private ArrayList<Produtos> itens;

    public Carrinho() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(Produtos produto) {
        itens.add(produto);
    }

    public void exibirConteudo() {
        if (itens.isEmpty()) {
            System.out.println("O carrinho está vazio.");
        } else {
            for (Produtos item : itens) {
                System.out.println(item);
            }
        }
    }
}
