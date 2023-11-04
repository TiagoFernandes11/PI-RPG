package senac.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import senac.domain.model.Pericia;

@Repository
public interface PericiaRepository extends JpaRepository<Pericia, Integer> {
}
