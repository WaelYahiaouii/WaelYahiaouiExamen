package com.example.GestionFormateurs_WaelYahiaoui.controller;

public class FormateurController {

    @Autowired
    private FormateurService formateurService;

    @getMapping("/formateurs/email/{email}")
    public ResponseEntity<Formateur> findByEmail(@PathVariable String email) {
        Formateur formateur = formateurService.findByEmail(email);
        return ResponseEntity.ok(formateur);
    }
    
    @deleteMapping("/formateurs/{id}")
    public ResponseEntity<Void> deleteFormateur(@PathVariable Long id) {
        formateurService.deleteFormateur(id);
        return ResponseEntity.noContent().build();
    }

    @postMapping("/formateur/save")
    public ResponseEntity<Formateur> saveFormateur(@RequestBody Formateur formateur) {
        Formateur saveFormateur = formateurService.save(formateur);
        return ResponseEntity.ok(saveFormateur);
    }


}
