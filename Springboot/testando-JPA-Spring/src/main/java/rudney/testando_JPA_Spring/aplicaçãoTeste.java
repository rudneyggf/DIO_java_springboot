package rudney.testando_JPA_Spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import rudney.testando_JPA_Spring.entity.Empresa;
import rudney.testando_JPA_Spring.entity.Jogo;
import rudney.testando_JPA_Spring.repository.EmpresaRepository;
import rudney.testando_JPA_Spring.repository.JogoRepository;

import java.util.Scanner;

@Component
public class aplicaçãoTeste implements CommandLineRunner {
    @Autowired
    EmpresaRepository empresaRepository;
    @Autowired
    JogoRepository jogoRepository;



    public void CadastraEmpresa(Empresa empresa) {
        empresaRepository.saveAndFlush(empresa);
    }

    public void CadastraJogo(String titulo, Empresa empresa){
        jogoRepository.saveAndFlush(new Jogo(titulo, empresa));
    }

    @Override
    public void run(String... args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do empresa: ");
        String nome = scanner.nextLine();
        System.out.println("Digite o nome do jogo: ");
        Empresa epGenerica = new Empresa(nome);
        CadastraEmpresa(epGenerica);
    }
}
