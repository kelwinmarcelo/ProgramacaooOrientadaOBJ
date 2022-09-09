package br.com.estoque;

public class Estoque {
    private String nome;
    private int qtdAtual;
    private int qtdMinima;

    // set é o metodo para alterar o valor do atributo
    // get é o método para retornar o conteúdo do atributo
    // o set tem parâmetro() pois ele vai definir o que será alterado
    public Estoque() {
    }

    public Estoque(String nome, int qtdAtual, int qtdMinima) {
        this.nome = nome;
        this.qtdAtual = qtdAtual;
        this.qtdMinima = qtdMinima;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setQtdAtual(int qtdAtual) {
        this.qtdAtual = qtdAtual;
    }

    public void setQtdMinima(int qtdMinima) {
        this.qtdMinima = qtdMinima;
    }

    public String getNome() {
        return this.nome;
    }

    public int getQtdMinima() {
        return this.qtdMinima;
    }

    public int getQtdAtual() {
        return this.qtdAtual;
    }

    public void darBaixa(int qtd) {
        if (qtd <= this.qtdAtual) {
            this.qtdAtual -= qtd;
            System.out.println("O atual estoque agora é: " + this.qtdAtual);
        } else
            System.out.println("Impossivel dar baixa no estoque!");

    }

    public boolean precisaRepor() {
        if (qtdAtual <= qtdMinima)
            return true;

        else
            return false;
    }

    public String Mostrar() {
        return "Produto: "+this.nome+"\nQuantidade Minima: "+ this.qtdMinima+"\nQuantidade Atual: "+this.qtdAtual;
    }
}
