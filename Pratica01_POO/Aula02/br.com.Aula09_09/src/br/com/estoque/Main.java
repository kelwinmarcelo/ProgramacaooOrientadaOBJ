package br.com.estoque;

//dados mocados> feitos nos parametros () do constructor
public class Main {
    public static void main(String[] args) {
        Estoque estoque1 = new Estoque("caneta", 100, 1);
        estoque1.getNome();
        estoque1.getQtdAtual();
        estoque1.getQtdMinima();
        System.out.println("Nome: " + estoque1.getNome() + "\nQuantidade Minima: " + estoque1.getQtdMinima()
                + "\nQuantidade Atual: " + estoque1.getQtdAtual());
        estoque1.setNome("Caneta Azul");
        System.out.println(estoque1.getNome());

        Estoque estoque2 = new Estoque();
        estoque2.setNome("Objeto");
        estoque2.setQtdAtual(10);
        estoque2.setQtdMinima(25);
        System.out.println("Nome: " + estoque2.getNome() + "\nQuantidade Minima: " + estoque2.getQtdMinima()
                + "\nQuantidade atual: " + estoque2.getQtdAtual());

        System.out.println("Agora testando métodos..");//a testar metodos
        estoque1.darBaixa(50);
        System.out.println(estoque1.Mostrar());
        System.out.println("Precisa repor o estoque? " + estoque1.precisaRepor());
        estoque1.precisaRepor();

    }

}
