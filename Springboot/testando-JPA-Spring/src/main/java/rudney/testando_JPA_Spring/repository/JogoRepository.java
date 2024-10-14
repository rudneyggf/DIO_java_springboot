package rudney.testando_JPA_Spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rudney.testando_JPA_Spring.entity.Jogo;

public interface JogoRepository extends JpaRepository<Jogo, Integer> {

    public Jogo findById(int id);
}
