public class Publicacao {
    
    String textoPublicacao = "";
    String linksMidia = "";
    String dataPublicacao = "";

    public Publicacao(String dataPublicacao, String textoPublicacao, String linksMidia) {

        this.textoPublicacao = textoPublicacao;
        this.dataPublicacao = dataPublicacao;
        this.linksMidia = linksMidia;
        contadorPublicacao++;
    }

    public static double contadorPublicacao = 0;

    public String getDataPublicacao() {
        return dataPublicacao;
    }

    public String getTextoPublicacao() {
        return textoPublicacao;
    }

    public String getLinksMidia() {
        return linksMidia;
    }

    public static double getContadorPublicacao() {
        return contadorPublicacao;
    }

    public void setDataPublicacao(String dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    public void setTextoPublicacao(String textoPublicacao) {
        this.textoPublicacao = textoPublicacao;
    }

    public void setLinksMideia(String linksMidia) {
        this.linksMidia = linksMidia;
    }

    public static void setContadorPublicacao(double contadorPublicacao) {
        Publicacao.contadorPublicacao = contadorPublicacao;
    }

    @Override
    public String toString() {
        return "Publicacao [dataPublicacao=" + dataPublicacao + ", textoPublicacao=" + textoPublicacao
                + ", linksMidia=" + linksMidia + "]";
    }

}