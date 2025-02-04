package Desafio003;

public class NinjaDesafio {

    // Atributos da Classe
    String nome;
    String missao;
    String statusMissao;
    String nivelDificuldade;
    int idade;

    //Metodo - Informações
    public void mostrarInformacoes() {
        System.out.println("Nome do ninja: " + nome);
        System.out.println("Idade do ninja: " + idade);
        System.out.println("Missão atual: " + missao);
        System.out.println("Nível de Dificuldade: " + nivelDificuldade);
        System.out.println("Status: " + statusMissao);
    }


}
