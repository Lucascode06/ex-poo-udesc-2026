package exercicio3oo;

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

        aluno.setMatricula(matricula);
        aluno.setNome(nome);
        aluno.setIdade(idade);
        aluno.setNota1(nota_1);
        aluno.setNota2(nota_2);
        aluno.setNota3(nota_3);
        aluno.setNota4(nota_4);

        System.out.printf("Matricula: %s%n", aluno.getMatricula());
        System.out.printf("Nome: %s%n", aluno.getNome());
        System.out.printf("Idade: %d%n", aluno.getIdade());
        System.out.printf("Nota 1: %d%n", aluno.getNota1());
        System.out.printf("Nota 2: %d%n", aluno.getNota2());
        System.out.printf("Nota 3: %d%n", aluno.getNota3());
        System.out.printf("Nota 4: %d%n", aluno.getNota4());
    }
}