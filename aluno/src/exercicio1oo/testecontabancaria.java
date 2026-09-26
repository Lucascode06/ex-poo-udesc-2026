package exercicio1oo;

public class testecontabancaria {
    public static void main(String[] args) {

        contabancaria conta = new contabancaria();

        conta.numeroConta = "12345-6";
        conta.titular = "Lucas";
        conta.saldo = 1500.50;

        System.out.println("Numero da conta: " + conta.numeroConta);
        System.out.println("Titular: " + conta.titular);
        System.out.println("Saldo: " + conta.saldo);
    }
}