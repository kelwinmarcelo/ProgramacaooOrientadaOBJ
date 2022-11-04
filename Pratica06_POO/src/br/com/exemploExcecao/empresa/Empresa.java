package br.com.exemploExcecao.empresa;

import java.util.Arrays;

public class Empresa {
    
    private String nome;
    private String CNPJ;
    private Funcionario[] listFuncionarios = new Funcionario[100];
    private int qtd_de_funcionario = listFuncionarios.length;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCNPJ() {
        return CNPJ;
    }
    public void setCNPJ(String cNPJ) {
        CNPJ = cNPJ;
    }
    public Funcionario[] getListFuncionarios() {
        return listFuncionarios;
    }
    public void setListFuncionarios(Funcionario[] listFuncionarios) {
        this.listFuncionarios = listFuncionarios;
    }
    public int getQtd_de_funcionario() {
        return qtd_de_funcionario;
    }
    public void setQtd_de_funcionario(int qtd_de_funcionario) {
        this.qtd_de_funcionario = qtd_de_funcionario;
    }

    @Override
    public String toString() {
        return "Empresa [nome=" + nome + ", CNPJ=" + CNPJ + ", listFuncionarios=" + Arrays.toString(listFuncionarios)
                + ", qtd_de_funcionario=" + qtd_de_funcionario + "]";
    }






}
