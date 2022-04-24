package io.yassine_safir.springprojet.springprojet.Services;

import io.yassine_safir.springprojet.springprojet.Entities.MatierePremiere;

import java.util.List;

public interface IMatierePremiereService {
    public List<MatierePremiere> getAllMatierePremiere();

    public MatierePremiere getMatierePremiereById(Long id);

    public MatierePremiere saveMatierePremiere(MatierePremiere MatierePremiere);

    public MatierePremiere updateMatierePremiere(Long id, MatierePremiere MatierePremiere);

    public void deleteMatierePremiereById(Long id);
}
