package exercicio4oo.testes;

import exercicio4oo.classes.Retangulo;

public class TesteRetangulo {
    private static final double altura = 10;
    private static final double largura = 10;

    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo();

        retangulo.setLargura(largura);
        retangulo.setAltura(altura);

        System.out.printf("Largura: %.1f%n", retangulo.getLargura());
        System.out.printf("Altura: %.1f%n", retangulo.getAltura());
        System.out.printf("Area: %.1f%n", retangulo.calcularArea());
    }
}