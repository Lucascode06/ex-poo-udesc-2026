package exercicio5oo.testes;

import exercicio5oo.classes.Circulo;

public class TesteCirculo {
    private static final double raio = 5.0;
    private static final double acima = 1001;
    private static final double abaixo = -2;

    public static void main(String[] args) {
        Circulo circulo = new Circulo();

        circulo.setRaio(raio);

        System.out.println(circulo);
        System.out.printf("Diametro: %.1f%n", circulo.calcularDiametro());
        System.out.printf("Perimetro: %.2f%n", circulo.calcularPerimetro());
        System.out.printf("Area: %.2f%n", circulo.calcularArea());

        circulo.setRaio(acima);
        System.out.printf("Raio apos valor acima do limite: %.1f%n", circulo.getRaio());
        circulo.setRaio(abaixo);
        System.out.printf("Raio apos valor abaixo do limite: %.1f%n", circulo.getRaio());

        Circulo circuloParametrizado = new Circulo(raio);
        System.out.println(circuloParametrizado);
    }
}