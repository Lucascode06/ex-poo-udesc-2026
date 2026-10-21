package exercicio1oo;

public class TesteCarro {
    public static void main(String[] args) {

        Carro carro = new Carro();

        carro.modelo = "Golf";
        carro.marca = "Volkswagen ";
        carro.ano = 2026;
        carro.velocidade = 120.5;

        System.out.println("Modelo: " + carro.modelo);
        System.out.println("Marca: " + carro.marca);
        System.out.println("Ano: " + carro.ano);
        System.out.println("Velocidade: " + carro.velocidade);
    }
}
