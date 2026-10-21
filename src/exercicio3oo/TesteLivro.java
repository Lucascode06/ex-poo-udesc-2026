package exercicio3oo;

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

        System.out.printf("Titulo: %s%n", livro.getTitulo());
        System.out.printf("Autor: %s%n", livro.getAutor());
        System.out.printf("Genero: %s%n", livro.getGenero());
        System.out.printf("Emprestado: %s%n", livro.isEmprestado());
    }
}
