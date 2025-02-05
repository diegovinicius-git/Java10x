package Desafio005;

public class Main {
    public static void main(String[] args) {

        ContaCorrente contaNaruto = new ContaCorrente(500.00,TipoConta.CORRENTE);
        contaNaruto.consultarSaldo();
        contaNaruto.depositar(150);

        ContaPoupanca contaNarutoPoupanca = new ContaPoupanca(1500.00,TipoConta.POUPANCA);
        contaNarutoPoupanca.consultarSaldo();
        contaNarutoPoupanca.depositar(300);

    }
}
