package home.nathyelson.programacaobasicaJava.exerciciostopico7.agendatelefonica;

import javax.sound.midi.Soundbank;

public class TesteAgenda {

    public static void main(String[] args) {

        Agenda agenda = new Agenda();


        agenda.setNome("Loja");

        Contato contato = new Contato();

        contato.setNome("João");
        contato.setTelefone("xx 00000-0000");
        contato.setEmail("teste1@gmail.com");

        Contato contato2 = new Contato();

        contato2.setNome("Maria");
        contato2.setTelefone("xx 00000-0000");
        contato2.setEmail("teste2@gmail.com");

        Contato contato3 = new Contato();

        contato3.setNome("José");
        contato3.setTelefone("xx 00000-0000");
        contato3.setEmail("teste3@gmail.com");

        Contato[] contatos = new Contato[3];

        contatos[0] = contato;
        contatos[1] = contato2;
        contatos[2] = contato3;

        agenda.setContatos(contatos);

        System.out.println("Agenda do(a): " + agenda.getNome());

        if (contato != null && agenda.getContatos() != null) {

            for (Contato c : agenda.getContatos()) {

                System.out.println("Nome:" + c.getNome() + "\n" + " Número: " + c.getTelefone() + "\n" +
                        " Email: " + c.getEmail());
            }

        }

    }

}
