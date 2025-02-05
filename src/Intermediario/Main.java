package Intermediario;

public class Main {
    public static void main(String[] args) {


        System.out.println("---------------------- Naruto Uzumaki ----------------------");
                Uzumaki naruto = new Uzumaki("Naruto Uzumaki","Aldeia da Folha",16,15,
                NivelNinja.GENIN);
        System.out.println(naruto);

        System.out.println("---------------------- Sasuke Uchiha ----------------------");
        Uchiha sasuke = new Uchiha("Sasuke Uchiha", "Aldeia da Folha",17,20,
                NivelNinja.GENIN);
        System.out.println(sasuke);

        Anbu ninjaAnbu = new Anbu("Sai",18,"Aldeia da Folha");


        // Aula de Enum
        Missoes missao1 = new Missoes("Reconhecimento da vila",NivelNinja.GENIN);
        missao1.exibirDetalhes();

        Missoes missao2 = new Missoes("Derrotar Zabuza",NivelNinja.JOUNNIN);
        missao2.exibirDetalhes();


    }
}
