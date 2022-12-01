import java.util.Date;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        String dataCriacao = new Date().toString();
        String nomeUsuario = JOptionPane.showInputDialog("NOME: ");
        String dataNascimento = JOptionPane.showInputDialog("DATA DE NASCIMENTO: ");
        String senha = JOptionPane.showInputDialog("SENHA: ");
        RedeSocial rede1 = new RedeSocial(dataCriacao, nomeUsuario, dataNascimento, senha);
        String dataPublicacao = new Date().toString();
        String textoPublicacao = JOptionPane.showInputDialog("TEXTO A PUBLICAR: ");
        String linksMideia = JOptionPane.showInputDialog("LINK DA PUBLICACAO: ");

        Publicacao publi = new Publicacao(dataPublicacao, textoPublicacao, linksMideia);
        dataPublicacao = new Date().toString();
        
        textoPublicacao = JOptionPane.showInputDialog("TEXTO A PUBLICAR: ");
        linksMideia = JOptionPane.showInputDialog("LINK DA PUBLICACAO: ");
        publi = new Publicacao(dataPublicacao, textoPublicacao, linksMideia);


        
        rede1.inserePublicacao(publi);
        rede1.imprimePublicacoes();
    }
}