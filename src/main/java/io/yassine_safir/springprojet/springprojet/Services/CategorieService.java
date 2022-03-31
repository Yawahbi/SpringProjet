package io.yassine_safir.springprojet.springprojet.Services;

import io.yassine_safir.springprojet.springprojet.Entities.Categorie;
import io.yassine_safir.springprojet.springprojet.Repositories.CategorieRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategorieService implements ICategorieService {

    @Autowired
    CategorieRepo categorieRepo;

    @Override
    public Categorie getCategorie(Long id) {
        Categorie categorie = categorieRepo.findById(id).get();
        return categorie;
    }
}
