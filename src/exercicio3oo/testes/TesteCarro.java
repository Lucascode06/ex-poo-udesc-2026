package exercicio3oo.testes;

import exercicio3oo.classes.Carro;

public class TesteCarro {
    private static final String modelo = "Golf";
    private static final String marca = "Volkswagen";
    private static final int ano = 2026;
    private static final double velocidade = 120.5;

    public static void main(String[] args) {
        Carro carro = new Carro();

        carro.setModelo(modelo);
        carro.setMarca(marca);
        carro.setAno(ano);
        carro.setVelocidade(velocidade);

        System.out.printf("Modelo: %s%n", carro.getModelo());
        System.out.printf("Marca: %s%n", carro.getMarca());
        System.out.printf("Ano: %d%n", carro.getAno());
        System.out.printf("Velocidade: %.1f%n", carro.getVelocidade());
    }
}