package io.yassine_safir.springprojet.springprojet.Entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Produit {

    @Id
    private String ref;
    private String nom;
    private String description;
    private double prix;

    @ManyToOne
    @JoinColumn(name = "id_unite")
    Unite unite;

    @ManyToOne
    @JoinColumn(name = "id_categorie")
    Categorie categorie;

    @ManyToOne
    @JoinColumn(name = "id_cooperative")
    User cooperative;

    @OneToMany(fetch = FetchType.EAGER,
            mappedBy = "produit",
            cascade = {CascadeType.ALL})
    List<ProduitMatiereAsso> produitMatieresAsso=new ArrayList<>();
}
