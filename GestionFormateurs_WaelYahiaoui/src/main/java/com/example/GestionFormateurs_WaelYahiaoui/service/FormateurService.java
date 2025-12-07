package com.example.GestionFormateurs_WaelYahiaoui.service;

public class FormateurService {
    @Autowired
    private FormateurRepository formateurRepository;
    
    public List<Formateur> findBySpecialite(String specialite) {
        return formateurRepository.findBySpecialite(specialite);
    }
    public Formateur save(Formateur formateur) {
        return formateurRepository.save(formateur);
    }
    public void deleteFormateur(Long id) {
        formateurRepository.deleteById(id);
    }
}
