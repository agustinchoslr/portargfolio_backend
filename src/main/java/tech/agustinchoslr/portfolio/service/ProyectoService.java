package tech.agustinchoslr.portfolio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.agustinchoslr.portfolio.exception.UserNotFoundException;
import tech.agustinchoslr.portfolio.model.Proyecto;
import tech.agustinchoslr.portfolio.repo.ProyectoRepo;


import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ProyectoService {
    private final ProyectoRepo proyectoRepo;

    @Autowired
    public ProyectoService(ProyectoRepo proyectoRepo) {
        this.proyectoRepo = proyectoRepo;
    }

    public Proyecto addProyecto(Proyecto proyecto) {
        return proyectoRepo.save(proyecto);
    }

    public List<Proyecto> findAllProyectos(){
        return proyectoRepo.findAll();
    }

    public Proyecto updateProyecto(Proyecto proyecto) {

        return proyectoRepo.save(proyecto);
    }

    public Proyecto findProyectoById(Long id){
        return proyectoRepo.findProyectoById(id)
                .orElseThrow(() -> new UserNotFoundException("Usuario id " + id + " no encontrado"));
    }

    public void deleteProyecto(Long id){
        proyectoRepo.deleteProyectoById(id);

    }
}