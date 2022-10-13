import javax.swing.JOptionPane;

import javafx.beans.binding.IntegerExpression;
import java.util.Scanner;

public class Main {
    static int option;

    static Scanner ler = new Scanner(System.in);

    static Double valor = null;
    static Double valorAdicional = null;
    static String localizacao = null;

    public static void main(String[] args) {

        do {
            option = Integer.parseInt(
                    JOptionPane.showInputDialog("\t(1) Ingresso Normal \n\t(2) VIP  \n\t(3) Camarote\n\t(0) Sair"));

            switch (option) {
                case 1:

                    valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor : "));

                    Normal ingressoNormal = new Normal(valor);

                    JOptionPane.showMessageDialog(null, ingressoNormal.imprimeValorIngresso(), "Ingresso Normal",
                            JOptionPane.DEFAULT_OPTION);

                    break;

                case 2:

                    valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor : "));

                    valorAdicional = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor adicional: "));

                    VIP ingressoVIP = new VIP(valor, valorAdicional);

                    JOptionPane.showMessageDialog(null, ingressoVIP.imprimeValorIngresso(), "Ingresso Normal",
                            JOptionPane.DEFAULT_OPTION);

                    break;

                case 3:

                    valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor : "));

                    valorAdicional = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor adicional: "));

                    localizacao = JOptionPane.showInputDialog("Digite a localização: ");

                    Camarote ingressoCamarote = new Camarote(valor, valorAdicional, localizacao);

                    JOptionPane.showMessageDialog(null, ingressoCamarote.imprimeValorIngresso());

                    break;

                default:

                    JOptionPane.showMessageDialog(null, "Opção inválida");

                    break;

                case 0:

                    JOptionPane.showMessageDialog(null, "Programa encerrado", "Encerramento",
                            JOptionPane.INFORMATION_MESSAGE);

                    break;
            }

        } while (option != 0);
    }

}