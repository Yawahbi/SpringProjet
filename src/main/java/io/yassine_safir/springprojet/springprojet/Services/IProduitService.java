package io.yassine_safir.springprojet.springprojet.Services;

import io.yassine_safir.springprojet.springprojet.DTO.ProduitDto;
import io.yassine_safir.springprojet.springprojet.Entities.Produit;

import java.util.List;

public interface IProduitService {
    public List<Produit> getAllProduit();

    public Produit getProduitById(String ref);

    public Produit saveProduit(ProduitDto produitDto);

    public Produit updateProduit(String ref, Produit produit);

    public void deleteProduitById(String ref);

    public void ProduitCat(String nomp, String nomc);

    public void updateProduit(String nomp, String nomc);


}
