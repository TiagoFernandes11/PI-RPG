package senac.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import senac.domain.model.Equipamentos;

public interface EquipamentosRepository extends JpaRepository<Equipamentos, Integer> {
}
