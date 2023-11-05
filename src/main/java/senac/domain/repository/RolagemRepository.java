package senac.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import senac.domain.model.Rolagem;

public interface RolagemRepository  extends JpaRepository<Rolagem, Integer> {
}
