package io.yassine_safir.springprojet.springprojet.Services;

import io.yassine_safir.springprojet.springprojet.DTO.ProduitDto;
import io.yassine_safir.springprojet.springprojet.Entities.*;
import io.yassine_safir.springprojet.springprojet.Repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class ProduitService implements IProduitService {

    @Autowired
    ProduitRepo produitRepo;

    @Autowired
    CategorieRepo categorieRepo;

    @Autowired
    UniteRepo uniteRepo;

    @Autowired
    MatierePremiereRepo matierePremiereRepo;

    @Autowired
    RegionRepo regionRepo;

    @Override
    public List<Produit> getAllProduit(){
        return produitRepo.findAll();
    }

    @Override
    public Produit getProduitById(String ref){
        return produitRepo.findById(ref).orElseGet(null);
    }

    @Override
    public Produit saveProduit(ProduitDto produitDto) {
//        unite et categorie de produit
        Unite unite = uniteRepo.findById(produitDto.getUnite()).orElseGet(null);
        Categorie categorie = categorieRepo.findById(produitDto.getCategorie()).orElseGet(null);

        Produit produit = Produit.builder().
                ref(produitDto.getRef())
                .nom(produitDto.getNom())
                .description(produitDto.getDescription())
                .prix(produitDto.getPrix())
                .unite(unite)
                .categorie(categorie)
                .build();
        List<ProduitMatiereAsso> produitMatiereList = new ArrayList<>();

//        Ajouter les matieres premieres est leurs origins
        for (Map.Entry<String,Long> me : produitDto.getMatierePremiere_region().entrySet()){
            MatierePremiere matierePremiere = matierePremiereRepo.findById(Long.parseLong(me.getKey())).orElseGet(null);
            Region region = regionRepo.findById(me.getValue()).orElseGet(null);
            produitMatiereList.add(ProduitMatiereAsso
                    .builder()
                    .id(new ProduitMatiereKey(produit.getRef(),matierePremiere.getId()))
                    .produit(produit)
                    .matierePremiere(matierePremiere)
                    .origin(region)
                    .build());
        }
        produit.setProduitMatieresAsso(produitMatiereList);

        return produitRepo.save(produit);
    }

    @Override
    public Produit updateProduit(String ref, Produit Produit) {
        Produit pr = produitRepo.findById(ref).orElseGet(null);
        pr.setPrix(Produit.getPrix());
        return produitRepo.save(pr);
    }

    @Override
    public void deleteProduitById(String ref) {
        produitRepo.deleteById(ref);
    }

    @Override
    public void ProduitCat(String nomp, String nomc) {
        Produit pr = produitRepo.findByNom(nomp);
        Categorie cat = categorieRepo.findByLibelle(nomc);
        pr.setCategorie(cat);
        produitRepo.save(pr);
    }

    @Override
    public void updateProduit(String nomp, String nomc) {
        Produit Produit = produitRepo.findByNom(nomp);
        Categorie cat = categorieRepo.findByLibelle(nomc);
        Produit.setCategorie(cat);
        produitRepo.save(Produit);
    }
}
