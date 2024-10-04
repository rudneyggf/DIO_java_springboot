import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExemploFunction {
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(1,2,3,4,5);

       List<Integer> numerosDobrados= lista.stream().map(numero->numero*2).toList();
       System.out.println(numerosDobrados);
    }
}
