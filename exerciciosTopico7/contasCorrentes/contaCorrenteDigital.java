package home.nathyelson.programacaoBasicaJava.exerciciosTopico7.contasCorrentes;

public class contaCorrenteDigital {

    public static void main(String[] args) {

        contasCorrentes contaDigital = new contasCorrentes();
        contaDigital.numeroConta = 1;
        contaDigital.statusContaEspecial = true;
        contaDigital.limiteEspecial = 500;
        contaDigital.saldoConta = 1000;


        System.out.println("Saldo da conta: " + contaDigital.numeroConta + " = " + "R$ " + contaDigital.saldoConta +
                " Reais");

    }

}
