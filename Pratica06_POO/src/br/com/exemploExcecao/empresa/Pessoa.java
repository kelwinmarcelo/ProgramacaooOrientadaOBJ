package br.com.exemploExcecao.empresa;

public class Pessoa {
    
    private String nome;
    private String email;
    private String telefone;
    
    public Pessoa(String nome, String email, String telefone) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + ", email=" + email + ", telefone=" + telefone + "]";
    }

}
