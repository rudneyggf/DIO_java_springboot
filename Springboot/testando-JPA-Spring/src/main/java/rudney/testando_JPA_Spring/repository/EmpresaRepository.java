package rudney.testando_JPA_Spring.repository;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import rudney.testando_JPA_Spring.entity.Empresa;

public interface EmpresaRepository extends JpaRepository<Empresa, Integer> {

  Empresa findById(int id);

  @Transactional
  void deleteByRazaoSocial(String razaoSocial);
}
