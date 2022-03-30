package io.yassine_safir.springprojet.springprojet.Repositories;

import io.yassine_safir.springprojet.springprojet.Entities.Categorie;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CategorieRepoTest {

    @Autowired
    CategorieRepo categorieRepo;

    @Test
    public void saveCategorie(){
        Categorie categorie = Categorie.builder().libelle("Cosmetique").build();

        categorieRepo.save(categorie);
    }
}
