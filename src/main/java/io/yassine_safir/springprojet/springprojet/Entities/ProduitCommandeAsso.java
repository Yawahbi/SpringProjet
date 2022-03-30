package io.yassine_safir.springprojet.springprojet.Entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class ProduitCommandeAsso {

    @EmbeddedId
    ProduitCommandeKey id=new ProduitCommandeKey();

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
    @MapsId("idCommande")
    @JoinColumn(name = "id_commande")
    Commande commande;

    private double quantite;
}
