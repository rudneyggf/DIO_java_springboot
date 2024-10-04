import java.util.Arrays;
import java.util.List;

public class TesteBanco {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Silvera");
        Cliente c2 = new Cliente("David");
        Conta contaSilvera = new ContaCorrente(1,"A-1",c1,100);
        Conta contaDavid = new ContaCorrente(2,"B-1",c2,200);

        Banco banco = new Banco();
        banco.setNome("Banco generico");
        List<Conta> contasBancoGenerico= Arrays.asList(contaSilvera,contaDavid);
        banco.setContas(contasBancoGenerico);

        contaDavid.transferir(50,contaSilvera);
        contaDavid.imprimirExtrato();
        contaSilvera.imprimirExtrato();

    }
}
