package io.yassine_safir.springprojet.springprojet.Services;

import io.yassine_safir.springprojet.springprojet.Entities.Categorie;
import io.yassine_safir.springprojet.springprojet.Repositories.CategorieRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategorieService implements ICategorieService {

    @Autowired
    CategorieRepo categorieRepo;

    @Override
    public List<Categorie> getAllCategorie() {
        return categorieRepo.findAll();
    }

    @Override
    public Categorie getCategorieById(Long id) {
        return categorieRepo.getById(id);
    }

    @Override
    public Categorie getCategorieByLibelle(String libelle) {
        return categorieRepo.findByLibelle(libelle);
    }

    @Override
    public Categorie saveCategorie(Categorie categorie) {
        return categorieRepo.save(categorie);
    }

    @Override
    public Categorie updateCategorie(Long id, Categorie categorie) {
        return categorieRepo.save(categorie);
    }

    @Override
    public void deleteCategorieById(Long id) {
        categorieRepo.deleteById(id);
    }
}
