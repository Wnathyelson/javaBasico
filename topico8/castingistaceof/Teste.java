package home.nathyelson.programacaobasicaJava.topico8.castingistaceof;

public class Teste {

    public static void main(String[] args) {

        /*Aluno aluno = new Aluno();
        Pessoa pessoaAluno = aluno; //Upcasting;

        Object obj1 = obterString();
        String s1 = (String) obj1; //Downcasting;

        Object obj2 = "Minha string";
        String s2 = (String) obj2; //Upcasting;
        */
        Pessoa pessoa = new Pessoa();
        Aluno aluno = new Aluno();
        Professor professor = new Professor();

        if (pessoa instanceof Pessoa) {
            System.out.println("pessoa é do tipo Pessoa");
            if (aluno instanceof Aluno) {
                System.out.println("pessoa é do tipo Pessoa");
                if (professor instanceof Professor) {
                    System.out.println("pessoa é do tipo Pessoa");
                }

            }
        }
    }

    public static String obterString() {

        return "Minha string";
    }
}

