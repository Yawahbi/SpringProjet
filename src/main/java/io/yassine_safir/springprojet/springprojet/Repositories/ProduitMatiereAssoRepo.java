package io.yassine_safir.springprojet.springprojet.Repositories;

import io.yassine_safir.springprojet.springprojet.Entities.ProduitMatiereAsso;
import io.yassine_safir.springprojet.springprojet.Entities.ProduitMatiereKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProduitMatiereAssoRepo extends JpaRepository<ProduitMatiereAsso, ProduitMatiereKey> {
    
}
