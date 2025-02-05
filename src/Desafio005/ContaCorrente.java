package Desafio005;

import org.w3c.dom.ls.LSOutput;

public class ContaCorrente extends ContaBancaria {

    @Override
    public void consultarSaldo() {
        System.out.println("Saldo da Conta Corrente: " + saldo);
        System.out.println("-----------------------------------------");
    }

    @Override
    public double depositar(double valor) {
        System.out.println("Depósito feito com Sucesso!");
        System.out.println("-----------------------------------------");
        double depositoCC = valor;
        saldo += depositoCC;
        return saldo;
    }

    public ContaCorrente(double saldo) {
        super(saldo);
    }

}
