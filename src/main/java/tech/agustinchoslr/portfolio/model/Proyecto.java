package tech.agustinchoslr.portfolio.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Entity

public class Proyecto implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private long id;
    private String projectName;
    private String link;
    private String img;
    private String anio;
    private String descripcion;

    public Proyecto(){
    }

    public Proyecto(long id, String projectName, String link, String img, String anio, String descripcion) {
        this.id = id;
        this.projectName = projectName;
        this.link = link;
        this.img = img;
        this.anio = anio;
        this.descripcion = descripcion;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Proyecto{" +
                "id=" + id +
                ", projectName='" + projectName + '\'' +
                ", link='" + link + '\'' +
                ", img='" + img + '\'' +
                ", anio='" + anio + '\'' +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
