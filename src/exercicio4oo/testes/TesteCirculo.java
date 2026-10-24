package exercicio4oo.testes;

import exercicio4oo.classes.Circulo;

public class TesteCirculo {
    private static final double raio = 5.0;

    public static void main(String[] args) {
        Circulo circulo = new Circulo();

        circulo.setRaio(raio);

        System.out.printf("Raio: %.1f%n", circulo.getRaio());
        System.out.printf("Diametro: %.1f%n", circulo.calcularDiametro());
        System.out.printf("Perimetro: %.2f%n", circulo.calcularPerimetro());
        System.out.printf("Area: %.2f%n", circulo.calcularArea());
    }
}