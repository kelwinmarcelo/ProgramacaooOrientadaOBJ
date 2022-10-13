import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Estudante aluno = new Estudante();

        System.out.print("Nome: ");
        aluno.nome = ler.nextLine();

        System.out.print("Nota do PRIMEIRO trimestre: ");
        aluno.nota1 = ler.nextDouble();
        System.out.print("Nota do SEGUNDO trimestre: ");
        aluno.nota2 = ler.nextDouble();
        System.out.print("Nota do TERCEIRO trimestre: ");
        aluno.nota3 = ler.nextDouble();

        System.out.println("Nota final = " + aluno.notaFinal());
        System.out.println(aluno.statusAprovacao());

        ler.close();
    }
}
