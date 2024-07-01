package br.com.bancodigital.investimentos;

public abstract class Investimento {

    protected int id;
    protected String nome;
    protected double valorAplicado;
    protected double rendimentoAcumulado;
    protected Cliente cliente;

    public Investimento(int id, String nome, double valorAplicado, Cliente cliente) {
        this.id = id;
        this.nome = nome;
        this.valorAplicado = valorAplicado;
        this.rendimentoAcumulado = 0.0;
        this.cliente = cliente;
    }

    public abstract void simularRendimento(int periodo);

    public abstract void resgatar(double valor) throws ValorResgateInvalidoException;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorAplicado() {
        return valorAplicado;
    }

    public void setValorAplicado(double valorAplicado) {
        this.valorAplicado = valorAplicado;
    }

    public double getRendimentoAcumulado() {
        return rendimentoAcumulado;
    }

    public void setRendimentoAcumulado(double rendimentoAcumulado) {
        this.rendimentoAcumulado = rendimentoAcumulado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
