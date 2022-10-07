public class DistribuicaoAlimento extends Projeto {

    private String descricaoAlimentos;
    private double quantidade;

    public DistribuicaoAlimento(String nomeProjeto, String descricao, String dataInicio, String dataFim, String descricaoAlimentos, double quantidade) {
        super(nomeProjeto, descricao, dataInicio, dataFim, descricaoAlimentos);
        this.descricaoAlimentos = descricaoAlimentos;
        this.quantidade = quantidade;
    }

    @Override
    public boolean validaProjeto() {
        return false;
    }

    @Override
    public String ImprimeProjeto() {
        return null;
    }

}
