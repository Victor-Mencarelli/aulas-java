public class Banco {
    public static void main(String[] args) {
        Conta contaCorrente1 = new Conta(1000);
        Conta contaCorrente2 = new Conta(1500);

        contaCorrente1.deposito(500);
        contaCorrente2.sacar(200);

        contaCorrente1.transferir(contaCorrente2, 300);

        contaCorrente1.juros(0.05);
        contaCorrente2.juros(0.05);

        System.out.println("O saldo da conta 1 é: " + contaCorrente1.saldo());
        System.out.println("O saldo da conta 2 é: " + contaCorrente2.saldo());
    }
}
