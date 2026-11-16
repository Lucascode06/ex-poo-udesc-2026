package exercicio5oo.testes;

import exercicio5oo.classes.Aluno;

public class TesteAluno {
    private static final String matricula = "123456";
    private static final String nome = "Lucas";
    private static final int idade = 19;
    private static final int nota_1 = 8;
    private static final int nota_2 = 7;
    private static final int nota_3 = 9;
    private static final int nota_4 = 10;
    private static final int acima = 11;
    private static final int abaixo = -1;

    public static void main(String[] args) {
        Aluno aluno = new Aluno();

        aluno.setMatricula(matricula);
        aluno.setNome(nome);
        aluno.setIdade(idade);
        aluno.setNota1(nota_1);
        aluno.setNota2(nota_2);
        aluno.setNota3(nota_3);
        aluno.setNota4(nota_4);

        System.out.println(aluno);
        System.out.printf("Media: %.2f%n", aluno.calcularMedia());
        aluno.imprimirSituacao();

        aluno.setNota1(acima);
        aluno.setNota2(abaixo);
        System.out.printf("Nota 1 apos valor invalido: %d%n", aluno.getNota1());
        System.out.printf("Nota 2 apos valor invalido: %d%n", aluno.getNota2());

        Aluno alunoParametrizado = new Aluno(matricula, nome, idade, nota_1, nota_2, nota_3, nota_4);
        System.out.println(alunoParametrizado);
    }
}