package Desafio003;

public class Uchiha extends NinjaDesafio {

    // Atributos - Uchiha
    String habilidadeEspecial;

    // Metodo da Habilidade Especial
    public void mostrarHabilidadeEspecial() {
        System.out.println("Habilidade Especial: " + habilidadeEspecial);
    }

    public void mostrarInformacoes() {
        System.out.println("Nome do ninja: " + nome);
        System.out.println("Idade do ninja: " + idade);
        System.out.println("Missão atual: " + missao);
        System.out.println("Nível de Dificuldade: " + nivelDificuldade);
        System.out.println("Status: " + statusMissao);
        System.out.println("Habilidade Especial Uchiha");
    }
}
