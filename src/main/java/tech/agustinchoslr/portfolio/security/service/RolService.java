package tech.agustinchoslr.portfolio.security.service;

import tech.agustinchoslr.portfolio.security.entity.Rol;
import tech.agustinchoslr.portfolio.security.enums.RolNombre;
import tech.agustinchoslr.portfolio.security.repository.RolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@Transactional
public class RolService {

    @Autowired
    RolRepository rolRepository;

    public Optional<Rol> getByRolNombre(RolNombre rolNombre){
        return  rolRepository.findByRolNombre(rolNombre);
    }

    public void save(Rol rol){
        rolRepository.save(rol);
    }
}
