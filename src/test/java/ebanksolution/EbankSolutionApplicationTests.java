package ebanksolution;

import ebanksolution.dao.CompteDao;
import ebanksolution.model.Compte;
import ebanksolution.model.Utilisateur;
import ebanksolution.service.CompteServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class EBankBackendApplicationTests {

    @Autowired
    private CompteServiceImpl compteServiceimpl;

    @Mock
    private CompteDao compteDao;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testCreerCompte() {
        String type_compte = "MOCK";
        float Solde_initial = 1990;
        String Date_creation = "2021-01-01";
        int idUser = 1;

        // Mock the User object
        Utilisateur mockUser = new Utilisateur();
        mockUser.setIdUser(idUser);

        // Mock the compte object to return the mockUser
        Compte mockCompte = new Compte();
        mockCompte.setTypeCompte(type_compte);
        mockCompte.setSoldeInitial(Solde_initial);
        mockCompte.setDateCreation(Date_creation);
        mockCompte.setUtilisateur(mockUser);

//       when(compteDao.save(any(compte.class))).thenReturn(mockCompte);
    }

}