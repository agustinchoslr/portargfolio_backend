
package tech.agustinchoslr.portfolio;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tech.agustinchoslr.portfolio.model.Experiencia;
import tech.agustinchoslr.portfolio.service.ExperienciaService;

import javax.transaction.Transactional;
import java.util.List;

@CrossOrigin(origins = "*")
@Transactional

@RestController
@RequestMapping("/experiencia")
public class ExperienciaResource {
    private final ExperienciaService experienciaService;

    public ExperienciaResource(ExperienciaService experienciaService) {

        this.experienciaService = experienciaService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Experiencia>> getAllExperiencias () {
        List<Experiencia> experiencias = experienciaService.findAllExperiencias();
        return new ResponseEntity<>(experiencias, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Experiencia> getExperienciaById (@PathVariable("id") Long id) {
        Experiencia experiencia = experienciaService.findExperienciaById(id);
        return new ResponseEntity<>(experiencia, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Experiencia> addExperiencia(@RequestBody Experiencia experiencia) {
        Experiencia newExperiencia =  experienciaService.addExperiencia(experiencia);
        return new ResponseEntity<>(newExperiencia, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Experiencia> updateExperiencia(@RequestBody Experiencia experiencia) {
        Experiencia updateExperiencia =  experienciaService.updateExperiencia(experiencia);
        return new ResponseEntity<>(updateExperiencia, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteExperiencia(@PathVariable("id") Long id) {
        experienciaService.deleteExperiencia(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}