import Dio.Pessoa;
import org.junit.jupiter.api.*;

public class PessoaTeste {

    @Test
    public void validarIdade(){
        Pessoa p1 = new Pessoa("nani",15);
        Assertions.assertEquals(p1.getIdade(), 15);
    }

    @Test
    public void validarMaiorIdade(){
        Pessoa p1 = new Pessoa("Junior",27);
        Assertions.assertTrue(p1.EhMaiorDeIdade());
    }

    @BeforeAll
    public static void Inicio (){
        System.out.println("Mensagem do inicio de tudo");
    }
    @AfterAll public static void Fim (){
        System.out.println("Mensagem de finização de todas as operações");
    }
    @BeforeEach //Antes de cada teste
    public void InicioCada(){
        System.out.println("Inicio de uma Operação");
    }
    @AfterEach //Depois de cada Teste
    public void FimCada(){
        System.out.println("Termino de uma operação");
    }
}
