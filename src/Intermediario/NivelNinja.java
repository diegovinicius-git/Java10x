package Intermediario;

// Cada enum so pode fazer uma unica coisa
public enum NivelNinja {
    GENIN("Nível Baixo", 2),
    CHUUNIN("Nível Moderado", 4),
    JOUNNIN("Nível Alto", 6),
    KAGE("Nível Altíssimo", 10);

    private String descricao;
    private int dificuldade;

    NivelNinja(String descricao, int dificuldade) {
        this.descricao = descricao;
        this.dificuldade = dificuldade;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getDificuldade() {
        return dificuldade;
    }
}
