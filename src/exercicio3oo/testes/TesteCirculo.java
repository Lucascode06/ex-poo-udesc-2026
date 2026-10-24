package exercicio3oo.testes;

import exercicio3oo.classes.Circulo;

public class TesteCirculo {
    private static final double raio = 5.0;

    public static void main(String[] args) {
        Circulo circulo = new Circulo();

        circulo.setRaio(raio);

        System.out.printf("Raio: %.1f%n", circulo.getRaio());
    }
}