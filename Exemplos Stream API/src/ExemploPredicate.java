import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class ExemploPredicate {
    public static void main(String[] args) {
        List <String> ling= Arrays.asList("java","kotlin","ruby", "javascript","python");
        Predicate<String> condicao = p->p.length()>5;
        ling.stream().filter(condicao).forEach(System.out::println);
         /*
         forma alternativa: ling.stream().filter(p->p.length()>5).forEach(System.out::println);
          */
    }
}
