public class Conta {
    double saldo;

    public Conta(double saldoInicial){
        this.saldo = saldoInicial;
    }

    public void deposito(double valor){
        saldo = saldo + valor;
    }

    public void sacar(double valor){
        saldo = saldo - valor;
    }
    public void transferir(Conta contaDestino, double valor){
        saldo = saldo - valor;
        contaDestino.deposito(valor);
    }

    public void juros(double taxaJuros){
        saldo = saldo + saldo *taxaJuros;
    }

    public double saldo(){
        return saldo;
    }
}