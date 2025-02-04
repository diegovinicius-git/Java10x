package Desafio004;

import java.util.Arrays;

public class Main004 {
    public static void main(String[] args) {


        //Ninja 1
        NinjaAvancado Uzumaki = new NinjaAvancado("Naruto Uzumaki", 16, TipoHabilidade.NINJUTSU,
                "Hazengan");
        Uzumaki.mostrarInformacoes();
        Uzumaki.executarHabilidade();
    }
}
