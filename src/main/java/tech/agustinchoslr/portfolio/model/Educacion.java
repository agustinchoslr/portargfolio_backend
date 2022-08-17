package tech.agustinchoslr.portfolio.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Entity

public class Educacion implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private long id;
    private String carrera;
    private String institucion;
    private String img;
    private String anioInicio;
    private String anioFin;
    private String descripcion;

    public Educacion(){
    }

    public Educacion(long id, String carrera, String institucion, String img, String anioInicio, String anioFin, String descripcion) {
        this.id = id;
        this.carrera = carrera;
        this.institucion = institucion;
        this.img = img;
        this.anioInicio = anioInicio;
        this.anioFin = anioFin;
        this.descripcion = descripcion;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getAnioInicio() {
        return anioInicio;
    }

    public void setAnioInicio(String anioInicio) {
        this.anioInicio = anioInicio;
    }

    public String getAnioFin() {
        return anioFin;
    }

    public void setAnioFin(String anioFin) {
        this.anioFin = anioFin;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Educacion{" +
                "id=" + id +
                ", carrera='" + carrera + '\'' +
                ", institucion='" + institucion + '\'' +
                ", img='" + img + '\'' +
                ", anioInicio='" + anioInicio + '\'' +
                ", anioFin='" + anioFin + '\'' +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
