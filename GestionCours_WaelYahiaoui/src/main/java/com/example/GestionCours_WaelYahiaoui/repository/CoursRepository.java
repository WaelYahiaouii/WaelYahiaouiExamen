package com.example.GestionCours_WaelYahiaoui.repository;

import com.example.GestionCours_WaelYahiaoui.entity.Cours;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CoursRepository extends JpaRepository<Cours, Long> {

    List<Cours> findByDureeHeuresLessThan(int dureeHeures);
}

