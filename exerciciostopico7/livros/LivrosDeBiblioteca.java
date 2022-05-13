package home.nathyelson.programacaobasicaJava.exerciciostopico7.livros;

import java.util.Date;

public class LivrosDeBiblioteca {


    public static void main(String[] args) {

        Livro livroEmprestado = new Livro();

        livroEmprestado.nomeLivro = "Percy Jackson, o mar de monstros";
        livroEmprestado.codigoLivro = 12345;
        livroEmprestado.emprestado = true;
        livroEmprestado.emprestadoPara = "Nathyelson";
        livroEmprestado.dataEmprestimo = new Date();
        livroEmprestado.dataEntrega = new Date();

        System.out.println("Informações sobre este livro: \n" +
                "Nome do livro: " + livroEmprestado.nomeLivro + "\n" +
                "Código do livro: " + livroEmprestado.codigoLivro + "\n" +
                "Emprestado: " + livroEmprestado.emprestado + "\n" +
                "Emprestado para: " + livroEmprestado.emprestadoPara + "\n" +
                "Data de empréstimo: " + livroEmprestado.dataEmprestimo + "\n" +
                "Data de entrega: " + livroEmprestado.dataEntrega + "\n");
    }

}
