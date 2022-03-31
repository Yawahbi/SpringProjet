package io.yassine_safir.springprojet.springprojet.Services;

import io.yassine_safir.springprojet.springprojet.Entities.MatierePremiere;
import io.yassine_safir.springprojet.springprojet.Repositories.MatierePremiereRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MatierePremiereService implements IMatierePremiereService {

    @Autowired
    MatierePremiereRepo matierePremiereRepo;

    @Override
    public MatierePremiere getMatierePremiere(Long id) {
        MatierePremiere matierePremiere = matierePremiereRepo.findById(id).get();
        return matierePremiere;
    }
}
