package home.nathyelson.programacaobasicaJava.exerciciostopico8.figurageometrica;

public class Quadrado extends Figura2D implements DimensaoSuperficial {


    private int lado;

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }


    @Override
    public double calcularArea() {
        return lado * lado;

    }
}
