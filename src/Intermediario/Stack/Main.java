package Intermediario.Stack;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Array
        // São estaticos e tem referencia de memoria previa
        System.out.println("----------------- ARRAY -----------------");
        String[] ninjasArray = new String[5];


        // Lista
        // Sao dinamicas e tamanho aumenta e diminui conforme precisa
        // A lista é um pouco mais lenta em comparação com ARRAY
        System.out.println("----------------- LISTA -----------------");
        List<String> ninjasList = new ArrayList<>();
        ninjasList.add("Naruto Uzumaki");
        ninjasList.add("Sasuke Uchiha");
        ninjasList.add("Sakura Haruno");
        System.out.println(ninjasList);


        // Stack - é como uma pilha de objetos
        // O ultimo elemento que entra é, obrigatoriamente, o primeiro a sair - LIFO (Last In First Out)
        // Stack é importante para Ordenação
        System.out.println("----------------- STACK -----------------");
        Stack<String> ninjasStack = new Stack<>();
        ninjasStack.push("Naruto Uzumaki");
        ninjasStack.push("Sakura");
        ninjasStack.push("Sasuke");
        System.out.println("Ninjas na Stack: " + ninjasStack);
        ninjasStack.pop();
        System.out.println("Ninjas na Stack depois do pop: " + ninjasStack);

        // Queue - Filas (FIFO - First In First Out)
        // Atenção: não dá para deletar o TAIL
        System.out.println("----------------- QUEUE -----------------");
        Queue<String> ninjasQueue = new LinkedList<>();
        ninjasQueue.add("Naruto Uzumaki");
        ninjasQueue.add("Sasuke Uchiha");
        ninjasQueue.add("Sakura");
        ninjasQueue.add("Kakashi");
        ninjasQueue.add("Shikamaru");

        // Mostrar a fila
        System.out.println("Ninjas na Fila: " + ninjasQueue);

        //Tirar um ninja da Queue
        ninjasQueue.poll();
        System.out.println("Ninjas na Fila depois do Poll: " + ninjasQueue);

        // Como ver quem é o HEAD(primeiro)
        ninjasQueue.peek();
        System.out.println("Ninja no HEAD: " + ninjasQueue.peek());

        // Esvaziar fila
        ninjasQueue.poll();
        ninjasQueue.poll();
        System.out.println("Ninjas na Fila: " + ninjasQueue);

        // Verificar se a fila está vazia
        if (ninjasQueue.isEmpty()) {
            System.out.println("A fila está Vazia.");
        } else {
            System.out.println("Ninjas ainda na Fila:" + ninjasQueue);
        }

    }
}
