package home.nathyelson.programacaobasicaJava.topico8.object;

public class Teste {

    public static void main(String[] args) {

        Aluno aluno = new Aluno();

        aluno.setCurso("Ciência da computação");

        double[] notas = {10, 8, 7, 8};

        aluno.setNotas(notas);

        System.out.println(aluno);


        String s1 = "alkslkjsalk";
        String s2= "alkslkjsalk";

        //System.out.println((s1 == s2));
        System.out.println((s1.equalsIgnoreCase(s2)));

    }

}
