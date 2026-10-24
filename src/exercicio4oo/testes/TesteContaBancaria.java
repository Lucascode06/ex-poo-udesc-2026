package exercicio4oo.testes;

import exercicio4oo.classes.ContaBancaria;

public class TesteContaBancaria {
    private static final String numeroConta = "12345-6";
    private static final String titular = "Lucas";
    private static final double saldo = 1500.50;
    private static final double valorDeposito = 500.0;
    private static final double valorSaque = 200.0;

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();

        conta.setNumeroConta(numeroConta);
        conta.setTitular(titular);
        conta.setSaldo(saldo);

        System.out.printf("Numero da conta: %s%n", conta.getNumeroConta());
        System.out.printf("Titular: %s%n", conta.getTitular());
        conta.imprimirSaldo();

        conta.depositar(valorDeposito);
        conta.imprimirSaldo();

        conta.sacar(valorSaque);
        conta.imprimirSaldo();
    }
}