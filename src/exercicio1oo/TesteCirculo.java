package exercicio1oo;

public class TesteCirculo {
    private static final double raio = 5.0;

    public static void main(String[] args) {
        Circulo circulo = new Circulo();

        circulo.raio = raio;

        System.out.println("Raio: " + circulo.raio);
    }
}