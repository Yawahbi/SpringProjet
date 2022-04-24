package io.yassine_safir.springprojet.springprojet.Repositories;

import io.yassine_safir.springprojet.springprojet.Entities.Region;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegionRepo extends JpaRepository<Region, Long> {
    public Region findByLibelle(String libelle);
}
