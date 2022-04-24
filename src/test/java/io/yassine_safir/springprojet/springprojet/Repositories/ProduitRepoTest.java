package io.yassine_safir.springprojet.springprojet.Repositories;

import io.yassine_safir.springprojet.springprojet.Entities.Produit;
import io.yassine_safir.springprojet.springprojet.Services.ProduitService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ProduitRepoTest {

    @Autowired
    ProduitRepo produitRepo;
    @Autowired
    UniteRepo uniteRepo;
    @Autowired
    CategorieRepo categorieRepo;


    @Autowired
    ProduitService produitService;

    @Test
    public void saveProduit(){
        Produit produit = Produit.builder()
                .ref("P001")
                .nom("Argan d'Agadir")
                .description("une tres bonne qualite d'argan")
                .prix(1000)
                .unite(uniteRepo.findByLibelle("Litre"))
                .categorie(categorieRepo.findByLibelle("Cosmetique"))
                .build();

        produitRepo.save(produit);
    }

    public void getProduit(){
        Produit produit = produitService.getProduitById("P001");
//        System.out.println("✅ Produit : "+produit.getNom());
    }
}

