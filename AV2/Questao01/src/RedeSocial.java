import java.util.ArrayList;

public class RedeSocial {
    String nomeUsuario;
    String dataNascimento;
    String senha;
    String dataCriacao;
    ArrayList<Publicacao> listaPublicacao = new ArrayList<Publicacao>();

    public RedeSocial(String dataCriacao, String nomeUsuario, String dataNascimento, String senha) {
        this.dataCriacao = dataCriacao;
        this.nomeUsuario = nomeUsuario;
        this.dataNascimento = dataNascimento;
        this.senha = senha;
    }

    public String getDataCriacao() {
        return dataCriacao;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public String getSenha() {
        return senha;
    }

    public ArrayList<Publicacao> getListaPublicacao() {
        return listaPublicacao;
    }

    public void setDataCriacao(String dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setListaPublicacao(ArrayList<Publicacao> listaPublicacao) {
        this.listaPublicacao = listaPublicacao;
    }

    public void inserePublicacao(Publicacao publi) {
        listaPublicacao.add(publi);
    }

    public void imprimePublicacoes() {
        System.out.println("TOTAL DE PUBLICACOES FEITAS: " + Publicacao.contadorPublicacao);
        for (Publicacao publi : listaPublicacao) {
            System.out.println(publi);
        }

    }

}