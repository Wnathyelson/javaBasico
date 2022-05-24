package home.nathyelson.programacaobasicaJava.topico9.exceptions;

public class NaoInteiroException extends Exception {


    private int numeroMultiplos;
    private int denominadores;

    public NaoInteiroException(int numeroMultiplos, int denominadores) {
        super();
        this.numeroMultiplos = numeroMultiplos;
        this.denominadores = denominadores;

    }

    @Override
    public String toString() {

        return "Resultado de " + numeroMultiplos + "/" + denominadores + " não é um inteiro!";
    }
}
