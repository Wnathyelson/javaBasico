package home.nathyelson.programacaobasicaJava.exerciciostopico8.figurageometrica;

public class Piramide extends Figura3D implements DimensaoSuperficial, DimensaoVolumetrica {

    private double altura;
    private double arestaBase;
    private double apotema;

    private int numeroPoligonoBase;
    private Figura2D base;

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getArestaBase() {
        return arestaBase;
    }

    public void setArestaBase(double arestaBase) {
        this.arestaBase = arestaBase;
    }

    public double getApotema() {
        return apotema;
    }

    public void setApotema(double apotema) {
        this.apotema = apotema;
    }

    public Figura2D getBase() {
        return base;
    }

    public void setBase(Figura2D base) {
        this.base = base;
    }

    public void setNumeroPoligonoBase(int numeroPoligonoBase) {
        this.numeroPoligonoBase = numeroPoligonoBase;
    }

    public int getNumeroPoligonoBase() {
        return numeroPoligonoBase;
    }

    @Override
    public double calcularArea() {

        if (base != null) {

            return (numeroPoligonoBase * (arestaBase * apotema) / 2) + base.calcularArea();
        }
        return 0;

    }

    @Override
    public double calcularVolume() {

        if (base != null) {
            return base.calcularArea() * altura / 3;
        }
        return 0;
    }

}
