package Models;
import Enums.Categoria;
public class Produtos {
    private String nome;
    private double preco;

    private Categoria categoria;

    public Produtos(String nome, double preco, Categoria passaros) {
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Preço: R$" + preco + ", Categoria:" + categoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
