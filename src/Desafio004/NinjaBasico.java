package Desafio004;

public class NinjaBasico implements Ninja {
    String nome;
    int idade;
    TipoHabilidade habilidade;

    public NinjaBasico(String nome, int idade, TipoHabilidade habilidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
    }

    public NinjaBasico() {

    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("Nome do Ninja: " + nome);
        System.out.println("Idade do Ninja: " + idade);

    }

    @Override
    public void executarHabilidade() {
        System.out.println("Especialidade do Ninja: " + habilidade);
    }



}
