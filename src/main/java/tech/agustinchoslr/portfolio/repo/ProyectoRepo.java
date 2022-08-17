package tech.agustinchoslr.portfolio.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech.agustinchoslr.portfolio.model.Proyecto;

import java.util.Optional;

@Repository
public interface ProyectoRepo extends JpaRepository<Proyecto, Long> {
    void deleteProyectoById(Long id);

    Optional<Proyecto> findProyectoById(Long id);
}
