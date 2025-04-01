package primeiro.objetos;


public class ContaCorrente {
    double saldo;

    ContaCorrente(double saldo){
        this.saldo = saldo;
    }

    void saque(double valor){
        saldo = saldo - valor;
    }

    void deposito(double valor) {
        saldo = saldo + valor;
    }
    double saldo() {
        return saldo;
    }
}
