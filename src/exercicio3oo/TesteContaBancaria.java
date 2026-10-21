package exercicio3oo;

public class TesteContaBancaria {
    private static final String numeroConta = "12345-6";
    private static final String titular = "Lucas";
    private static final double saldo = 1500.50;

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();

        conta.setNumeroConta(numeroConta);
        conta.setTitular(titular);
        conta.setSaldo(saldo);

        System.out.printf("Numero da conta: %s%n", conta.getNumeroConta());
        System.out.printf("Titular: %s%n", conta.getTitular());
        System.out.printf("Saldo: %.2f%n", conta.getSaldo());
    }
}