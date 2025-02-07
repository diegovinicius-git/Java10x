package Intermediario;

public class Uchiha extends Ninja implements SharinganInterface {


    // -Super- está aqui, porque a classe Uchicha é filha da classe Ninja
    public Uchiha() {
        super();
    }

    public Uchiha(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    public Uchiha(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank) {
        super(nome, aldeia, idade, numeroDeMissoesConcluidas, rank);
    }

    public void estrategiaDeBatalhaNinja() {
        System.out.println("Eu sou " + nome + ". Esta é minha estratégia de batalha!");
    }

    @Override
    public void habilidadeEspecial() {
        System.out.println("Eu sou um Uchiha e esta é minha habilidade especial, um ataque de fogo. E eu já completei "
                + numeroDeMissoesConcluidas + " missões.");
    }

    /*
    * Metodo:
    * Implementa da interface Sharingan
    * */
    @Override
    public void sharinganAtivado() {
        System.out.println(nome + ": Ativou o Sharingan");
    }

    @Override
    public void inteligenciaDeCombate() {
        System.out.println("Meu nome é: " + nome + ". Essa é minha Inteligência de Combate.");
    }

    @Override
    public void inteligenciaDeCombate(int qi) {

        if (qi > 150) {
            System.out.println("Seu QI é: " + qi + " e você é um gênio");
        } else if (qi >= 130) {
            System.out.println("Seu QI é: " + qi + " e você é promissor");
        } else {
            System.out.println("Seu QI é: " + qi + " e você precisa treinar mais suas estratégias");
        }

    }

    // Convenção em Java - Boa prática
    @Override
    public void metodoProvisorio () {
        System.out.println("Teste na classe Uchiha");
    }


}
