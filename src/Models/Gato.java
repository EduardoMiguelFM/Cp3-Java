package Models;

public class Gato extends Pets {
    private String raca;
    private boolean pelagemLonga;

    public Gato(String nome, String raca, boolean pelagemLonga) {
        super(nome);
        this.raca = raca;
        this.pelagemLonga = pelagemLonga;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Raça: " + raca);
        System.out.println("Pelagem longa: " + (pelagemLonga ? "Sim" : "Não"));
    }
}