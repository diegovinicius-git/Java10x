package Intermediario;

public abstract class Ninja implements EstrategiaDeBatalha {

    //TODO: Incluir novos 2 atributos - numeroDeMissoesConcluidas, Rank
    //TODO: Rank: Gennin, Chunnin, Jounnin, Hokage

    String nome;
    String aldeia;
    int idade;
    int numeroDeMissoesConcluidas;
    NivelNinja rank;


    //Construtor vazio
    public Ninja() {

    }

    // Todo ninja vai fazer obrigatoriamente
    final void tacarKunai() {
        System.out.println("Eu sou um método da classe mãe");
    }

    //Metodo existente: primeiro metodo
    public Ninja(String nome, String aldeia, int idade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;

    }

    // TODO: Sobrecarga do construtor chamando os novos atributos
    // Sobrecarga de metodos não precisa redeclarar o construtor, so os novos atributos
    public Ninja(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank) {
        this(nome, aldeia, idade);
        this.numeroDeMissoesConcluidas = numeroDeMissoesConcluidas;
        this.rank = rank;
    }

    // Método geral que todos os Ninjas vão ter
    public void habilidadeEspecial() {
        System.out.println("Eu sou " + nome + ". Esta é minha habilidade especial. ");
    }

    // Sobrescrevendo o método da interface
    @Override
    public void estrategiaDeBatalhaNinja() {
        System.out.println("Esta é minha estratégia de combate!");
    }

    //Inteligência de Combate - metodo padrao
    public void inteligenciaDeCombate() {
        System.out.println("Meu nome é: " + nome + ". Essa é minha Inteligência de Combate.");
    }

    //Sobrecarga de Método - Inteligência de Combate
    public void inteligenciaDeCombate(int qi) {

        if (qi > 150) {
            System.out.println("Seu QI é: " + qi + " e você é um gênio");
        } else if (qi >= 130) {
            System.out.println("Seu QI é: " + qi + " e você é promissor");
        } else {
            System.out.println("Seu QI é: " + qi + " e você precisa treinar mais suas estratégias");
        }

    }

    // Metodo sem Override
    public void metodoProvisorio() {
        System.out.println("Teste");
    }

    @Override
    public String toString() {
        return "Meu nome é " + nome + ", eu sou da " + aldeia + " e tenho " + idade + " anos.";
    }






}
