package Desafio005;

public class ContaPoupanca extends ContaBancaria{

    @Override
    public void consultarSaldo() {
        System.out.println("Saldo da Poupança: " + saldo);
        System.out.println("---------------------------------");
    }

    @Override
    public double depositar(double valor) {
        System.out.println("Depósito na Poupança realizado.");
        System.out.println("---------------------------------");
        double depositoPoupancaComTaxa = valor * 0.01; // Taxa aplicada -> 1%
        saldo += depositoPoupancaComTaxa;
        return saldo;
    }

    public ContaPoupanca(double saldo) {
        super(saldo);
    }

    //Sobrecarga do Construtor
    public ContaPoupanca(double saldo, TipoConta tipoConta) {
        super(saldo, tipoConta);
    }
}
