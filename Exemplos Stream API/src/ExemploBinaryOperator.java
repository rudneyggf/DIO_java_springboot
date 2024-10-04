import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class ExemploBinaryOperator {
    public static void main(String[] args) {
        List<Integer> numeros=Arrays.asList(1,2,3,4,5,6);

        BinaryOperator<Integer> somar = (a,b)->(a+b);

        int soma= numeros.stream().reduce(0,somar);
        System.out.println(soma);
    }
}
