package exercicio5oo.testes;

import exercicio5oo.classes.ContaBancaria;

public class TesteContaBancaria {
    private static final String numeroConta = "12345-6";
    private static final String titular = "Lucas";
    private static final double saldo = 1500.50;
    private static final double deposito = 500.0;
    private static final double saque = 200.0;
    private static final double negativo = -100.0;

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();

        conta.setNumeroConta(numeroConta);
        conta.setTitular(titular);
        conta.setSaldo(saldo);

        System.out.println(conta);

        conta.depositar(deposito);
        conta.imprimirSaldo();

        conta.sacar(saque);
        conta.imprimirSaldo();

        conta.depositar(negativo);
        conta.sacar(negativo);
        conta.setSaldo(negativo);
        conta.imprimirSaldo();

        ContaBancaria contaParametrizada = new ContaBancaria(numeroConta, titular, saldo);
        System.out.println(contaParametrizada);
    }
}