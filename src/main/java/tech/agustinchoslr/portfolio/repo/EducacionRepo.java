package tech.agustinchoslr.portfolio.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech.agustinchoslr.portfolio.model.Educacion;

import java.util.Optional;

@Repository
public interface EducacionRepo extends JpaRepository<Educacion, Long> {
    void deleteEducacionById(Long id);

    Optional<Educacion> findEducacionById(Long id);
}
