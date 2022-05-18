package home.nathyelson.programacaobasicaJava.topico7.relacionamentoentreclasses;

public class TesteTemUmContato {

    public static void main(String[] args) {

        Contato contato = new Contato();

        contato.setNome("Nathyelson");

        Telefone telefone = new Telefone();

        telefone.setTipo("Celular");
        telefone.setDdd("91");
        telefone.setNumero("98389-1358");

        Telefone telefone2 = new Telefone();

        telefone2.setTipo("Fixo");
        telefone2.setDdd("91");
        telefone2.setNumero("98144-3323");

        Telefone[] telefones = new Telefone[2];

        telefones[0] = telefone;
        telefones[1] = telefone2;

        contato.setTelefones(telefones);

        Endereco endereco = new Endereco();

        endereco.setNomeRua("Oliveira");
        endereco.setNumeroRua("s/n");
        endereco.setComplemento("Próximo a construção");
        endereco.setCidade("Santa Maria");
        endereco.setEstado("PA");
        endereco.setCep("68738-000");

        contato.setEndereco(endereco);

        //contato.setTelefone(telefone);

        System.out.println("Nome: " + contato.getNome());
        //System.out.println("Telefone: " + contato.getTelefone());

        if (contato != null && contato.getEndereco() != null) {

            System.out.println("Cidade: " + contato.getEndereco().getCidade());
            System.out.println("Estado: " + contato.getEndereco().getEstado());
            System.out.println("Nome da rua: " + contato.getEndereco().getNomeRua());
            System.out.println("Número da rua: " + contato.getEndereco().getNumeroRua());
            System.out.println("CEP: " + contato.getEndereco().getCep());

        }

        if (contato != null && contato.getTelefones() != null) {

            for (Telefone t : contato.getTelefones()) {

                System.out.println("Telefones: " + t.getTipo() + " " + t.getDdd() + " " + t.getNumero());

            }

        }

        // if (contato != null && contato.getTelefone() != null) {


        //System.out.println("Telefone: " + contato.getTelefone().getTipo() + "\n" + contato.getTelefone().getDdd()+
        //  " "+ contato.getTelefone().getNumero());

    }

}
