package exercicio5oo.classes;

public class Aluno {
    private static final int quantidade_nota = 4;
    private static final double media_aprovacao = 7.0;
    private static final int nota_minima = 0;
    private static final int nota_maxima = 10;
    private String matricula;
    private String nome;
    private int idade;
    private int nota1;
    private int nota2;
    private int nota3;
    private int nota4;


    @Override
    public String toString() {
        return String.format("Aluno [matricula=%s, nome=%s, idade=%d, nota1=%d, nota2=%d, nota3=%d, nota4=%d]",
                this.matricula, this.nome, this.idade, this.nota1, this.nota2, this.nota3, this.nota4);
    }

    public Aluno() {
    }

    public Aluno(String matricula, String nome, int idade, int nota1, int nota2, int nota3, int nota4) {
        this.matricula = matricula;
        this.nome = nome;
        this.idade = idade;
        this.setNota1(nota1);
        this.setNota2(nota2);
        this.setNota3(nota3);
        this.setNota4(nota4);
    }

    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getNota1() {
        return this.nota1;
    }

    public void setNota1(int nota1) {
        if (this.notaValida(nota1)) {
            this.nota1 = nota1;
        }
    }

    public int getNota2() {
        return this.nota2;
    }

    public void setNota2(int nota2) {
        if (this.notaValida(nota2)) {
            this.nota2 = nota2;
        }
    }

    public int getNota3() {
        return this.nota3;
    }

    public void setNota3(int nota3) {
        if (this.notaValida(nota3)) {
            this.nota3 = nota3;
        }
    }

    public int getNota4() {
        return this.nota4;
    }

    public void setNota4(int nota4) {
        if (this.notaValida(nota4)) {
            this.nota4 = nota4;
        }
    }

    private boolean notaValida(int nota) {
        return nota >= nota_minima && nota <= nota_maxima;
    }

    public double calcularMedia() {
        return (this.nota1 + this.nota2 + this.nota3 + this.nota4) / (double) quantidade_nota;
    }

    public void imprimirSituacao() {
        String situacao = this.calcularMedia() >= media_aprovacao ? "Aprovado" : "Reprovado";
        System.out.printf("Situacao: %s%n", situacao);
    }

}