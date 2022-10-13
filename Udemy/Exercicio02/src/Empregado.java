public class Empregado {
    public String nome;
    public double salarioBruto;
    public double Imposto;

    public double salarioLiquido() {
        return salarioBruto - Imposto;
    }

    public void aumentarSalario(double porcentagem) {
        salarioBruto += salarioBruto * porcentagem / 100.0;
    }

    @Override
    public String toString() {
        return nome + ", $" + String.format("%.2f", salarioLiquido());
    }
}
