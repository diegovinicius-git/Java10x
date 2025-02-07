package Intermediario;

public class Main {
    public static void main(String[] args) {


        System.out.println("---------------------- Naruto Uzumaki ----------------------");
        Uzumaki naruto = new Uzumaki("Naruto Uzumaki","Aldeia da Folha",16,15,NivelNinja.GENIN);
        System.out.println(naruto);
        naruto.estrategiaDeBatalhaNinja();

        System.out.println("---------------------- Sasuke Uchiha ----------------------");
        Uchiha sasuke = new Uchiha("Sasuke Uchiha", "Aldeia da Folha",18,20,
                NivelNinja.GENIN);
        sasuke.sharinganAtivado();
        sasuke.estrategiaDeBatalhaNinja();
        System.out.println(sasuke);

        System.out.println("---------------------- Itachi Uchiha ----------------------");
        Uchiha itachi = new Uchiha("Itachi Uchiha","Aldeia da Folha",27,50,NivelNinja.JOUNNIN);
        itachi.estrategiaDeBatalhaNinja();
        itachi.sharinganAtivado();
        System.out.println(itachi);

        // Aula de Enum
        Missoes missao1 = new Missoes("Reconhecimento da vila",NivelNinja.GENIN);
        missao1.exibirDetalhes();

        Missoes missao2 = new Missoes("Derrotar Zabuza",NivelNinja.JOUNNIN);
        missao2.exibirDetalhes();




    }
}
