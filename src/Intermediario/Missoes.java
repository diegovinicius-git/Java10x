package Intermediario;

public class Missoes {

    private String nome;
    private NivelNinja rank;

    // Metodo para mostrar mais informacoes
    public void exibirDetalhes() {
        System.out.println("Missão: " + nome + " | Rank: " + rank + " (Descrição: " + getRank().getDescricao() +
                " | Dificuldade: " + getRank().getDificuldade() + ")");
    }



    // Construtor
    public Missoes(String nome, NivelNinja rank) {
        this.nome = nome;
        this.rank = rank;
    }

    // Getters and Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public NivelNinja getRank() {
        return rank;
    }

    public void setRank(NivelNinja rank) {
        this.rank = rank;
    }
}
