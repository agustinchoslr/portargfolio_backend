
package tech.agustinchoslr.portfolio;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import tech.agustinchoslr.portfolio.model.Proyecto;
import tech.agustinchoslr.portfolio.service.ProyectoService;

import javax.transaction.Transactional;
import java.util.List;

@CrossOrigin(origins = "https://argprog-24b53.web.app")
@Transactional

@RestController
@RequestMapping("/proyecto")
public class ProyectoResource {
    private final ProyectoService proyectoService;

    public ProyectoResource(ProyectoService proyectoService) {

        this.proyectoService = proyectoService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Proyecto>> getAllProyectos () {
        List<Proyecto> proyectos = proyectoService.findAllProyectos();
        return new ResponseEntity<>(proyectos, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Proyecto> getProyectoById (@PathVariable("id") Long id) {
        Proyecto proyecto = proyectoService.findProyectoById(id);
        return new ResponseEntity<>(proyecto, HttpStatus.OK);
    }
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/add")
    public ResponseEntity<Proyecto> addProyecto(@RequestBody Proyecto proyecto) {
        Proyecto newProyecto =  proyectoService.addProyecto(proyecto);
        return new ResponseEntity<>(newProyecto, HttpStatus.CREATED);
    }
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/update")
    public ResponseEntity<Proyecto> updateProyecto(@RequestBody Proyecto proyecto) {
        Proyecto updateProyecto =  proyectoService.updateProyecto(proyecto);
        return new ResponseEntity<>(updateProyecto, HttpStatus.OK);
    }
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteProyecto(@PathVariable("id") Long id) {
        proyectoService.deleteProyecto(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}