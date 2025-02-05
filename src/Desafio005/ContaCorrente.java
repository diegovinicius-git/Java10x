package Desafio005;

public class ContaCorrente extends ContaBancaria {

    @Override
    public void consultarSaldo() {
        System.out.println("Saldo Atual: " + saldo);
        System.out.println("---------------------------------");
    }

    @Override
    public double depositar(double valor) {
        System.out.println("Depósito em Conta Corrente realizado.");
        System.out.println("---------------------------------");
        double depositoContaCorrente = valor;
        saldo += depositoContaCorrente;
        return saldo;
    }

    public ContaCorrente(double saldo) {
        super(saldo);
    }

    //Sobrecarga do Construtor
    public ContaCorrente(double saldo, TipoConta tipoConta) {
        super(saldo, tipoConta);
    }

}
