package Desafio003;

import java.util.Scanner;

public class MainDesafio003 {
    public static void main(String[] args) {

        //Entrada de Dados
        Scanner scanner = new Scanner(System.in);

        //Inicializar Objeto - Uchiha
        Uchiha Sasuke = new Uchiha();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.idade = 18;
        Sasuke.missao = "Reconhecimento";
        Sasuke.nivelDificuldade = "Alta";
        Sasuke.statusMissao = "Em andamento";
        Sasuke.mostrarInformacoes();



        //Contadores
        int ninjasCadastrados = 0;
        int addHabilidadeNinja = 0;
        int opcaoUsuario = 0;

/*

        //Iniciar Programa
        while (opcaoUsuario != 4) {

            //MENU
            System.out.println("");
            System.out.println("===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Mostrar Informações");
            System.out.println("3. Adicionar nova habilidade");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcaoUsuario = scanner.nextInt();

            //Casos
            switch (opcaoUsuario) {
                case 1:
                    System.out.println("Você escolheu cadastrar um ninja");
                    System.out.println("Cadastre o nome do ninja:");
                    Uchiha.nome = scanner.nextLine();
                    scanner.nextLine();
                    System.out.println("Digite a idade do ninja:");
                    Uchiha.idade = scanner.nextInt();
                    System.out.println("Digite a missão atual do ninja:");
                    Uchiha.missao = scanner.nextLine();
                    scanner.nextLine();
                    System.out.println("Qual o nível de dificuldade: 'A', 'B', 'C', 'D'");
                    Uchiha.nivelDificuldade = scanner.nextLine();
                break;

                case 2:
                    Uchiha.mostrarInformacoes();
                break;

                case 3:
                    Uchiha.mostrarInformacoesUchiha();
                break;

                case 4:
                    System.out.println("Você está saindo...");
                break;
            }
        }

*/

    }

}

