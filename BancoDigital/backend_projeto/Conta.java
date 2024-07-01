package br.com.bancodigital;

public abstract class Conta {

    protected int numeroConta;
    protected double saldo;
    protected TipoConta tipoConta;
    protected Cliente titular;

    public Conta(int numeroConta, double saldo, TipoConta tipoConta, Cliente titular) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.tipoConta = tipoConta;
        this.titular = titular;
    }

    public abstract void sacar(double valor) throws SaldoInsuficienteException;

    public abstract void depositar(double valor);

    public void transferir(Conta destino, double valor) throws SaldoInsuficienteException {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor da transferência deve ser positivo.");
        }

        sacar(valor);
        destino.depositar(valor);
    }

    public double consultarSaldo() {
        return saldo;
    }

    public void imprimirExtrato(Extrato extrato) {
        extrato.adicionarTransacao("Saldo inicial:", saldo);
        // Imprimir outras transações (saques, depósitos, transferências)
        extrato.imprimir();
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public TipoConta getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(TipoConta tipoConta) {
        this.tipoConta = tipoConta;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public enum TipoConta {
        CORRENTE, POUPANCA
    }
}
package br.com.bancodigital;

public abstract class Conta {

    protected int numeroConta;
    protected double saldo;
    protected TipoConta tipoConta;
    protected Cliente titular;

    public Conta(int numeroConta, double saldo, TipoConta tipoConta, Cliente titular) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.tipoConta = tipoConta;
        this.titular = titular;
    }

    public abstract void sacar(double valor) throws SaldoInsuficienteException;

    public abstract void depositar(double valor);

    public void transferir(Conta destino, double valor) throws SaldoInsuficienteException {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor da transferência deve ser positivo.");
        }

        sacar(valor);
        destino.depositar(valor);
    }

    public double consultarSaldo() {
        return saldo;
    }

    public void imprimirExtrato(Extrato extrato) {
        extrato.adicionarTransacao("Saldo inicial:", saldo);
        // Imprimir outras transações (saques, depósitos, transferências)
        extrato.imprimir();
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public TipoConta getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(TipoConta tipoConta) {
        this.tipoConta = tipoConta;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public enum TipoConta {
        CORRENTE, POUPANCA
    }
}
