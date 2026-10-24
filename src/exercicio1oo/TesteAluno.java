package exercicio1oo;

public class TesteAluno {
    private static final String matricula = "123456";
    private static final String nome = "Lucas";
    private static final int idade = 19;
    private static final int nota_1 = 8;
    private static final int nota_2 = 7;
    private static final int nota_3 = 9;
    private static final int nota_4 = 10;

    public static void main(String[] args) {
        Aluno aluno = new Aluno();

        aluno.matricula = matricula;
        aluno.nome = nome;
        aluno.idade = idade;
        aluno.nota1 = nota_1;
        aluno.nota2 = nota_2;
        aluno.nota3 = nota_3;
        aluno.nota4 = nota_4;

        System.out.println("Matricula: " + aluno.matricula);
        System.out.println("Nome: " + aluno.nome);
        System.out.println("Idade: " + aluno.idade);
        System.out.println("Nota 1: " + aluno.nota1);
        System.out.println("Nota 2: " + aluno.nota2);
        System.out.println("Nota 3: " + aluno.nota3);
        System.out.println("Nota 4: " + aluno.nota4);
    }
}