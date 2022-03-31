package io.yassine_safir.springprojet.springprojet.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProduitDto {
    private String produitNom;
    private String categorieLibelle;

}
