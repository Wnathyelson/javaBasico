package home.nathyelson.programacaoBasicaJava.exerciciosTopico7.agendaTelefonica;

public class contatoAgenda {

    public static void main(String[] args) {

        agendaTelefonica contato = new agendaTelefonica();
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
