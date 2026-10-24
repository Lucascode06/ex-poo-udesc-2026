package exercicio1oo;

public class TesteLivro {
    private static final String tirulo = "Harry Potter e a Pedra Filosofal";
    private static final String autor = "J. K. Rowling";
    private static final String genero = "fantasia";
    private static final boolean emprestado = false;

    public static void main(String[] args) {
        Livro livro = new Livro();

        livro.titulo = tirulo;
        livro.autor = autor;
        livro.genero = genero;
        livro.emprestado = emprestado;

        System.out.println("Titulo: " + livro.titulo);
        System.out.println("Autor: " + livro.autor);
        System.out.println("Genero: " + livro.genero);
        System.out.println("Emprestado: " + livro.emprestado);
    }
}