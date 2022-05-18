package home.nathyelson.programacaobasicaJava.topico8.classeabistrata;

public class Aluno extends Pessoa {

    private String curso;
    private double[][] notas;

    public Aluno() {
        super();
    }

    public Aluno(String nome, String endereco, String telefone, String curso) {
        super(nome, endereco, telefone);
        this.curso = curso;
    }


    public static double calcularMedia() {

        return 0;
    }

    public static boolean verificarAprovado() {

        return true;
    }

    public String obterEtiquetaEndereco() {

        String s = "Endereço do aluno: ";

        s += super.getEndereco();

        return s;

    }

    @Override
    public void imprimirEtiquetaEndereco() {

        System.out.println("Imprimindo endereço do aluno ");
        System.out.println(this.obterEtiquetaEndereco());

    }

}
