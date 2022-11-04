package br.com.exemploExcecao.empresa;
public class Funcionario extends Pessoa {
    public static int cont = 0;
    private String departamento;
    private Double salario;
    private String dataEntradaBanco;
    private String rg;
    private boolean estaEmpresa;


    public Funcionario(String nome, String email, String telefone, String departamento, Double salario,
            String dataEntradaBanco, String rg, boolean estaEmpresa) {
        super(nome, email, telefone);
        this.departamento = departamento;
        this.salario = salario;
        this.dataEntradaBanco = dataEntradaBanco;
        this.rg = rg;
        this.estaEmpresa = estaEmpresa;
    }

    public void bonificar(double porcentagem) {
        setSalario(getSalario() * (1 + porcentagem));
    }

    public void demitir() {
        setEstaEmpresa(false);
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getDataEntradaBanco() {
        return dataEntradaBanco;
    }

    public void setDataEntradaBanco(String dataEntradaBanco) {
        this.dataEntradaBanco = dataEntradaBanco;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public boolean isEstaEmpresa() {
        return estaEmpresa;
    }

    public void setEstaEmpresa(boolean estaEmpresa) {
        this.estaEmpresa = estaEmpresa;
    }

    @Override
    public String toString() {
        return "Funcionario [departamento=" + departamento + ", salario=" + salario + ", dataEntradaBanco="
                + dataEntradaBanco + ", rg=" + rg + ", estaEmpresa=" + estaEmpresa + "]";
    }
}
