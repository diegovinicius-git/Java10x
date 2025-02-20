package Desafio006;

import java.util.Comparator;
import java.util.LinkedList;

public class GerenciadorNinjas {
    LinkedList<Ninja> lista = new LinkedList<>();

    // Metodos

    // Adicionar
    public void addNinja(Ninja ninja) {
        lista.add(ninja);
    }

    public void addNinjaInicio(Ninja ninja) {
        lista.addFirst(ninja);
    }

    // Remover
    public void removePrimeiroNinja() {
        if (lista.isEmpty()) {
            System.out.println("Não é possível remover. Lista vazia.");
        } else {
            lista.removeFirst();
            System.out.println("Primeiro ninja da lista removido.");
        }
    }

    // Acessar
    public void acessNinja() {
        for (int i = 0; i < lista.size(); i++) {
            lista.get(lista.indexOf(i));
        }
    }

    // Exibir ninjas
    public void displayNinja() {
        if (lista.isEmpty()) {
            System.out.println("Nenhum ninja na lista.");
        } else {
            for (Ninja ninja : lista) {
                System.out.println(ninja);
            }
        }
    }

    // Procurar ninja e exibir
    public Ninja searchNinja(String nome) {
        for (Ninja ninja : lista) {
            if (ninja.getNome().equalsIgnoreCase(nome)) {
                return ninja;
            }
        }
        return null;
    }

    // Ordenar ninjas com base em um criterio - nome, idade, vila
    public void orderNinja(String criterio) {
        switch (criterio.toLowerCase()) {
            case "nome":
                lista.sort(Comparator.comparing(Ninja::getNome));
                break;
            case "idade":
                lista.sort(Comparator.comparing(Ninja::getIdade));
                break;
            case "vila":
                lista.sort(Comparator.comparing(Ninja::getVila));
                break;
            default:
                System.out.println("Critério inválido. Escolha entre: 'nome', 'idade' ou 'vila'.");
        }
        System.out.println("Lista ordenada por: " + criterio);
    }

}
