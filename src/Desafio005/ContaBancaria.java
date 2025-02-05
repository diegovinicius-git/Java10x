package Desafio005;

public abstract class ContaBancaria implements Conta {
    double saldo;
    TipoConta tipoConta;

    public abstract void consultarSaldo();
    public abstract double depositar(double valor);


    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

    //Sobrecarga do Construtor
    public ContaBancaria(double saldo, TipoConta tipoConta) {
        this(saldo);
        this.tipoConta = tipoConta;
    }
}
