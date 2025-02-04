package NivelBasico.Condicoes;

public class Ternarios {
    public static void main(String[] args) {

    /*
    * Como faz:
    * variavel = (condicao) ? valorSeVerdadeiro : valorSeFalso
    * */

        short numeroMissoes = 11;
        String nivelNinja = (numeroMissoes >= 10) ? "Esse ninja está com mais de 10 missões" : "Esse ninja tem menos de 10 missões";
        System.out.println(nivelNinja);



    }
}
