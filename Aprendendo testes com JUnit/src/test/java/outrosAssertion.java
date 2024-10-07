import Dio.Pessoa;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class outrosAssertion {

    @Test
    public void testeArrays() {
        int [] numeros1= new int [] {1,2,3,4,5};
        int [] numeros2= new int [] {1,34,10,5,4};

        Assertions.assertArrayEquals(numeros1, numeros2);
    }

    @Test
    public void ObjetosNulos(){
        Pessoa p1 =null;
        Assertions.assertNull(p1);
        Pessoa p2 = new Pessoa();
        Assertions.assertNotNull(p2);
    }
}
