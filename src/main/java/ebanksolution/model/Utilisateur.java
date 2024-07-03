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

public class Utilisateur {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idUser ;
    private String name;
    private String email;
    private String password;
}
