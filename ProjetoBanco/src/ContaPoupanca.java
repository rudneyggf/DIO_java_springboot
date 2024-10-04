public class ContaPoupanca extends Conta {


    public ContaPoupanca(int numero, String agencia, Cliente cliente, double saldo) {
        super(numero, agencia, cliente, saldo);
    }

    public void imprrimirExtrato() {
        System.out.println("=== Extrato da Conta Poupanca ===");
        super.imprimirExtrato();
    }
}
