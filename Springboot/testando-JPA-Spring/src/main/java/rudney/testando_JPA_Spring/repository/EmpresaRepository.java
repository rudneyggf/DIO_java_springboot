package rudney.testando_JPA_Spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rudney.testando_JPA_Spring.entity.Empresa;

public interface EmpresaRepository extends JpaRepository<Empresa, Integer> {


}
