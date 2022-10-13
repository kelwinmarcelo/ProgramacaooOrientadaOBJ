public class Estudante {
    public String nome;

    public double nota1;
    public double nota2;
    public double nota3;

    public double notaFinal() {
        return nota1 + nota2 + nota3;
    }

    public double pontosFaltantes() {
        if (notaFinal() < 60.0) {
            return 60.0 - notaFinal();
        } else {
            return 0.0;
        }
    }

    public String statusAprovacao() {
        if (pontosFaltantes() == 0.0) {
            return "APROVADO";
        } else {
            return "REPROVADO\nFALTAM " + pontosFaltantes() + " PONTOS.";
        }
    }
}
