package exercicio2oo.testes;

import exercicio2oo.classes.Livro;

public class TesteLivro {
    public static void main(String[] args) {

        Livro livro = new Livro();

        livro.titulo = "Harry Potter e a Pedra Filosofal";
        livro.autor = "J. K. Rowling";
        livro.genero = "Fantasia";
        livro.emprestado = false;

        System.out.println("Titulo: " + livro.titulo);
        System.out.println("Autor: " + livro.autor);
        System.out.println("Genero: " + livro.genero);
        System.out.println("Emprestado: " + livro.emprestado);
    }
}
