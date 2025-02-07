package Intermediario;

public class Uzumaki extends Ninja {

    public Uzumaki() {
    }

    public Uzumaki(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    public Uzumaki(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank) {
        super(nome, aldeia, idade, numeroDeMissoesConcluidas, rank);
    }

    @Override
    public void estrategiaDeBatalhaNinja() {
        System.out.println("Meu nome é " + nome + " e esse é meu Kage Bushin no Jutsu");
    }

}

