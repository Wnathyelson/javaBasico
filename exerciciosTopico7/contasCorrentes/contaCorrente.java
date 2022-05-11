package home.nathyelson.programacaoBasicaJava.exerciciosTopico7.contasCorrentes;

public class contaCorrente {

    public static void main(String[] args) {

        contasCorrentes conta = new contasCorrentes();

        conta.numeroConta = 1;
        conta.saldoConta = 1000;
        conta.statusContaEspecial = true;
        conta.limiteEspecial = 500;

        boolean saqueEfetuado = conta.realizarSaque(500);

        if (saqueEfetuado) {

            System.out.println("Saque efetuado com sucesso!");
            System.out.println("Saldo atual: " + conta.saldoConta);
        } else {

            System.out.println("Não foi possível realizar saque. Saldo insuficiente!");
        }

        System.out.println("Depósito de 500 reais.");
        conta.realizarDeposito(500);
        System.out.println("Saldo atual da conta: " + conta.saldoConta);

        conta.consultarSaldo();
        if (conta.verificarChequeEspecial()) {

            System.out.println("Está usando cheque especial!");

        } else {

            System.out.println("Não está usando cheque especial!");

        }

    }
}
