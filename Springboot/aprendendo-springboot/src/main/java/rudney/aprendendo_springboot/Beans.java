package rudney.aprendendo_springboot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Beans {

    @Bean
    @Scope("prototype")
    public Remetente remetente(){
        System.out.println("---CRIANDO OBJETO NOVO---");
        Remetente remetente = new Remetente();
        remetente.setNome("Remetente");
        remetente.setEmail("remetente@gmail.com");
        return remetente;
    }

    @Bean
    public CommandLineRunner run(SistemaMensagem sistemaMensagem) {
        return args -> {
            sistemaMensagem.enviarConfirmacaoCadastro();
            sistemaMensagem.enviarMensagemBoasVindas();
        };
    }
}
