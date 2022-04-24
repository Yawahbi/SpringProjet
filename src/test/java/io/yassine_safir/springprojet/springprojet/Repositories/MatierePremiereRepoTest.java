package io.yassine_safir.springprojet.springprojet.Repositories;

import io.yassine_safir.springprojet.springprojet.Entities.MatierePremiere;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MatierePremiereRepoTest {

    @Autowired
    MatierePremiereRepo matierePremiereRepo;

    @Test
    public void saveMatierePremiere(){
        MatierePremiere matierePremiere = MatierePremiere.builder().libelle("Huile d'Argan").build();
        MatierePremiere matierePremiere1 = MatierePremiere.builder().libelle("Amlo").build();

        matierePremiereRepo.save(matierePremiere);
        matierePremiereRepo.save(matierePremiere1);
    }
}
