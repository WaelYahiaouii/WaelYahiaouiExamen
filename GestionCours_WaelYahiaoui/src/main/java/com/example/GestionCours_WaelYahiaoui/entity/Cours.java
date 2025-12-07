package com.example.GestionCours_WaelYahiaoui.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "cours")
public class Cours {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String titre;
    private String description;
    private Niveau niveau;
    private int dureeHeures;
    private Long prix;
    private Formateur formateur;

    public Cours() {
    }

    public Cours(String titre, String description, Niveau niveau, int dureeHeures, Long prix, Formateur formateur) {
        this.titre = titre;
        this.description = description;
        this.niveau = niveau;
        this.dureeHeures = dureeHeures;
        this.prix = prix;
        this.formateur = formateur;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    public Niveau getNiveau() {
        return niveau;
    }

    public void setNiveau(Niveau niveau) {
        this.niveau = niveau;
    }

    public int getDureeHeures() {
        return dureeHeures;
    }

    public void setDureeHeures(int dureeHeures) {
        this.dureeHeures = dureeHeures;
    }

    public Long getPrix() {
        return prix;
    }
    
    public void setPrix(Long prix) {
        this.prix = prix;
    }

    public Formateur getFormateur() {
        return formateur;
    }
    
    
    public void setFormateur(Formateur formateur) {
        this.formateur = formateur;
    }

    @Override
    public String toString() {
        return "Cours{" +
                "id=" + id +
                ", titre='" + titre + '\'' +
                ", description='" + description + '\'' +
                ", niveau=" + niveau +
                ", dureeHeures=" + dureeHeures +
                ", prix=" + prix +
                ", formateur=" + formateur +
                '}';
    }
}
