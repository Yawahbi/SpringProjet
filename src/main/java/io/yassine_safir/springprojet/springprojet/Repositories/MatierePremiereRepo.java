package io.yassine_safir.springprojet.springprojet.Repositories;

import io.yassine_safir.springprojet.springprojet.Entities.MatierePremiere;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MatierePremiereRepo extends JpaRepository<MatierePremiere, String> {
    public MatierePremiere findMatierePremiereByLibelle(String libelle);
}
