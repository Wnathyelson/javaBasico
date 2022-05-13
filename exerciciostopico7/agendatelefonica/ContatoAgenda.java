package home.nathyelson.programacaobasicaJava.exerciciostopico7.agendatelefonica;

public class ContatoAgenda {

    public static void main(String[] args) {

        AgendaTelefonica contato = new AgendaTelefonica();
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
