package io.yassine_safir.springprojet.springprojet.Services;

import io.yassine_safir.springprojet.springprojet.Entities.Categorie;
import io.yassine_safir.springprojet.springprojet.Entities.Produit;
import io.yassine_safir.springprojet.springprojet.Repositories.CategorieRepo;
import io.yassine_safir.springprojet.springprojet.Repositories.ProduitRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProduitService implements IProduitService {

    @Autowired
    ProduitRepo produitRepo;

    @Autowired
    CategorieRepo categorieRepo;

    @Override
    public List<Produit> findAllProduit(){
        return produitRepo.findAll();
    }

    @Override
    public Produit getProduitById(String ref){
        return produitRepo.findById(ref).get();
    }

    @Override
    public Produit saveProduit(Produit Produit) {
        return produitRepo.save(Produit);
    }

    @Override
    public Produit updateProduit(String ref, Produit Produit) {
        Produit pr = produitRepo.findById(ref).get();
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
