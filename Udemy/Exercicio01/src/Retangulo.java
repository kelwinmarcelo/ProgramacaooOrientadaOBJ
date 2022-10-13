public class Retangulo {

    private double altura;
    private double largura;// ATRIBUTOOOOOOOSSSS

    public double Area() {// ISSO É METODO CRAZY MAN
        double area = this.altura * this.largura;
        return area;
    }

    public double Perimetro() {
        double perimetro = (altura * 2) + (largura * 2);
        return perimetro;
    }

    public double Diagonal() {
        double diagonal = Math.sqrt(altura * altura + largura * largura);
        return diagonal;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }
}