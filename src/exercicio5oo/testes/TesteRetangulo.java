package exercicio5oo.testes;

import exercicio5oo.classes.Retangulo;

public class TesteRetangulo {
    private static final double altura = 10;
    private static final double largura = 10;
    private static final double acima = 1001;
    private static final double abaixo = -5;

    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo();

        retangulo.setLargura(largura);
        retangulo.setAltura(altura);

        System.out.println(retangulo);
        System.out.printf("wArea: %.1f%n", retangulo.calcularArea());

        retangulo.setLargura(acima);
        retangulo.setAltura(abaixo);
        System.out.printf("Largura apos valor invalido: %.1f%n", retangulo.getLargura());
        System.out.printf("Altura apos valor invalido: %.1f%n", retangulo.getAltura());

        Retangulo retanguloParametrizado = new Retangulo(largura, altura);
        System.out.println(retanguloParametrizado);
    }
}