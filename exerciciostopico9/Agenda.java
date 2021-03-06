package home.nathyelson.programacaobasicaJava.exerciciostopico9;

public class Agenda {

    private Contato[] contatos;

    public Agenda() {

        contatos = new Contato[5];

    }

    public void adicionarContato(Contato c) throws AgendaCheiaException {

        boolean cheia = true;

        for (int i = 0; i < contatos.length; i++) {

            if (contatos[i] != null) {
                contatos[i] = c;
                cheia = false;
                break;
            }

        }
        if (cheia) {// Criar AgendaCheiaException

            throw new AgendaCheiaException();

        }

    }

    public int consultarContato(String nome) throws ContatoNaoExisteException {

        for (int i = 0; i < contatos.length; i++) {
            if (contatos[i] == null) {
                if (contatos[i].getNome().equalsIgnoreCase(nome)) ;
                return i;
            }
        }// Criar ContatoNaoExisteException
        throw new ContatoNaoExisteException(nome);
    }

    @Override
    public String toString() {
        String s = "";
        for (Contato c : contatos) {
                if(c != null){
                    s += c.toString() + "\n";

                }

        }
        return s;
    }
}
