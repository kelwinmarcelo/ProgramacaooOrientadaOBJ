import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        Triangulo x, y;
        x = new Triangulo();
        // instanciando o objeto com new ..()
        y = new Triangulo();

        System.out.println("Entre com as medidas do triângulo X: ");
        x.a = ler.nextDouble();
        x.b = ler.nextDouble();
        x.c = ler.nextDouble();
        // Isso "x.a" faz a leitura dos dados e armazena em cada um dos atributos
        // do objeto x
        System.out.println("Entre com as medidas do Triângulo Y: ");
        y.a = ler.nextDouble();
        y.b = ler.nextDouble();
        y.c = ler.nextDouble();

        double areaX = x.area();
        double areaY = y.area();
        System.out.printf("A area do triagulo X é: %.4f%n", areaX);
        System.out.printf("A area do triagulo Y é: %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.printf("A maior area é: " + areaX);

        } else {
            System.out.printf("A maior area é: " + areaY);
        }
        ler.close();
    }
}
