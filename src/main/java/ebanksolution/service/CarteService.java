package ebanksolution.service;

import ebanksolution.model.Carte;
import java.util.List;
import java.util.Optional;

public interface CarteService {
    List<Carte> getAllCartes();
    Optional<Carte> getCarteById(int idCarte);
    Carte createCarte(Carte carte, int idCompte);
    Carte updateCarte(int idCarte, Carte carteDetails);
    void deleteCarte(int idCarte);
    Carte activerCarte(int idCarte);
    Carte desactiverCarte(int idCarte);

}
