public class ContaCorrente extends Conta{

    public ContaCorrente(int numero, String agencia, Cliente cliente, double saldo) {
        super(numero, agencia, cliente, saldo);
    }
    public void imprimirExtrato(){
        System.out.println("=== Extrato Conta Corrente ===");
        super.imprimirExtrato();
    }
}
