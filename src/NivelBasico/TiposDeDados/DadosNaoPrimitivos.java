package NivelBasico.TiposDeDados;

public class DadosNaoPrimitivos {
    public static void main(String[] args) {
//        Tudo que for digitado aqui dentro com o COMANDO PSVM vai ser compilado

        /*
        * Dados não primitivos: String, Array, Class, enum
        * Objetivo: Criar um ninja e atribuir métodos a ele
        * */

        String nome = "Uzumaki Naruto";
        String nomeUpperCase = nome.toUpperCase(); //Coloca tudo em CAPSLOCK
        System.out.println("Este texto está em CAPSLOCK: " + nomeUpperCase); //COMANDO SOUT é mais rápido
        System.out.println("Este texto está normal: " + nome);

        String aldeia = "Aldeia da Folha";
        String aldeiaLowerCase = aldeia.toLowerCase(); //Coloca tudo em minúsculo
        System.out.println(aldeiaLowerCase);

    }
}
