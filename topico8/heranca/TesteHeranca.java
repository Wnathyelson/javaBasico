package home.nathyelson.programacaobasicaJava.topico8.heranca;

public class TesteHeranca {

    public static void main(String[] args) {

        Aluno aluno = new Aluno();

        aluno.setNome("Juca");
        aluno.setEndereco("Rua herança");
        aluno.setTelefone("xx 00000-0000");
        aluno.setCpf("xxx.xxx.xxx-xx");

        Pessoa aluno2 = new Pessoa();

        aluno2.setNome("");
        aluno2.setEndereco("");
        aluno2.setTelefone("");
        aluno2.setCpf("");

    }

}
