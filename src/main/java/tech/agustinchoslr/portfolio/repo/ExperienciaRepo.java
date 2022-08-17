package tech.agustinchoslr.portfolio.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech.agustinchoslr.portfolio.model.Experiencia;

import java.util.Optional;

@Repository
public interface ExperienciaRepo extends JpaRepository<Experiencia, Long> {
    void deleteExperienciaById(Long id);

    Optional<Experiencia> findExperienciaById(Long id);
}
