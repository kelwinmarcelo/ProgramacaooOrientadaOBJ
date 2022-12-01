public class AchadoPerdido implements Publicacao {

    String titulo1 = "";
    String descricao = "";
    String foto = "";
    String tipo = "";
    String local_achado = "";
    String data_hora = "";
    String status = "";

    public String getTitulo1() {
        return titulo1;
    }

    public AchadoPerdido(String titulo, String descricao, String tipo, String status) {
        this.titulo1 = titulo;
        this.descricao = descricao;
        this.tipo = tipo;
        this.status = status;
    }

    public void completaDados(String foto, String local_achado, String data_hora) {
        this.foto = foto;
        this.local_achado = local_achado;
        this.data_hora = data_hora;
    }

    @Override
    public String toString() {
        return "AchadoPerdido [titulo=" + titulo1 + ", descricao=" + descricao + ", foto=" + foto + ", tipo=" + tipo + ", local_achado=" + local_achado + ", data_hora=" + data_hora + ", status=" + status + "]";
    }

    @Override
    public boolean buscarTitulo(String titulo) {

        return this.getTitulo1().equals(titulo);

    }

    @Override
    public String visualizarDetalhes() {

        return this.toString();

    }

}