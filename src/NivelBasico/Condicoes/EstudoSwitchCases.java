package NivelBasico.Condicoes;
import java.util.Scanner;

public class EstudoSwitchCases {
    public static void main(String[] args) {

        //Pedir para usuário - Scanner
        Scanner scanner = new Scanner(System.in);

        //Mostrar opções para usuário
        System.out.println("Escolha um personagem:");
        System.out.println("[1] Naruto Uzumaki");
        System.out.println("[2] Sasuke Uchiha");
        System.out.println("[3] Sakura Haruno");

        //Pedir para usuário escolher
        System.out.println("Digite o número abaixo: ");
        int escolhaUsuario = scanner.nextInt();

        System.out.println("Você digitou o número: " + escolhaUsuario);

        //Reação ao escolher um usuário
        switch (escolhaUsuario) {
            case 1:
                System.out.println("Você escolheu o Naruto Uzumaki");
                break;
            case 2:
                System.out.println("Você escolheu o Sasuke Uchiha");
                break;
            case 3:
                System.out.println("Você escolheu a Sakura Haruno");
                break;
            default:
                System.out.println("Você não digitou uma resposta válida. Tente novamente.");
                break;
        }


        //Sempre fechar o Scanner
        scanner.close();
    }
}
