package br.com.Banco;

public abstract class Contas {
    private Clientes cliente;
    private int agencia;
    private int numeroConta;
    private Double saldo; 

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    void deposito(double valorDeposito){
        this.saldo += valorDeposito;
        System.out.println("depostio realizado");
    }

    void saque(double valorSaque){
        this.saldo -=  valorSaque;
    }

    public Clientes getCliente() {
        return cliente;
    }
    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }
    public int getAgencia() {
        return agencia;
    }
    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }
    public int getNumeroConta() {
        return numeroConta;
    }
    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

}