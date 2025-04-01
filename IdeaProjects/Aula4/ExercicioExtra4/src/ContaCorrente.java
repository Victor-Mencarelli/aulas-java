public class ContaCorrente {
    double saldo;

    ContaCorrente(double saldoInicial){
        this.saldo = saldoInicial;
    }

    public void depositar(double valor){
        saldo = saldo + valor;
    }

    public void sacar(double valor){
        saldo = saldo - valor;
    }
    public void render(){
        saldo *= 1.02;
    }
    public double saldo(){
        return saldo;
    }
}
