package Desafio006;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GerenciadorNinjas listDeNinjas = new GerenciadorNinjas();
        Scanner scanner = new Scanner(System.in);

        // Ninjas fornecidos + Adicionar
        System.out.println("--------- ADICIONAR ---------");
        listDeNinjas.addNinja(new Ninja("Naruto Uzumaki", 17, "Konoha"));
        listDeNinjas.addNinja(new Ninja("Sasuke Uchiha", 17, "Konoha"));
        listDeNinjas.addNinja(new Ninja("Sakura Haruno", 17, "Konoha"));
        listDeNinjas.addNinja(new Ninja("Kakashi Hatake", 31, "Konoha"));
        listDeNinjas.addNinja(new Ninja("Gaara", 17, "Areia"));
        listDeNinjas.addNinja(new Ninja("Shikamaru Nara", 17, "Konoha"));
        listDeNinjas.addNinja(new Ninja("Temari", 18, "Areia"));
        listDeNinjas.displayNinja();

        // Quero que o usuario adicione o ninja manualmente -- Mas ia dar uma merda da porra... Vou tentar fazer depois

/*        String adicionarNinjaLista = scanner.nextLine();
        Ninja adicionarNinja = listDeNinjas.addNinja(adicionarNinjaLista);*/

        // Remover ninja
        System.out.println("\n--------- REMOVER ---------");
        listDeNinjas.removePrimeiroNinja();
        listDeNinjas.displayNinja();

        // Adicionar no início
        System.out.println("\n--------- Add no Início ---------");
        listDeNinjas.addNinjaInicio(new Ninja("Jiraya", 50,"Konoha"));
        System.out.println("Novo ninja adicionado no início da lista.");
        listDeNinjas.displayNinja();

        // Buscar ninja - usei criterio nome
        System.out.println("\n--------- BUSCAR NINJA ---------");
        System.out.println("Digite o nome do ninja: ");
        String buscarNome = scanner.nextLine();
        Ninja encontrarNaLista = listDeNinjas.searchNinja(buscarNome);
        if (encontrarNaLista != null) {
            System.out.println("Ninja encontrado: " + encontrarNaLista);
        } else {
            System.out.println("Ninja não encontrado. Adicione um novo ninja no sistema.");
        }

        // Ordenar ninja com criterio
        System.out.println("\n--------- ORDENAR NINJA ---------");
        System.out.println("Escolha o critério de Ordenação (nome, idade, vila): ");
        String criterio = scanner.nextLine();
        listDeNinjas.orderNinja(criterio);
        System.out.println("\nLista após ordenação: ");
        listDeNinjas.displayNinja();

        scanner.close();


    }
}
