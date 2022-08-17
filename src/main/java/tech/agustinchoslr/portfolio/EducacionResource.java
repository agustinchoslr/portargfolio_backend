
package tech.agustinchoslr.portfolio;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tech.agustinchoslr.portfolio.model.Educacion;
import tech.agustinchoslr.portfolio.service.EducacionService;

import javax.transaction.Transactional;
import java.util.List;

@CrossOrigin(origins = "*")
@Transactional

@RestController
@RequestMapping("/educacion")
public class EducacionResource {
    private final EducacionService educacionService;

    public EducacionResource(EducacionService educacionService) {

        this.educacionService = educacionService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Educacion>> getAllEducaciones () {
        List<Educacion> educaciones = educacionService.findAllEducaciones();
        return new ResponseEntity<>(educaciones, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Educacion> getEducacionById (@PathVariable("id") Long id) {
        Educacion educacion = educacionService.findEducacionById(id);
        return new ResponseEntity<>(educacion, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Educacion> addEducacion(@RequestBody Educacion educacion) {
        Educacion newEducacion =  educacionService.addEducacion(educacion);
        return new ResponseEntity<>(newEducacion, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Educacion> updateEducacion(@RequestBody Educacion educacion) {
        Educacion updateEducacion =  educacionService.updateEducacion(educacion);
        return new ResponseEntity<>(updateEducacion, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteEducacion(@PathVariable("id") Long id) {
        educacionService.deleteEducacion(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}