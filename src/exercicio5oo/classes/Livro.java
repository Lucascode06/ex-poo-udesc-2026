package exercicio5oo.classes;

public class Livro {
    private String titulo;
    private String autor;
    private String genero;
    private boolean emprestado;

    @Override
    public String toString() {
        return String.format("Livro [titulo=%s, autor=%s, genero=%s, emprestado=%b]",
                this.titulo, this.autor, this.genero, this.emprestado);
    }

    public Livro() {
    }

    public Livro(String titulo, String autor, String genero, boolean emprestado) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.emprestado = emprestado;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return this.genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public boolean isEmprestado() {
        return this.emprestado;
    }

    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }

    public void emprestar() {
        if (this.estaDisponivel()) {
            this.emprestado = true;
        }
    }

    public void devolver() {
        if (this.emprestado) {
            this.emprestado = false;
        }
    }

    public boolean estaDisponivel() {
        return !this.emprestado;
    }

}