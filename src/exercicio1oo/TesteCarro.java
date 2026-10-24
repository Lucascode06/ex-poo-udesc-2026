package exercicio1oo;

public class TesteCarro {
    private static final String modealo = "Golf";
    private static final String marca = "Volkswagen";
    private static final int ano = 2026;
    private static final double velocidade = 120;

    public static void main(String[] args) {
        Carro carro = new Carro();

        carro.modelo = modealo;
        carro.marca = marca;
        carro.ano = ano;
        carro.velocidade = velocidade;

        System.out.println("Modelo: " + carro.modelo);
        System.out.println("Marca: " + carro.marca);
        System.out.println("Ano: " + carro.ano);
        System.out.println("Velocidade: " + carro.velocidade);
    }
}