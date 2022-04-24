package io.yassine_safir.springprojet.springprojet.Services;

import io.yassine_safir.springprojet.springprojet.Entities.Categorie;

import java.util.List;

public interface ICategorieService {
    public List<Categorie> getAllCategorie();

    public Categorie getCategorieById(Long id);

    public Categorie getCategorieByLibelle(String libelle);

    public Categorie saveCategorie(Categorie categorie);

    public Categorie updateCategorie(Long id, Categorie categorie);

    public void deleteCategorieById(Long id);
}
