package home.nathyelson.programacaobasicaJava.exerciciostopico8.zoologico;

public class Mamifero extends Animal {

    private String alimento;

    public Mamifero() {
        super();
        this.setAmbiente("Terra");
        this.setCor("Castanho");
        this.alimento = "Mel";

    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public String toString() {

        String s = super.toString();
        s += "\nAlimento: " + alimento;

        return s;

    }
}
