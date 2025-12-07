package com.example.GestionFormateurs_WaelYahiaoui.entity;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "formateurs")
public class Formateur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String prenom;
    private String specialite;
    private int anneesExperience;
    private Date dateRecrutement;
    private Statut statut;

    public Formateur() {
    }

    public Formateur(String nom, String prenom, String specialite, int anneesExperience, Date dateRecrutement, Statut statut) {
        this.nom = nom;
        this.prenom = prenom;
        this.specialite = specialite;
        this.email = email;
        this.anneesExperience = anneesExperience;
        this.dateRecrutement = dateRecrutement;
        this.statut = statut;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getSpecialite() {
        return specialite;
    }

    public String getEmail() {
        return email;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    public int getAnneesExperience() {
        return anneesExperience;
    }

    public void setAnneesExperience(int anneesExperience) {
        this.anneesExperience = anneesExperience;
    }

    public Date getDateRecrutement() {
        return dateRecrutement;
    }

    public void setDateRecrutement(Date dateRecrutement) {
        this.dateRecrutement = dateRecrutement;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Statut getStatut() {
        return statut;
    }

    public void setStatut(Statut statut) {
        this.statut = statut;
    }

    @Override
    public String toString() {
        return "Formateur{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", specialite='" + specialite + '\'' +
                ", anneesExperience=" + anneesExperience +
                ", dateRecrutement=" + dateRecrutement +
                ", statut=" + statut +
                '}';
    }
}

