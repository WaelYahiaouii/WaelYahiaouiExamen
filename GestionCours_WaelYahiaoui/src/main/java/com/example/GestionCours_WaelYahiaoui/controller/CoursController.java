package com.example.GestionCours_WaelYahiaoui.controller;

public class CoursController {
    @Autowired
    private CoursService coursService;

    @postMapping("/cours/save")
    public ResponseEntity<Cours> saveCours(@RequestBody Cours cours) {
        Cours savedCours = coursService.save(cours);
        return ResponseEntity.ok(savedCours);
    }

    @deleteMapping("/cours/{id}")
    public ResponseEntity<Void> deleteCours(@PathVariable Long id) {
        coursService.deleteCours(id);
        return ResponseEntity.noContent().build();
    }
}
