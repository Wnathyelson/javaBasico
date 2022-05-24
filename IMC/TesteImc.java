package home.nathyelson.programacaobasicaJava;

public class TesteImc {

    public static void main(String[] args) {



        System.out.println(calcularImc(60,1.80f));

    }

  static float calcularImc(float peso, float altura) {

        float imc;

        imc = peso / (altura * altura);

        return imc;

    }
}
