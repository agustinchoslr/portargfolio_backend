package tech.agustinchoslr.portfolio.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Entity

public class Experiencia implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private long id;
    private String cargo;
    private String empresa;
    private String img;
    private String anioInicio;
    private String anioFin;
    private String descripcion;

    public Experiencia(){
    }

    public Experiencia(long id, String cargo, String empresa, String img, String anioInicio, String anioFin, String descripcion) {
        this.id = id;
        this.cargo = cargo;
        this.empresa = empresa;
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

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
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
        return "Experiencia{" +
                "id=" + id +
                ", cargo='" + cargo + '\'' +
                ", empresa='" + empresa + '\'' +
                ", img='" + img + '\'' +
                ", anioInicio='" + anioInicio + '\'' +
                ", anioFin='" + anioFin + '\'' +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}