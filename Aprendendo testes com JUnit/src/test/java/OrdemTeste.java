import org.junit.jupiter.api.*;

/* Order ordena pela ordem numerica com @Order()
* DisplayName ordena pelo displayName dado ao teste
* Method name vai por ordem alfabetica
* Random é aleatória */
@TestMethodOrder(MethodOrderer.DisplayName.class)
public class OrdemTeste {

    @Test
    @Order(4)
    @DisplayName("A")
    public void test01() {
        System.out.println("Test 01");
    }

    @Test
    @Order(3)
    @DisplayName("B")
    public void test02() {
        System.out.println("Test 02");
    }

    @Test
    @Order(2)
    @DisplayName("C")
    public void test03() {
        System.out.println("Test 03");
    }

    @Test
    @Order(1)
    @DisplayName("D")
    public void test04() {
        System.out.println("Test 04");
    }

}
