import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

@ExtendWith(MockitoExtension.class)
public class ListaTeste {

    @Mock
     private List<Integer> lista;


    @Test
    @DisplayName("Testando Mock em Lista")
    public void testaLista(){
        Mockito.when(lista.get(0)).thenReturn(3);

        Assertions.assertEquals(3, lista.get(0));
    }
}
