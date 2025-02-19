package Desafio006;

import java.util.LinkedList;

public class GerenciadorNinjas {
    LinkedList<Ninja> listDeNinjas = new LinkedList<>();

    // Metodos
    public void addNinja(Ninja ninja) {
        listDeNinjas.add(ninja);
    }

    public void removeNinja(Ninja ninja) {
        listDeNinjas.poll();
    }

    public void acessNinja() {
        for (int i = 0; i < listDeNinjas.size(); i++) {
            listDeNinjas.get(listDeNinjas.indexOf(i));
        }
    }

}
