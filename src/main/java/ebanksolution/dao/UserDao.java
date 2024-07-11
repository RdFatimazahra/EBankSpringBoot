package ebanksolution.dao;

import ebanksolution.model.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserDao extends JpaRepository<Utilisateur, Integer> {
    Utilisateur findByIdUser(int idUser);
    Optional<Utilisateur> findByEmail(String email);
}
