package NivelBasico;

public class Array {
    public static void main(String[] args) {

        // Arrays são tipo REFERÊNCIA!
        // São fixos!
        String[] ninja = new String[5];
        ninja[0] = "Naruto Uzumaki";
        ninja[1] = "Sasuke Uchiha";
        ninja[2] = "Sakura Haruno";
        ninja[3] = "Hinata Hyuuga";
        ninja[4] = "Kakashi Hatake";
        System.out.println(ninja[0]);

        for (int i = 0; i < ninja.length; i++) {
            System.out.println(ninja[i]);
        }

/*

        // Redeclarar o Array == sobrescrever o espaço anterior
        ninja = new String[7];
        ninja[0] = "Hashirama Senju";
        ninja[1] = "Tobirama Senju";
        ninja[2] = "Hiruzen Sarutobi";
        ninja[3] = "Minato Namikaze";
        ninja[4] = "Tsunade";
        ninja[5] = "Kakashi Hatake";
        ninja[6] = "Naruto Uzumaki";
        //System.out.println(ninja[2]);

        // For para fazer um loop no Array
        for (int i = 0; i < 7; i++) {
            System.out.println(ninja[i]);
        }

        int[] idade = new int[3];
        idade[0] = 16;
        idade[1] = 16;
        System.out.println(idade[0]);
*/

    }
}
