package exercicio2oo.testes;

import exercicio2oo.classes.Aluno;

public class TesteAluno {
    public static void main(String[] args) {

        Aluno aluno = new Aluno();

        aluno.matricula = "123456";
        aluno.nome = "Lucas";
        aluno.idade = 19;
        aluno.nota1 = 8;
        aluno.nota2 = 7;
        aluno.nota3 = 9;
        aluno.nota4 = 10;

        System.out.println("Matricula: " + aluno.matricula);
        System.out.println("Nome: " + aluno.nome);
        System.out.println("Idade: " + aluno.idade);
        System.out.println("Nota 1: " + aluno.nota1);
        System.out.println("Nota 2: " + aluno.nota2);
        System.out.println("Nota 3: " + aluno.nota3);
        System.out.println("Nota 4: " + aluno.nota4);
    }
}