import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ExemploConsumer {
    public static void main(String[] args) {
        List <Integer> lista = Arrays.asList(1,2,3,4,5,6);

        Consumer <Integer> imprimirNumeroPar =  numero -> {
            if (numero %2 ==0)
                System.out.println(numero);
        };

        lista.stream().forEach(imprimirNumeroPar);

        lista.stream().forEach(numero -> {
            if (numero % 2 != 0)
                System.out.println(numero);
        });
    }
}
