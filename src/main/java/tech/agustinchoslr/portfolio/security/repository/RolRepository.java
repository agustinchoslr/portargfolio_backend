package tech.agustinchoslr.portfolio.security.repository;

import tech.agustinchoslr.portfolio.security.entity.Rol;
import tech.agustinchoslr.portfolio.security.enums.RolNombre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
//Notación que indica que es un repositorio
@Repository
public interface RolRepository extends JpaRepository<Rol, Integer> {

    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
