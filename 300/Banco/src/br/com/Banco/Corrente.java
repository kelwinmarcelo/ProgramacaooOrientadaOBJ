package br.com.Banco;

public class Corrente extends Contas {
    private double tarifa;

    public Corrente() {
    }

    public Corrente(double tarifa) {
        this.tarifa = tarifa;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }
}
