package exercicio1oo;

public class TesteRetangulo {
    private static final double largura = 10.0;
    private static final double altura = 5.0;

    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo();

        retangulo.largura = largura;
        retangulo.altura = altura;

        System.out.println("Largura: " + retangulo.largura);
        System.out.println("Altura: " + retangulo.altura);
    }
}