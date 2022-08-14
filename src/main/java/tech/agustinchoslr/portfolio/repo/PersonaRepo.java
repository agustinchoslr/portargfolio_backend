package tech.agustinchoslr.portfolio.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.agustinchoslr.portfolio.model.Persona;

import java.util.Optional;

public interface PersonaRepo extends JpaRepository<Persona, Long> {
    void deletePersonaById(Long id);

    Optional<Persona> findPersonaById(Long id);
}
