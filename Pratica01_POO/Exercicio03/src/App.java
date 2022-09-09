import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        
        String nome;
        String matricula;
        Double notaAV1 = null;
        Double notaAV2 = null;
        Double notaAE = null;
        String curso;
        String periodo;
                
        System.out.println("Insira o nome do Aluno :");
            nome = ler.next();

        System.out.println("Insira o numero da matricula :");
            matricula = ler.next();
            
        System.out.println("Insira o curso : ");
            curso = ler.next();
            
        System.out.println("Insira o periodo : ");
            periodo = ler.next();

        // System.out.println("Insira a nota da AV1 :");
        //     notaAV1 = ler.nextDouble();

        // System.out.println("Insira a nota da AV2 :");
        //     notaAV2 = ler.nextDouble();

        // System.out.println("Insira a nota da AE :");
        //     notaAE = ler.nextDouble();


        Aluno aluno1 = new Aluno(nome, matricula, notaAV1, notaAV2, notaAE, curso, periodo);

        System.out.println("Dados do aluno gerado : \n" + aluno1);

        System.out.println("Para qual valor você gostaria de alterar a AV1 :");
            aluno1.SetNotaAV1(ler.nextDouble());

        System.out.println("Para qual valor você gostaria de alterar a AV2 :");
            aluno1.SetNotaAV2(ler.nextDouble());    

        System.out.println("Para qual valor você gostaria de alterar a AE :");
            aluno1.SetNotaAE(ler.nextDouble());

        System.out.println("De acordo com os com as notas AV1 e AV2 o aluno está " + aluno1.AvaliarAluno(notaAV1, notaAV2));

        System.out.println("De acordo com os com notas todas as notas o aluno está " + aluno1.AvaliarRecuperação(notaAV1, notaAV2, notaAE));


            ler.close();
    }
}