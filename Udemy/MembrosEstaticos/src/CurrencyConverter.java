public class CurrencyConverter {
    public double dolarAtual;
    public double valorReal;
    public final static double IOF = 0.06;

    public static double valorTotal(Double valorReal, double dolarAtual) {
        return (dolarAtual * valorReal) * (IOF + 1);
    }

    public void setDolarAtual(double dolarAtual) {
        this.dolarAtual = dolarAtual;
    }

    public void setValorReal(double valorReal) {
        this.valorReal = valorReal;
    }
}
