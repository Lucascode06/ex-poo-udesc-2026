package exercicio5oo.testes;

import exercicio5oo.classes.Carro;

public class TesteCarro {
    private static final String modelo = "Golf";
    private static final String marca = "Volkswagen";
    private static final int ano = 2026;
    private static final double velocidade = 120.5;
    private static final double acima = 301;
    private static final double negativa = -10;
    private static final double abaixo = 5;
    private static final double alta = 295;

    public static void main(String[] args) {
        Carro carro = new Carro();

        carro.setModelo(modelo);
        carro.setMarca(marca);
        carro.setAno(ano);
        carro.setVelocidade(velocidade);

        System.out.println(carro);

        carro.acelerar();
        carro.imprimirVelocidade();

        carro.frear();
        carro.imprimirVelocidade();

        carro.setVelocidade(acima);
        carro.imprimirVelocidade();
        carro.setVelocidade(negativa);
        carro.imprimirVelocidade();

        carro.setVelocidade(abaixo);
        carro.frear();
        carro.imprimirVelocidade();

        carro.setVelocidade(alta);
        carro.acelerar();
        carro.imprimirVelocidade();

        Carro carroParametrizado = new Carro(modelo, marca, ano, velocidade);
        System.out.println(carroParametrizado);
    }
}