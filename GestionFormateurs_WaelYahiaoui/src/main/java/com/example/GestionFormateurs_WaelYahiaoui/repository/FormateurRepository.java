package com.example.GestionFormateurs_WaelYahiaoui.repository;

import com.example.GestionFormateurs_WaelYahiaoui.entity.Formateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FormateurRepository extends JpaRepository<Formateur, Long> {

    List<Formateur> findBySpecialite(String specialite);
    List<Formateur> findByAnneesExperienceGreaterThan(int anneesExperience);
}

