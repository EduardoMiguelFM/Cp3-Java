package Models;

public class Cachorro extends Pets {
    private String raca;
    private int idade;

    public Cachorro(String nome, String raca, int idade) {
        super(nome);
        this.raca = raca;
        this.idade = idade;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Raça: " + raca);
        System.out.println("Idade: " + idade + " anos");
    }
}