package tech.agustinchoslr.portfolio.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@Entity

public class Persona implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private long id;
    private String name;
    private String jobTitle;
    private String shortDescription;
    private String profileImageUrl;
    private String coverImageUrl;
    private String email;
    private String fbContact;
    private String linkedinContact;


    @JsonIgnoreProperties("persona")
    @OneToMany(cascade = CascadeType.ALL, targetEntity = Educacion.class)
    @JoinColumn(name = "ed_fk", referencedColumnName = "id")
    private List<Educacion> educacionList;

    @JsonIgnoreProperties("persona")
    @OneToMany(cascade = CascadeType.ALL, targetEntity = Experiencia.class)
    @JoinColumn(name = "ex_fk", referencedColumnName = "id")
    private List<Experiencia> experienciaList;

    @JsonIgnoreProperties("persona")
    @OneToMany(cascade = CascadeType.ALL, targetEntity = Skill.class)
    @JoinColumn(name = "sk_fk", referencedColumnName = "id")
    private List<Skill> skillList;

    @JsonIgnoreProperties("persona")
    @OneToMany(cascade = CascadeType.ALL, targetEntity = Proyecto.class)
    @JoinColumn(name = "pr_fk", referencedColumnName = "id")
    private List<Proyecto> proyectoList;


    public Persona(){
    }

    public Persona(long id, String name, String jobTitle, String shortDescription, String profileImageUrl, String coverImageUrl, String email, String fbContact, String linkedinContact) {
        this.id = id;
        this.name = name;
        this.jobTitle = jobTitle;
        this.shortDescription = shortDescription;
        this.profileImageUrl = profileImageUrl;
        this.coverImageUrl = coverImageUrl;
        this.email = email;
        this.fbContact = fbContact;
        this.linkedinContact = linkedinContact;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getProfileImageUrl() {
        return profileImageUrl;
    }

    public void setProfileImageUrl(String profileImageUrl) {
        this.profileImageUrl = profileImageUrl;
    }

    public String getCoverImageUrl() {
        return coverImageUrl;
    }

    public void setCoverImageUrl(String coverImageUrl) {
        this.coverImageUrl = coverImageUrl;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFbContact() {
        return fbContact;
    }

    public void setFbContact(String fbContact) {
        this.fbContact = fbContact;
    }

    public String getLinkedinContact() {
        return linkedinContact;
    }

    public void setLinkedinContact(String linkedinContact) {
        this.linkedinContact = linkedinContact;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", shortDescription='" + shortDescription + '\'' +
                ", profileImageUrl='" + profileImageUrl + '\'' +
                ", coverImageUrl='" + coverImageUrl + '\'' +
                ", email='" + email + '\'' +
                ", fbContact='" + fbContact + '\'' +
                ", linkedinContact='" + linkedinContact + '\'' +
                '}';
    }
}
