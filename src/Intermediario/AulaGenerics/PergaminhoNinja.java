package Intermediario.AulaGenerics;

public class PergaminhoNinja {
    private String pergaminho;

    public PergaminhoNinja(String conteudo) {
        this.pergaminho = conteudo;
    }

    public String getPergaminho() {
        return pergaminho;
    }

    public void setPergaminho(String pergaminho) {
        this.pergaminho = pergaminho;
    }

    @Override
    public String toString() {
        return "Tipo de Pergaminho: " + pergaminho;
    }
}
