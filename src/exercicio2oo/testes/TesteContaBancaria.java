package exercicio2oo.testes;

import exercicio2oo.classes.ContaBancaria;

public class TesteContaBancaria {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();

        conta.numeroConta = "12345";
        conta.titular = "Lucas";
        conta.saldo = 1500.50;

        System.out.println(conta.numeroConta);
        System.out.println(conta.titular);
        System.out.println(conta.saldo);
    }
}
