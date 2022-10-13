import java.text.Format;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        Empregado empregado = new Empregado();

        System.out.print("Nome: ");
        empregado.nome = ler.nextLine();
        System.out.print("Salário Bruto: ");
        empregado.salarioBruto = ler.nextDouble();
        System.out.print("Imposto: ");
        empregado.Imposto = ler.nextDouble();

        System.out.print("\nEmpregado: " + empregado.toString());
        System.out.print("\nDigite a porcentagem a incrementar no salário: ");
        double porcentagem = ler.nextDouble();
        empregado.aumentarSalario(porcentagem);

        System.out.printf("Salário liquido atualizado: " + empregado.salarioLiquido());
        ler.close();
    }
}
