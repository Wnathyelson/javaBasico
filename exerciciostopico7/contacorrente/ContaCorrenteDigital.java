package home.nathyelson.programacaobasicaJava.exerciciostopico7.contacorrente;

public class ContaCorrenteDigital {

    public static void main(String[] args) {

        ContaCorrente contaDigital = new ContaCorrente();
        contaDigital.numeroConta = 1;
        contaDigital.statusContaEspecial = true;
        contaDigital.limiteEspecial = 500;
        contaDigital.saldoConta = 1000;


        System.out.println("Saldo da conta: " + contaDigital.numeroConta + " = " + "R$ " + contaDigital.saldoConta +
                " Reais");

    }

}
