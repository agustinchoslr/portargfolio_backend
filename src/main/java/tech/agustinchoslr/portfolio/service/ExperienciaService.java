package tech.agustinchoslr.portfolio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.agustinchoslr.portfolio.exception.UserNotFoundException;
import tech.agustinchoslr.portfolio.model.Experiencia;
import tech.agustinchoslr.portfolio.repo.ExperienciaRepo;


import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ExperienciaService {
    private final ExperienciaRepo experienciaRepo;

    @Autowired
    public ExperienciaService(ExperienciaRepo experienciaRepo) {
        this.experienciaRepo = experienciaRepo;
    }

    public Experiencia addExperiencia(Experiencia experiencia) {
        return experienciaRepo.save(experiencia);
    }

    public List<Experiencia> findAllExperiencias(){
        return experienciaRepo.findAll();
    }

    public Experiencia updateExperiencia(Experiencia experiencia) {

        return experienciaRepo.save(experiencia);
    }

    public Experiencia findExperienciaById(Long id){
        return experienciaRepo.findExperienciaById(id)
                .orElseThrow(() -> new UserNotFoundException("Usuario id " + id + " no encontrado"));
    }

    public void deleteExperiencia(Long id){
        experienciaRepo.deleteExperienciaById(id);

    }
}