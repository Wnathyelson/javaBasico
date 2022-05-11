package home.nathyelson.programacaoBasicaJava.exerciciosTopico7.contasCorrentes;

public class contasCorrentes {

    int numeroConta;
    double saldoConta;
    boolean statusContaEspecial = true;
    boolean chequeEspecial = true;
    double limiteEspecial;

    boolean realizarSaque(double valorSaque) {

        if (saldoConta >= valorSaque) {

            saldoConta -= valorSaque;
            return true;

        } else {

            if (statusContaEspecial) {

                double limite = limiteEspecial - saldoConta;
                if (limite >= valorSaque) {

                    saldoConta -= valorSaque;
                    return true;

                } else {

                    return false;
                }

            } else {

                return false;
            }

        }
    }

    void realizarDeposito(double valorDepositado) {

        saldoConta += valorDepositado;

    }

    void consultarSaldo() {

        System.out.println("Saldo atual da conta: " + saldoConta);

    }

    boolean verificarChequeEspecial() {

        return saldoConta < 0;

    }
}
