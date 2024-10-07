import Dio.Conta;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TesteConta {

    @Test
    public void TestaException(){
        Conta c1 = new Conta(1,100);
        Assertions.assertThrows(RuntimeException.class, () -> c1.sacar(200));
    }

}
