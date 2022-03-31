package io.yassine_safir.springprojet.springprojet.Services;

import io.yassine_safir.springprojet.springprojet.Entities.Unite;
import io.yassine_safir.springprojet.springprojet.Repositories.UniteRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UniteService implements IUniteService {

    @Autowired
    UniteRepo uniteRepo;

    @Override
    public Unite getUnite(Long id) {
        Unite unite = uniteRepo.findById(id).get();
        return unite;
    }
}
