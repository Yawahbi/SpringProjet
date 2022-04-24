package io.yassine_safir.springprojet.springprojet.Services;

import io.yassine_safir.springprojet.springprojet.Entities.Region;

import java.util.List;

public interface IRegionService {
    public List<Region> getAllRegion();

    public Region getRegionById(Long id);

    public Region getRegionByLibelle(String libelle);

    public Region saveRegion(Region region);

    public Region updateRegion(Long id, Region region);

    public void deleteRegionById(Long id);
}
