package io.yassine_safir.springprojet.springprojet.Services;

import io.yassine_safir.springprojet.springprojet.Entities.Unite;

import java.util.List;

public interface IUniteService {
    public List<Unite> getAllUnite();

    public Unite getUniteById(Long id);

    public Unite saveUnite(Unite unite);

    public Unite updateUnite(Long id, Unite unite);

    public void deleteUniteById(Long id);
}
