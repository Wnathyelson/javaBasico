package home.nathyelson.programacaobasicaJava.topico8.chavesuper;

public class Professor extends Pessoa {

    private String departamento;
    private String nomeCurso;
    private double salario;

    public Professor() {
        super();
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public static double calcularSalarioLiquido() {

        return 0;
    }

    public String obterEtiquetaEndereco() {

        String s = "Endereço do Professor: ";

        s += super.getEndereco();

        return s;

    }

}
