package home.nathyelson.programacaobasicaJava.exerciciostopico9;

import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {


        /* Contato contato = new Contato();
        System.out.println(contato);

        Contato contato2 = new Contato();
        System.out.println(contato2);

        Contato contato3 = new Contato();
        System.out.println(contato3); */

        Scanner scanj = new Scanner(System.in);

        Agenda agenda = new Agenda();

        int opcao = 1;

        while (opcao != 4) {

            opcao = obterOpcaoMenu(scanj);

            if (opcao == 1) {// Consultar contato

                consultarContato(scanj, agenda);

            } else if (opcao == 2) {// Adicionar contato

                adicionarContato(scanj, agenda);

            } else if (opcao == 3) {// Sair da agenda
                System.exit(0);

            }
        }
    }

    public static void adicionarContato(Scanner scanj, Agenda agenda) {
        try {
            System.out.println("Criando um contato entre com as informações");
            String nome = lerInformacao(scanj, "Entre com o nome do contato: ");
            String telefone = lerInformacao(scanj, "Entre com o telefone do contato: ");
            String email = lerInformacao(scanj, "Entre com o email do contato: ");

            Contato contato = new Contato();

            contato.setNome(nome);
            contato.setTelefone(telefone);
            contato.setEmail(email);

            System.out.println("Contato a ser criado: ");
            System.out.println(contato);

            agenda.adicionarContato(contato);
        } catch (AgendaCheiaException e) {
            System.out.println(e.getMessage());

            System.out.println("Contatos da agenda");
            System.out.println(agenda);

        }
    }

    public static void consultarContato(Scanner scanj, Agenda agenda) {

        String nomeContato = lerInformacao(scanj, "Entre com o nome do contato a ser pesquisado");

        try {
            if (agenda.consultarContato(nomeContato) >= 0) {
                System.out.println("Contato existe");

            }
        } catch (ContatoNaoExisteException e) {
            System.out.println(e.getMessage());
        }
    }

    public static String lerInformacao(Scanner scanj, String mensagem) {

        System.out.println(mensagem);
        String entrada = scanj.nextLine();
        return entrada;

    }

    public static int obterOpcaoMenu(Scanner scanj) {

        boolean entradaValida = false;
        int opcao = 3;

        while (!entradaValida) {
            System.out.println("Digite a opção desejada: ");
            System.out.println("1: Consultar contato");
            System.out.println("2: Adicionar contato");
            System.out.println("3: Sair");

            try {
                String entrada = scanj.nextLine();
                opcao = Integer.parseInt(entrada);

                if (opcao == 1 || opcao == 2 || opcao == 3) {
                    entradaValida = true;

                } else {
                    throw new Exception("Entrada inválida");
                }

            } catch (Exception e) {
                System.out.println("Entrada inválida, digite novamente! \n");
            }

        }
        return opcao;
    }
}
