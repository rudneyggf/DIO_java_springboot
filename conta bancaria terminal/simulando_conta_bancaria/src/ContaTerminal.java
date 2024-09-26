import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        int Numero ;
        String Agencia;
        String NomeCliente ;
        double Saldo;
        Scanner scan = new Scanner(System.in);

        System.out.println("Por favor, digite seu nome");
        NomeCliente= scan.next();
        System.out.println("Por favor, digite sua agencia");
        Agencia=scan.next();
        System.out.println("Por favor, digite seu numero de conta");
        Numero=scan.nextInt();
        System.out.println("Por favor, digite sua saldo");
        Saldo=scan.nextDouble();

        System.out.println("Olá " + NomeCliente + ", obrigado por criar uma conta em nosso banco, " +
                "sua agência é " + Agencia +",conta " + Numero + "e seu saldo "+ Saldo + "já está disponível para saque");
    }

}
