
public class Banco {
    public static void main(String[] args) {
        ContaCorrente conta1 = new ContaCorrente(1500);
        ContaCorrente conta2 = new ContaCorrente(2000);

        conta1.depositar(500);

        conta2.sacar(300);

        conta1.render();
        conta2.render();

        System.out.println("O saldo da conta1 é de: " + conta1.saldo());
        System.out.println("O saldo da conta2 é de: " + conta2.saldo());

    }
}