package home.nathyelson.programacaobasicaJava;

public class Imc {

    public float calcularImc(float peso, float altura) {

        float imc;

        imc = peso / altura * altura;

        return imc;

    }

}

