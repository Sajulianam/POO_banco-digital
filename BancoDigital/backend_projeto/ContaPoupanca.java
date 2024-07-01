package br.com.bancodigital;

public class ContaPoupanca extends Conta {

    private double taxaRendimento;

    public ContaPoupanca(int numeroConta, double saldo, Cliente titular) {
        super(numeroConta, saldo, TipoConta.POUPANCA, titular);
        this.taxaRendimento = 0.01; // Taxa de rendimento de 1% ao mês
    }

    @Override
    public void sacar(double valor) throws SaldoInsuficienteException {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor do saque deve ser positivo.");
        }

        if (valor > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente para saque.");
        }

