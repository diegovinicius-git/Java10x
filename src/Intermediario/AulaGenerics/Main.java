package Intermediario.AulaGenerics;

public class Main {
    public static void main(String[] args) {

        BolsaNinja<Object> bolsaNinja = new BolsaNinja<>();
        bolsaNinja.adicionarFerramenta(new Shuriken(2));
        bolsaNinja.adicionarFerramenta(new Kunai("Kunai Explosiva"));
        bolsaNinja.adicionarFerramenta(new PergaminhoNinja("Pergaminho de Invocação"));
        bolsaNinja.adicionarFerramenta(new PergaminhoNinja("Pergaminho do Sapo"));

        System.out.println("Itens da Bolsa Ninja:");
        bolsaNinja.mostrarFerramenta();


    }
}
