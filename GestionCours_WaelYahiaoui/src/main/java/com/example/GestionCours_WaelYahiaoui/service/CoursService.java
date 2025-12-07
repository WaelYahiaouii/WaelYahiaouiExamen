package com.example.GestionCours_WaelYahiaoui.service;

import com.example.GestionCours_WaelYahiaoui.entity.Cours;
import com.example.GestionCours_WaelYahiaoui.repository.CoursRepository;

public class CoursService {
    @Autowired
    private CoursRepository coursRepository;

    public Cours save(Cours cours) {
        return coursRepository.save(cours);
    }

    public void deleteCours(Long id) {
        coursRepository.deleteById(id);
    }
}
