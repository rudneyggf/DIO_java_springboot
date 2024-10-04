import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class ExemploSuplier {
    public static void main(String[] args) {

        Supplier<String> supplier = () -> "Bom dia";

        List<String> list = Stream.generate(supplier).limit(4).toList();
        System.out.println(list);

        List <Integer> numeros =Stream.generate(() -> 1).limit(4).toList();
        System.out.println(numeros);
    }
}
