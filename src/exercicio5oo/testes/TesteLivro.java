package exercicio5oo.testes;

import exercicio5oo.classes.Livro;

public class TesteLivro {
    private static final String titulo = "Harry Potter e a Pedra Filosofal";
    private static final String autor = "J. K. Rowling";
    private static final String genero = "Fantasia";
    private static final boolean emprestado = false;

    public static void main(String[] args) {
        Livro livro = new Livro();

        livro.setTitulo(titulo);
        livro.setAutor(autor);
        livro.setGenero(genero);
        livro.setEmprestado(emprestado);

        System.out.println(livro);
        System.out.printf("Disponivel: %b%n", livro.estaDisponivel());

        livro.emprestar();
        System.out.printf("Disponivel apos emprestar: %b%n", livro.estaDisponivel());

        livro.emprestar();
        System.out.printf("Disponivel apos emprestar de novo: %b%n", livro.estaDisponivel());

        livro.devolver();
        System.out.printf("Disponivel apos devolver: %b%n", livro.estaDisponivel());

        livro.devolver();
        System.out.printf("Disponivel apos devolver de novo: %b%n", livro.estaDisponivel());

        Livro livroParametrizado = new Livro(titulo, autor, genero, emprestado);
        System.out.println(livroParametrizado);
    }
}