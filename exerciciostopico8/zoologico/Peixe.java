package home.nathyelson.programacaobasicaJava.exerciciostopico8.zoologico;

public class Peixe extends Animal {

    private String caracteristicas;


    public Peixe() {
        super();
        this.setPatas(0);
        this.setAmbiente("Mar");
        this.setCor("Cinza");
        this.caracteristicas = "Com barbatanas e cauda.";

    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }


    public String toString() {

        String s = super.toString();
        s += "\nCaracterísticas: " + caracteristicas;

        return s;

    }
}
