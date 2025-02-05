package Desafio005;

public class ContaPoupaca extends ContaBancaria{

    @Override
    public void consultarSaldo() {
        System.out.println("Saldo da Poupança: " + saldo);
        System.out.println("-----------------------------------------");
    }

    @Override
    public double depositar(double valor) {
        System.out.println("Depósito feito com Sucesso!");
        System.out.println("-----------------------------------------");
        double depositoPoupancaComTaxa = valor * 0.01; // 1% de taxa para depósito na Poupança
        saldo += valor;
        return saldo;
    }

    public ContaPoupaca(double saldo) {
        super(saldo);
    }
}
