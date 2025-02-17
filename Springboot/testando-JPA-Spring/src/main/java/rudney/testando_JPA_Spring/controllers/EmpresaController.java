package rudney.testando_JPA_Spring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.*;
import rudney.testando_JPA_Spring.entity.Empresa;
import rudney.testando_JPA_Spring.repository.EmpresaRepository;

import java.util.List;
@RestController
//@RequestMapping("/empresa") serve para que todas as URI começem com /empresa automaticmanete sem precisar digitar
// tal prefixo nos mapeamentos
public class EmpresaController {

    @Autowired
    private EmpresaRepository empresaRepository;


    @GetMapping("/empresa")
    //@PreAuthorize("hasAnyRole('ADMIN','USER')")
    public List<Empresa> getAllEmpresas(){
        return empresaRepository.findAll();
    }


    @GetMapping("/empresa/{id}")
    //@PreAuthorize("hasAnyRole('ADMIN','USER')")
    public Empresa FindEmpresaByID( @PathVariable("id") int id){
        return empresaRepository.findById(id);
    }

    @DeleteMapping("/empresa/{razaoSocial}")
    //@PreAuthorize("hasRole('ADMIN')")
    public void DeleteEmpresa( @PathVariable("razaoSocial") String razaoSocial){
        empresaRepository.deleteByRazaoSocial(razaoSocial);
    }

    @PostMapping("/empresa")
    public void postEmpresa(@RequestBody Empresa empresa){
        empresaRepository.save(empresa);
    }
}
