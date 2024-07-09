package ebanksolution.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class TransactionDto {
    private int idTransaction;
    private String dateHeure;
    private double montant;
    private String typeTransaction;
    private String description;
}
