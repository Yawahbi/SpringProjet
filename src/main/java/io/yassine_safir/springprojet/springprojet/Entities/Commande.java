package io.yassine_safir.springprojet.springprojet.Entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Commande {

    @Id
    private String ref;
    private Date dateCommande;

    @ManyToOne
    @JoinColumn(name = "id_client")
    Client client;

    @OneToMany(mappedBy = "commande",cascade = CascadeType.PERSIST)
    List<ProduitCommandeAsso> produitCommandes=new ArrayList<>();
}
