package primeiro.objetos;

public class Banco {
    public static void main(String[] args) {
        ContaCorrente umaConta = new ContaCorrente(1000);
        ContaCorrente outraConta = new ContaCorrente(2000);

        umaConta.saque(100);
        outraConta.deposito(200);

        System.out.println("Saldo de uma Conta: " + umaConta.saldo());
        System.out.println("Saldo de outra Conta: " + outraConta.saldo());
    }
}
