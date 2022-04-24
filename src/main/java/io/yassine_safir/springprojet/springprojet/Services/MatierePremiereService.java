package io.yassine_safir.springprojet.springprojet.Services;

import io.yassine_safir.springprojet.springprojet.Entities.MatierePremiere;
import io.yassine_safir.springprojet.springprojet.Repositories.MatierePremiereRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatierePremiereService implements IMatierePremiereService {

    @Autowired
    MatierePremiereRepo matierePremiereRepo;

    @Override
    public List<MatierePremiere> getAllMatierePremiere() {
        return matierePremiereRepo.findAll();
    }

    @Override
    public MatierePremiere getMatierePremiereById(Long id) {
        return matierePremiereRepo.getById(id);
    }

    @Override
    public MatierePremiere saveMatierePremiere(MatierePremiere matierePremiere) {
        return matierePremiereRepo.save(matierePremiere);
    }

    @Override
    public MatierePremiere updateMatierePremiere(Long id, MatierePremiere matierePremiere) {
        return matierePremiereRepo.save(matierePremiere);
    }

    @Override
    public void deleteMatierePremiereById(Long id) {
        matierePremiereRepo.deleteById(id);
    }
}
