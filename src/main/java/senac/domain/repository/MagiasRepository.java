package senac.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import senac.domain.model.Magias;

@Repository
public interface MagiasRepository extends JpaRepository<Magias, Integer> {
}