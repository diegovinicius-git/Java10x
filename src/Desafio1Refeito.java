public class Desafio1Refeito {
    public static void main(String[] args) {

        //Ninja 1
        String nome = "Uzumaki Naruto";
        int idade = 12;

        String nomeMissao = "Caça ao bandido";
        String statusMissao = "Em andamento";
        char nivelMissao = 'D';

        //Condição da missão -- base na idade
        if (idade < 15) {
            if (nivelMissao == 'A' || nivelMissao == 'B') {
                statusMissao = "Não concluída, ninja é menor de idade.";
            } else {
                statusMissao = "Concluída!";
            }
        } else {
            statusMissao = "Concluída!";
        }

        System.out.println("-------------------------------------");

        System.out.println("Nome do Ninja: " + nome);
        System.out.println("Idade do Ninja: " + idade);
        System.out.println("Missão Atual: " + nomeMissao);
        System.out.println("Nível da Missão: " + nivelMissao);
        System.out.println("Status da Missão: " + statusMissao);

        System.out.println("-------------------------------------");

        //Ninja 2
        String nome2 = "Sasuke Uchiha";
        int idade2 = 9;

        String nomeMissao2 = "Reconhecimento ANBU";
        String statusMissao2 = "Em andamento";
        char nivelMissao2 = 'A';

        //Condição da missão -- base na idade
        if (idade2 < 15) {
            if (nivelMissao2 == 'A' || nivelMissao2 == 'B') {
                statusMissao2 = "Não concluída, ninja é menor de idade.";
            } else {
                statusMissao2 = "Concluída!";
            }
        } else {
            statusMissao2 = "Concluída!";
        }

        System.out.println("-------------------------------------");

        System.out.println("Nome do Ninja: " + nome2);
        System.out.println("Idade do Ninja: " + idade2);
        System.out.println("Missão Atual: " + nomeMissao2);
        System.out.println("Nível da Missão: " + nivelMissao2);
        System.out.println("Status da Missão: " + statusMissao2);

        System.out.println("-------------------------------------");

        //Ninja 3
        String nome3 = "Kakashi Hatake";
        int idade3 = 32;

        String nomeMissao3 = "Proteção Autoridade";
        String statusMissao3 = "Concluída";
        char nivelMissao3 = 'A';

        //Condição da missão -- base na idade
        if (idade3 < 15) {
            if (nivelMissao3 == 'A' || nivelMissao3 == 'B') {
                statusMissao3 = "Não concluída, ninja é menor de idade.";
            } else {
                statusMissao3 = "Concluída!";
            }
        } else {
            statusMissao3 = "Concluída!";
        }

        System.out.println("-------------------------------------");

        System.out.println("Nome do Ninja: " + nome3);
        System.out.println("Idade do Ninja: " + idade3);
        System.out.println("Missão Atual: " + nomeMissao3);
        System.out.println("Nível da Missão: " + nivelMissao3);
        System.out.println("Status da Missão: " + statusMissao3);

        System.out.println("-------------------------------------");


    }
}
