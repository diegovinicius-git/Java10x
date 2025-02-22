package Intermediario.HashSet;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<String> ninjas = new ArrayList<>();
        ninjas.add("Naruto Uzumaki");
        ninjas.add("Sasuke Uchiha");
        ninjas.add("Sakura Haruno");
        ninjas.add("Naruto Uzumaki");
        ninjas.add("Danzo");
        ninjas.add("Kakashi Hatake");
        ninjas.add("Boruto Uzumaki");

        System.out.println("Ninjas = " + ninjas);


        Set<String> ninjasSet = new LinkedHashSet<>();
        ninjasSet.addAll(ninjas);

        System.out.println("Ninjas Set = " + ninjasSet);

    }
}
