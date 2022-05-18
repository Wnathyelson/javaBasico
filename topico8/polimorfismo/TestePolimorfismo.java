package home.nathyelson.programacaobasicaJava.topico8.polimorfismo;


public class TestePolimorfismo {

    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();
        Pessoa aluno = new Aluno();
        Pessoa professor = new Professor();

        System.out.println(pessoa.obterEtiquetaEndereco());
        System.out.println(aluno.obterEtiquetaEndereco());
        System.out.println(professor.obterEtiquetaEndereco());

    }

}
