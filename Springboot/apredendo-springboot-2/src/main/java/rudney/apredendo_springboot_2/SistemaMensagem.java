package rudney.apredendo_springboot_2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SistemaMensagem implements CommandLineRunner {

    @Autowired
    private Remetente remetente;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Nome: " + remetente.getNome()
        + "\nEmail: " + remetente.getEmail()
        + "\nTelefones: " + remetente.getTelefones());
        System.out.println("Cadastro aprovado");
    }

}
