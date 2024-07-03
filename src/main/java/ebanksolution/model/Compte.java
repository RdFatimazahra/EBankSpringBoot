package ebanksolution.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Compte {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idCompte;
    private String typeCompte;
    private Float SoldeInitial;
    private String DateCreation;

    @ManyToOne
    @JoinColumn(name="idUser", nullable=false)
    private Utilisateur utilisateur;
}