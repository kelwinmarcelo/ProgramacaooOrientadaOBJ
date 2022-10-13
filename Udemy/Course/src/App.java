import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        Produto produto = new Produto();
        System.out.println("Entre com o nome do produto: ");
        System.out.print("Nome: ");
        produto.nome = ler.nextLine();
        System.out.print("Preço: ");
        produto.preco = ler.nextDouble();
        System.out.print("Quantidade em estoque: ");
        produto.quantidade = ler.nextInt();
        System.out.println("\nDados do produto: " + produto.toString());
        System.out.print("\nEntre com um numero de produtos para ser adicionado ao estoque: ");
        int quantidade = ler.nextInt();
        produto.addProdutos(quantidade);
        System.out.println("\nDados atualizados: " + produto);
        System.out.print("\nEntre com um numero de produtos para ser removidos do estoque: ");
        quantidade = ler.nextInt();
        produto.removerProdutos(quantidade);
        System.out.print("\nDados atualizados: " + produto);
        ler.close();
    }
}
