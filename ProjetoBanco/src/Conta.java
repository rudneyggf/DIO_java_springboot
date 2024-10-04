public abstract class Conta {
    private int numero;
    private String agencia;
    private Cliente cliente;
    private double saldo;

    public Conta(int numero, String agencia, Cliente cliente, double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.cliente = cliente;
        this.saldo = saldo;
    }

    public void sacar(double valor) {
        saldo -= valor;
    }
    public void depositar(double valor) {
        saldo += valor;
    }
    public void transferir(double valor, Conta destino) {
        sacar(valor);
        destino.depositar(valor);
    }
     public void imprimirExtrato() {
        System.out.println("Conta: " + numero);
        System.out.println("Agencia: " + agencia);
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Saldo: " + saldo);
     }

    public int getNumero() {
        return numero;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public double getSaldo() {
        return saldo;
    }
    public String getAgencia() {
        return agencia;
    }

}
