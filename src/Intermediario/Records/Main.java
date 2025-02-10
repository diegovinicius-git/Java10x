package Intermediario.Records;

public class Main {
    public static void main(String[] args) {

        Ninja cadastro = new Ninja("Naruto","naruto@email.com",99999999);
        System.out.println("Cadastro = " + cadastro);


        NinjaRecord cadastroUsandoRecord = new NinjaRecord("Sasuke",001);
        System.out.println("Cadastro = " + cadastroUsandoRecord);


    }
}
