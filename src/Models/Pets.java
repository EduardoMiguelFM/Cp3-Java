package Models;

public class Pets {
    private String nome;

    public Pets(String nome) {
        this.nome = nome;
    }

    public void exibirInfo() {
        System.out.println("Nome: " + nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
