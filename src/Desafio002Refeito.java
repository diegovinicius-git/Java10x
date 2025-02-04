import java.util.Scanner;

public class Desafio002Refeito {
    public static void main(String[] args) {

        //Entrada de Dados
        Scanner scanner = new Scanner(System.in);

        //Fazer o Array
        int numeroMax = 2;
        String[] ninjas = new String[numeroMax];


        //CONTADORES - de Ninjas e qual opção o usuário escolheu
        int ninjasCadastrados = 0;
        int opcaoUsuario = 0;

        //Iniciar Programa
        while (opcaoUsuario != 3) {

            //MENU
            System.out.println("");
            System.out.println("===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Deletar Ninja cadastrado");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcaoUsuario = scanner.nextInt();
            scanner.nextLine();

            switch (opcaoUsuario) {
                case 1:
                    if (ninjasCadastrados < numeroMax) {
                        System.out.println("Digite o nome do ninja para cadastro: ");
                        String nomeNinja = scanner.nextLine();
                        ninjas[ninjasCadastrados] = nomeNinja;
                        //Adicionando mais um ninja no Array
                        ninjasCadastrados++;
                        System.out.println("Ninja cadastrado com sucesso!");

                    } else {
                        System.out.println("A lista de ninjas está cheia, impossível cadastrar um novo ninja.");
                    }
                    break;

                case 2:
                    if (ninjasCadastrados == 0) {
                        System.out.println("Nenhum ninja cadastrado.");
                    } else {
                        System.out.println("=============== Lista de Ninjas ===============");
                        for (int i = 0; i < ninjas.length; i++) {
                            System.out.println(ninjas[i]);
                        }
                    }
                    break;

                case 3:
                    System.out.println("Finalizando programa...");
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;

            }
        }
        scanner.close();
    }

}
