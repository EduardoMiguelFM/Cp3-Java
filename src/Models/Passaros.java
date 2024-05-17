package Models;

public class Passaros extends Pets {
    private String especie;
    private String cor;

    public Passaros(String nome, String especie, String cor) {
        super(nome);
        this.especie = especie;
        this.cor = cor;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Espécie: " + especie);
        System.out.println("Cor: " + cor);
    }
}