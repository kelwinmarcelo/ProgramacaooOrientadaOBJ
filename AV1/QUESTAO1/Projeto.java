public abstract class Projeto {
    public String nomeProjeto;
    public String descricao;
    public String endereco;
    public String dataInicio;
    public String dataFim;

    public Projeto(String nomeProjeto, String descricao, String endereco, String dataInicio, String dataFim) {
        this.nomeProjeto = nomeProjeto;
        this.descricao = descricao;
        this.endereco = endereco;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }

    public abstract String ImprimeProjeto();//imprimir projeto

    public abstract boolean validaProjeto();//validar projeto 

}
