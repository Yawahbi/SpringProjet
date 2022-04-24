package io.yassine_safir.springprojet.springprojet.Repositories;

import io.yassine_safir.springprojet.springprojet.Entities.Region;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class RegionRepoTest {

    @Autowired
    RegionRepo regionRepo;

    @Test
    public void saveRegion(){
        Region region = Region.builder().libelle("Agadir").build();
        Region region1 = Region.builder().libelle("Casa").build();

        regionRepo.save(region);
        regionRepo.save(region1);
    }
}
