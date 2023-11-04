package senac.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import senac.domain.model.Participante;

public interface ParticipanteRepository extends JpaRepository<Participante, Integer> {
}
