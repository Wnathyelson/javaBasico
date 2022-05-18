package home.nathyelson.programacaobasicaJava.exerciciostopico8.figurageometrica;

public class Circulo extends Figura2D implements DimensaoSuperficial {

    private double raio;

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {

        return raio * raio * 3.14;
    }
}
