package io.yassine_safir.springprojet.springprojet.Entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity

public class ProduitMatiereAsso {

    @EmbeddedId
    ProduitMatiereKey id = new ProduitMatiereKey();

    @ManyToOne(cascade = {
            CascadeType.MERGE,
            CascadeType.DETACH,
            CascadeType.PERSIST
    })
    @MapsId("idProduit")
    @JoinColumn(name = "id_produit")
    Produit produit;

    @ManyToOne(cascade = {
            CascadeType.MERGE,
            CascadeType.DETACH,
            CascadeType.PERSIST
    })
    @MapsId("idMatierePremiere")
    @JoinColumn(name = "id_matiere")
    MatierePremiere matierePremiere;

    @ManyToOne
    @JoinColumn(name="origin")
    private Region origin;

}