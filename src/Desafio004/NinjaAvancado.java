package Desafio004;

public class NinjaAvancado implements Ninja{

    String nome;
    int idade;
    TipoHabilidade habilidade;
    String especialidade;


    public NinjaAvancado(String nome, int idade, TipoHabilidade habilidade, String especialidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
        this.especialidade = especialidade;
    }

    public NinjaAvancado() {

    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("Nome do Ninja: " + nome);
        System.out.println("Idade do Ninja: " + idade);
        System.out.println("Especialidade do Ninja: " + especialidade);
    }

    @Override
    public void executarHabilidade() {
        System.out.println("Minha habilidade especial é " + habilidade);
    }


}
