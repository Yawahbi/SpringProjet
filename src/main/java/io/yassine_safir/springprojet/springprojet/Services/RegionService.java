package io.yassine_safir.springprojet.springprojet.Services;

import io.yassine_safir.springprojet.springprojet.Entities.Categorie;
import io.yassine_safir.springprojet.springprojet.Entities.Region;
import io.yassine_safir.springprojet.springprojet.Repositories.CategorieRepo;
import io.yassine_safir.springprojet.springprojet.Repositories.RegionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegionService implements IRegionService {

    @Autowired
    RegionRepo regionRepo;

    @Override
    public Region getRegion(Long id) {
        Region region = regionRepo.findById(id).get();
        return region;
    }
}
