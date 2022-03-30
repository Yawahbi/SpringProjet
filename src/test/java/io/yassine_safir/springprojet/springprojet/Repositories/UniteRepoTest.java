package io.yassine_safir.springprojet.springprojet.Repositories;

import io.yassine_safir.springprojet.springprojet.Entities.Unite;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UniteRepoTest {

    @Autowired
    UniteRepo uniteRepo;

    @Test
    public void saveUnite(){
        Unite unite = Unite.builder().libelle("Litre").build();

        uniteRepo.save(unite);
    }
}
