package home.nathyelson.programacaobasicaJava.topico8.heranca;

public class Aluno extends Pessoa {

    private String[] cursos;
    private double[][] notas;

    public String[] getCursos() {
        return cursos;
    }

    public void setCursos(String[] cursos) {
        this.cursos = cursos;
    }

    public double[][] getNotas() {
        return notas;
    }

    public void setNotas(double[][] notas) {
        this.notas = notas;
    }

    public static double calcularMedia() {

        return 0;
    }

    public static boolean verificarAprovado() {

        return true;
    }

}
