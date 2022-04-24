package io.yassine_safir.springprojet.springprojet.Services;

import io.yassine_safir.springprojet.springprojet.Entities.Region;
import io.yassine_safir.springprojet.springprojet.Repositories.RegionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegionService implements IRegionService {

    @Autowired
    RegionRepo regionRepo;

    @Override
    public List<Region> getAllRegion() {
        return regionRepo.findAll();
    }

    @Override
    public Region getRegionById(Long id) {
        return regionRepo.getById(id);
    }

    @Override
    public Region getRegionByLibelle(String libelle) {
        return regionRepo.findByLibelle(libelle);
    }

    @Override
    public Region saveRegion(Region region) {
        return regionRepo.save(region);
    }

    @Override
    public Region updateRegion(Long id, Region region) {
        return regionRepo.save(region);
    }

    @Override
    public void deleteRegionById(Long id) {
        regionRepo.deleteById(id);
    }
}
