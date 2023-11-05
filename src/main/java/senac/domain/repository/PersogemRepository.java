package senac.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import senac.domain.model.Personagem;

@Repository
public interface PersogemRepository extends JpaRepository<Personagem, Integer> {
}
