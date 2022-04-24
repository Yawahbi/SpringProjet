package io.yassine_safir.springprojet.springprojet.Repositories;

import io.yassine_safir.springprojet.springprojet.Entities.ProduitMatiereAsso;
import io.yassine_safir.springprojet.springprojet.Entities.ProduitMatiereKey;
import io.yassine_safir.springprojet.springprojet.Services.MatierePremiereService;
import io.yassine_safir.springprojet.springprojet.Services.ProduitService;
import io.yassine_safir.springprojet.springprojet.Services.RegionService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ProduitMatiereAssoRepoTest {

    @Autowired
    ProduitService produitService;
    @Autowired
    MatierePremiereService matierePremiereService;
    @Autowired
    RegionService regionService;
    @Autowired
    ProduitMatiereAssoRepo produitMatiereAssoRepo;

    @Test
    public void saveProduitMatiere(){
        ProduitMatiereAsso produitMatiereAsso=ProduitMatiereAsso
                .builder()
                .id(new ProduitMatiereKey("P001",1L))
                .produit(produitService.getProduitById("P001"))
                .matierePremiere(matierePremiereService.getMatierePremiereById(1L))
                .origin(regionService.getRegionById(1L))
                .build();
        produitMatiereAssoRepo.save(produitMatiereAsso);
    }
}

