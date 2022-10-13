import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        double valordinheiro, cotacaoDolar;
        Scanner ler = new Scanner(System.in);
        System.out.print("Cotação atual do Dólar: ");
            cotacaoDolar= ler.nextDouble();
        System.out.print("Valor da compra em reais: ");
            valordinheiro=ler.nextDouble();
        System.out.print("Total a ser pago em Reais: " + CurrencyConverter.valorTotal(valordinheiro,cotacaoDolar));

    }
}
