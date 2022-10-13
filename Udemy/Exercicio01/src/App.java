import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        double largura, altura;
        Scanner ler = new Scanner(System.in);
        System.out.println("Entre com a largura e altura do retângulo: ");
        System.out.print("Largura: ");
        largura = ler.nextDouble();
        System.out.print("Altura: ");
        altura = ler.nextDouble();

        Retangulo retangulo01 = new Retangulo();
        retangulo01.setLargura(largura);
        retangulo01.setAltura(altura);
        System.out.println("____________RESULT__________");
        System.out.print("AREA: " + retangulo01.Area() + "\n");
        System.out.print("PERÍNEO: " + retangulo01.Perimetro() + "\n");
        System.out.print("DIAGONAL: " + retangulo01.Diagonal());
        ler.close();
    }
}
