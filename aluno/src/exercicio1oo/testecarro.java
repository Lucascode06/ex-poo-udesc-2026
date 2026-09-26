package exercicio1oo;

public class testecarro {
    public static void main(String[] args) {

        carro carro = new carro();

        carro.modelo = "Civic";
        carro.marca = "Honda";
        carro.ano = 2024;
        carro.velocidade = 120.5;

        System.out.println("Modelo: " + carro.modelo);
        System.out.println("Marca: " + carro.marca);
        System.out.println("Ano: " + carro.ano);
        System.out.println("Velocidade: " + carro.velocidade);
    }
}
