package NivelBasico.Condicoes;

public class IfElse {
    public static void main(String[] args) {

        // Ninja Naruto
        String nome = "Naruto Uzumaki";
        String rank;

        int idade = 16;
        boolean hokage = false;
        short numeroMissoes = 9;

        /*
         * if ( condicao) { resultado }
         * else if ( condicao) { resultado }
         * else { resultado caso nada seja verdadeiro }
         * */

        //Se(condição) {faça isso}
        if (numeroMissoes == 10 && idade > 15) {
            System.out.println("Rank: Chunnin");
        } else if (numeroMissoes >= 20) {
            System.out.println("Rank: Jounin");
        } else {
            System.out.println("Rank: Gennin");
        }
    }
}
