package br.com.EmpregoFaculdade;

// Pede-se:
// a) Alterar o método getGastos() para somar um bônus de R$ 40 reais por hora/aula.
// b) Alterar o método getInfo () para retornar atualizado o valor que o professor irá
// receber (salário + bônus).
// c) Criar no Void main() um objeto e exibir na tela os resultados dos métodos
// getGastos() e getInfo ().
public class EmpregadoDaFaculdade {
    private String nome;
    private double salario;
    private int horasAula;

    public EmpregadoDaFaculdade(String nome, double salario, int horasAula) {
        this.nome = nome;
        this.salario = salario;
        this.horasAula = horasAula;
    }

    public EmpregadoDaFaculdade() {
    }

    String getNome() {
        return this.nome;
    }

    double getGastos() {
        double bonus = 40 * horasAula;
        return this.salario + bonus;
    }

    String getInfo() {
        return "nome:" + this.nome + " com salário " + getGastos();
    }
}
