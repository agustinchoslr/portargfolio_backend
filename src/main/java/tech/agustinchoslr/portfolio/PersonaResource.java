package tech.agustinchoslr.portfolio;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import tech.agustinchoslr.portfolio.model.Persona;
import tech.agustinchoslr.portfolio.service.PersonaService;

import javax.transaction.Transactional;
import java.util.List;

@RestController
@CrossOrigin(origins = "https://argprog-24b53.web.app")
@Transactional


@RequestMapping("/persona")
public class PersonaResource {
    private final PersonaService personaService;

    public PersonaResource(PersonaService personaService) {

        this.personaService = personaService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Persona>> getAllPersonas () {
        List<Persona> personas = personaService.findAllPersonas();
        return new ResponseEntity<>(personas, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Persona> getPersonaById (@PathVariable("id") Long id) {
        Persona persona = personaService.findPersonaById(id);
        return new ResponseEntity<>(persona, HttpStatus.OK);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/add")
    public ResponseEntity<Persona> addPersona(@RequestBody Persona persona) {
        Persona newPersona =  personaService.addPersona(persona);
        return new ResponseEntity<>(newPersona, HttpStatus.CREATED);
    }

     @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/update")
    public ResponseEntity<Persona> updatePersona(@RequestBody Persona persona) {
        Persona updatePersona =  personaService.updatePersona(persona);
        return new ResponseEntity<>(updatePersona, HttpStatus.OK);
    }

     @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deletePersona(@PathVariable("id") Long id) {
        personaService.deletePersona(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
