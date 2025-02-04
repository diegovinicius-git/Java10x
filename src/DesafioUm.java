public class DesafioUm {
    public static void main(String[] args) {

        //Ninja Naruto
        String nameNinja1 = "Naruto Uzumaki";
        int ageNinja1 = 14;

        String missionNameNinja1 = "Caça ao Pilantra";
        String  missionDificultNinja1 = "D";
        boolean missionStatusNinja1 = true;

        //Ninja Sasuke
        String nameNinja2 = "Sasuke Uchiha";
        int ageNinja2 = 14;

        String missionNameNinja2 = "Caça ao Pilantra";
        String missionDificultNinja2 = "D";
        boolean missionStatusNinja2 = true;

        //Ninja Kakashi
        String nameNinja3 = "Kakashi Hatake";
        int ageNinja3 = 32;

        String missionNameNinja3 = "Infiltração da Guarda";
        String missionDificultNinja3 = "A";
        boolean missionStatusNinja3 = false;


        //Dados - Naruto
        System.out.println("Informações do Ninja:");
        System.out.println("Nome: " + nameNinja1);
        System.out.println("Idade: " + ageNinja1);
        System.out.println("Nome da missão: " + missionNameNinja1);
        System.out.println("Dificuldade da missão: " + missionDificultNinja1);
        System.out.println("Status da missão: " + missionStatusNinja1);
        //Condição - Ninja pode concluir missão
        if (ageNinja1 <= 15 && missionDificultNinja1 == "B") {
            System.out.println("O ninja não pode concluir o nível da missão atual");
        } else {
            System.out.println("O ninja pode concluir a nível da missão");
        }
        System.out.println(" ");

        //Dados - Sasuke
        System.out.println("Informações do Ninja:");
        System.out.println("Nome: " + nameNinja2);
        System.out.println("Idade: " + ageNinja2);
        System.out.println("Nome da missão: " + missionNameNinja2);
        System.out.println("Dificuldade da missão: " + missionDificultNinja2);
        System.out.println("Status da missão: " + missionStatusNinja2);
                //Condição - Ninja pode concluir missão
        if (ageNinja2 <= 15 && missionDificultNinja2 == "B") {
            System.out.println("O ninja não pode concluir o nível da missão atual");
        } else {
            System.out.println("O ninja pode concluir a nível da missão");
        }
        System.out.println(" ");

        //Dados - Kakashi
        System.out.println("Informações do Ninja:");
        System.out.println("Nome: " + nameNinja3);
        System.out.println("Idade: " + ageNinja3);
        System.out.println("Nome da missão: " + missionNameNinja3);
        System.out.println("Dificuldade da missão: " + missionDificultNinja3);
        System.out.println("Status da missão: " + missionStatusNinja3);
        //Condição - Ninja pode concluir missão
        if (ageNinja3 <= 15 && missionDificultNinja3 == "B") {
            System.out.println("O ninja não pode concluir o nível da missão atual");
        } else {
            System.out.println("O ninja pode concluir a nível da missão");
        }
    }
}
