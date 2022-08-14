package tech.agustinchoslr.portfolio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.agustinchoslr.portfolio.exception.UserNotFoundException;
import tech.agustinchoslr.portfolio.model.Persona;
import tech.agustinchoslr.portfolio.repo.PersonaRepo;


import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class PersonaService {
    private final PersonaRepo personaRepo;

    @Autowired
    public PersonaService(PersonaRepo personaRepo) {
        this.personaRepo = personaRepo;
    }

    public Persona addPersona(Persona persona) {
        return personaRepo.save(persona);
    }

    public List<Persona> findAllPersonas(){
        return personaRepo.findAll();
    }

    public Persona updatePersona(Persona persona) {

        return personaRepo.save(persona);
    }

    public Persona findPersonaById(Long id){
        return personaRepo.findPersonaById(id)
                .orElseThrow(() -> new UserNotFoundException("Usuario id " + id + " no encontrado"));
    }

    public void deletePersona(Long id){
        personaRepo.deletePersonaById(id);

    }
}
