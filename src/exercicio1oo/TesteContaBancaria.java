package exercicio1oo;

public class TesteContaBancaria {
    private static final String numero_conta = "12345-6";
    private static final String tirular = "Lucas";
    private static final double saldo = 1500.50;

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();

        conta.numeroConta = numero_conta;
        conta.titular = tirular;
        conta.saldo = saldo;

        System.out.println("Numero da conta: " + conta.numeroConta);
        System.out.println("Titular: " + conta.titular);
        System.out.println("Saldo: " + conta.saldo);
    }
}