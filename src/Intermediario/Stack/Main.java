package Intermediario.Stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        // Array
        // São estaticos e tem referencia de memoria previa
        System.out.println("----------------- ARRAY -----------------");
        String[] ninjasArray = new String[3];
        ninjasArray[0] = "Naruto Uzumaki";
        ninjasArray[1] = "Sasuke Uchiha";
        ninjasArray[2] = "Sakura Haruno";
        System.out.println("Meu Array: " + ninjasArray[2]);

        // Lista
        // Sao dinamicas e tamanho aumenta e diminui conforme precisa
        // A lista é um pouco mais lenta em comparação com ARRAY
        System.out.println("----------------- LISTA -----------------");
        List<String> ninjasList = new ArrayList<>();
        ninjasList.add("Naruto Uzumaki");
        ninjasList.add("Sasuke Uchiha");
        ninjasList.add("Sakura Haruno");
        System.out.println("Minha Lista: " + ninjasList);

        // Stack
        // O ultimo elemento que entra é, obrigatoriamente, o primeiro a sair
        // Stack é importante para Ordenação
        System.out.println("----------------- STACK -----------------");
        Stack<String> ninjasStack = new Stack<>();
        ninjasStack.push("Naruto Uzumaki");
        ninjasStack.push("Sasuke Uchiha");
        ninjasStack.push("Sakura Haruno");
        System.out.println("Minha Stack Atual: " + ninjasStack);
        ninjasStack.pop();
        System.out.println("Minha Stack Atual com Pop: " + ninjasStack);
        System.out.println("Minha Stack Atual com o próximo elemento do topo: " + ninjasStack.peek());
        System.out.println("Tamanho da Stack: " + ninjasStack.size() + " elementos.");





    }
}
