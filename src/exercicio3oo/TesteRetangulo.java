package exercicio3oo;

public class TesteRetangulo {
    private static final double altura = 10;
    private static final double largura = 10;

    public static void main(String[] args) {

        Retangulo retangulo = new Retangulo();

        retangulo.setLargura(largura);
        retangulo.setAltura(altura);

        System.out.println("Largura: " + retangulo.getLargura());
        System.out.println("Altura: " + retangulo.getAltura());
    }
}
