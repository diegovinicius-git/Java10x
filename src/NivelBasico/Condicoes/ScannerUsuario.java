package NivelBasico.Condicoes;
import java.util.Scanner;

public class ScannerUsuario {
    public static void main(String[] args) {

        Scanner caixaTexto = new Scanner(System.in);

        //Receber o nome do Ninja
        System.out.println("Escreva abaixo o nome do Ninja: ");
        String nomeNinja = caixaTexto.nextLine();
        System.out.println(nomeNinja);

        System.out.println("O nome do ninja é " + nomeNinja);

        //Receber a Idade do Ninja
        System.out.println("Escreva aqui a idade do ninja:");
        int idadeNinja = caixaTexto.nextInt();
        System.out.println("A idade do ninja é: " + idadeNinja + " anos");

        //Tratamento de Dados
        if (idadeNinja >= 18) {
            System.out.println("Este ninja já é maior de idade e pode ir para missões fora da vila.");
        } else {
            System.out.println("Este ninja é muito novo. Precisa treinar mais para missões fora da vila.");
        }

        //Fechar sempre o Scanner
        caixaTexto.close();
    }
}
