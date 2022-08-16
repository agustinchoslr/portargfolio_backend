package tech.agustinchoslr.portfolio.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech.agustinchoslr.portfolio.model.Persona;

import java.util.Optional;

@Repository
public interface PersonaRepo extends JpaRepository<Persona, Long> {
    void deletePersonaById(Long id);

    Optional<Persona> findPersonaById(Long id);
}
