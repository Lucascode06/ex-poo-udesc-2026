package exercicio1oo;

public class TesteLivro {
    public static void main(String[] args) {

        Livro livro = new Livro();

        livro.titulo = "O Senhor dos Aneis";
        livro.autor = "J. R. R. Tolkien";
        livro.genero = "Fantasia";
        livro.emprestado = false;

        System.out.println("Titulo: " + livro.titulo);
        System.out.println("Autor: " + livro.autor);
        System.out.println("Genero: " + livro.genero);
        System.out.println("Emprestado: " + livro.emprestado);
    }
}
