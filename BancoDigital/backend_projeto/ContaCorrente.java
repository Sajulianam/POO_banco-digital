package br.com.bancodigital;

public class ContaCorrente extends Conta {

    private double taxaSaque;

    public ContaCorrente(int numeroConta, double saldo, Cliente titular) {
        super(numeroConta, saldo, TipoConta.CORRENTE, titular);
        this.taxaSaque = 0.05; // Taxa de saque de 5%
    }

    @Override
    public void sacar(double valor) throws SaldoInsuficienteException {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor do saque deve ser positivo.");
        }

        double valorTotal = valor + (valor * taxaSaque);
        if (valorTotal > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente para saque.");
        }

        saldo -= valorTotal;
    }

    @Override
    public void depositar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor do depósito deve ser positivo.");
        }

        saldo += valor;
    }
}
