
package tech.agustinchoslr.portfolio;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import tech.agustinchoslr.portfolio.model.Educacion;
import tech.agustinchoslr.portfolio.service.EducacionService;

import javax.transaction.Transactional;
import java.util.List;

@CrossOrigin(origins = "https://argprog-24b53.web.app")
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
      @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/add")
    public ResponseEntity<Educacion> addEducacion(@RequestBody Educacion educacion) {
        Educacion newEducacion =  educacionService.addEducacion(educacion);
        return new ResponseEntity<>(newEducacion, HttpStatus.CREATED);
    }
       @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/update")
    public ResponseEntity<Educacion> updateEducacion(@RequestBody Educacion educacion) {
        Educacion updateEducacion =  educacionService.updateEducacion(educacion);
        return new ResponseEntity<>(updateEducacion, HttpStatus.OK);
    }
 @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteEducacion(@PathVariable("id") Long id) {
        educacionService.deleteEducacion(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}