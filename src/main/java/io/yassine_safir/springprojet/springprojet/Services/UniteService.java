package io.yassine_safir.springprojet.springprojet.Services;

import io.yassine_safir.springprojet.springprojet.Entities.Unite;
import io.yassine_safir.springprojet.springprojet.Repositories.UniteRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UniteService implements IUniteService {

    @Autowired
    UniteRepo uniteRepo;

    @Override
    public List<Unite> getAllUnite() {
        return uniteRepo.findAll();
    }

    @Override
    public Unite getUniteById(Long id) {
        return uniteRepo.getById(id);
    }

    @Override
    public Unite saveUnite(Unite unite) {
        return uniteRepo.save(unite);
    }

    @Override
    public Unite updateUnite(Long id, Unite unite) {
        return uniteRepo.save(unite);
    }

    @Override
    public void deleteUniteById(Long id) {
        uniteRepo.deleteById(id);
    }
}
