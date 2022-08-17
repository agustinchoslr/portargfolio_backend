package tech.agustinchoslr.portfolio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.agustinchoslr.portfolio.exception.UserNotFoundException;
import tech.agustinchoslr.portfolio.model.Educacion;
import tech.agustinchoslr.portfolio.repo.EducacionRepo;


import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class EducacionService {
    private final EducacionRepo educacionRepo;

    @Autowired
    public EducacionService(EducacionRepo educacionRepo) {
        this.educacionRepo = educacionRepo;
    }

    public Educacion addEducacion(Educacion educacion) {
        return educacionRepo.save(educacion);
    }

    public List<Educacion> findAllEducaciones(){
        return educacionRepo.findAll();
    }

    public Educacion updateEducacion(Educacion educacion) {

        return educacionRepo.save(educacion);
    }

    public Educacion findEducacionById(Long id){
        return educacionRepo.findEducacionById(id)
                .orElseThrow(() -> new UserNotFoundException("Usuario id " + id + " no encontrado"));
    }

    public void deleteEducacion(Long id){
        educacionRepo.deleteEducacionById(id);

    }
}