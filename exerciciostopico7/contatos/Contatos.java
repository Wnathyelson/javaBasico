package home.nathyelson.programacaobasicaJava.exerciciostopico7.contatos;

public class Contatos {

    public static void main(String[] args) {

        Contato contato = new Contato();
        contato.nomeContato = "Nathyelson";
        contato.sobrenomeContato = "Lima";
        contato.emailContato = "wnathyelson@gmail.com";
        contato.telefoneContato = "98389-1358";

        System.out.println("Nome: " + contato.nomeContato + "\n" +
                "Sobrenome: " + contato.sobrenomeContato + "\n" +
                "Email: " + contato.emailContato + "\n" +
                "Telefone: " + contato.telefoneContato + "\n");

    }

}
