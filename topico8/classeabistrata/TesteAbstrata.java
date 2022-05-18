package home.nathyelson.programacaobasicaJava.topico8.classeabistrata;

public class TesteAbstrata {

    public static void main(String[] args) {

        //Pessoa pessoa = new Pessoa();

        Pessoa aluno = new Aluno();
        Pessoa professor = new Professor();

        aluno.setEndereco("Rua1, número 1");
        professor.setEndereco("Rua2, número 2");

        //aluno.imprimirEtiquetaEndereco();
        //professor.imprimirEtiquetaEndereco();

        aluno.imprimirEtiquetaEndereco();
        professor.imprimirEtiquetaEndereco();

    }

}
