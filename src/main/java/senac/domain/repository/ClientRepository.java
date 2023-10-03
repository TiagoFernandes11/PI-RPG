package senac.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import senac.domain.entity.Client;

public interface ClientRepository extends JpaRepository<Client, Integer> {
}
