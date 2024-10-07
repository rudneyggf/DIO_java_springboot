package Dio;

public class Conta {
    private int numero;
    private double saldo;

    public Conta(int numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }
    public void deposito(double valor) {
        this.saldo += valor;
    }
    public  void sacar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
        }else{
            throw new RuntimeException("Saldo insuficiente");
        }
    }
    public void transfere(Conta destino, double valor) {
        this.deposito(valor);
        destino.deposito(valor);
    }
}
