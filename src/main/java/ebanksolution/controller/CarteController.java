package ebanksolution.controller;

import ebanksolution.model.Carte;
import ebanksolution.service.CarteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/cartes")
public class CarteController {
    @Autowired
    private CarteService carteService;

    @GetMapping
    public List<Carte> getAllCartes() {
        return carteService.getAllCartes();
    }

    @GetMapping("/{id}")
    public Optional<Carte> getCarteById(@PathVariable int idCarte) {
        return carteService.getCarteById(idCarte);
    }

    @PostMapping("/create/{idCompte}")
    public Carte createCarte(@RequestBody Carte carte, @PathVariable int idCompte) {
        return carteService.createCarte(carte, idCompte);
    }

    @PutMapping("/{id}")
    public Carte updateCarte(@PathVariable int idCarte, @RequestBody Carte carteDetails) {
        return carteService.updateCarte(idCarte, carteDetails);
    }

    @DeleteMapping("/{id}")
    public void deleteCarte(@PathVariable int idCarte) {
        carteService.deleteCarte(idCarte);
    }

    @PostMapping("/{id}/activer")
    public String activerCarte(@PathVariable int idCarte) {
        carteService.activerCarte(idCarte);
        return "Activer";
    }

    @PostMapping("/{id}/desactiver")
    public String desactiverCarte(@PathVariable int idCarte) {
        carteService.desactiverCarte(idCarte);
        return "Desactiver" ;
    }
}
