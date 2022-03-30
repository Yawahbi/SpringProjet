package io.yassine_safir.springprojet.springprojet.Entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Embeddable
public class ProduitMatiereKey implements Serializable {

    @Column(name = "product_id")
    Long idProduit;

    @Column(name = "matiere_id")
    Long idMatierePremiere;

}