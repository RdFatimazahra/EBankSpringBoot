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

    public class Transaction {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int idTransaction;
        private String dateHeure;
        private double montant;
        private String typeTransaction;
        private String description;

        @ManyToOne
        @JoinColumn(name="idCompte", nullable=false)
        private Compte compte;
}
