package io.yassine_safir.springprojet.springprojet.Web;

import io.yassine_safir.springprojet.springprojet.Entities.MatierePremiere;
import io.yassine_safir.springprojet.springprojet.Services.IMatierePremiereService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MatierePremiereController {
    @Autowired
    IMatierePremiereService MatierePremiereService;

    @GetMapping("/MatierePremieres")
    public List<MatierePremiere> findall(){
        return  MatierePremiereService.getAllMatierePremiere();
    }

    @GetMapping("/MatierePremieres/{id}")
    public MatierePremiere findById(@PathVariable("id") Long id){
        MatierePremiere mp = MatierePremiereService.getMatierePremiereById(id);
        return mp;
    }

    @PostMapping("/MatierePremieres/nouveau")
    public MatierePremiere addMatierePremiere(@RequestBody MatierePremiere MatierePremiere){
        return MatierePremiereService.saveMatierePremiere(MatierePremiere);
    }

    @PutMapping("/MatierePremieres/{id}")
    public MatierePremiere updateMatierePremiere(@PathVariable("id") Long id, @RequestBody MatierePremiere MatierePremiere){
        return MatierePremiereService.updateMatierePremiere(id,MatierePremiere);
    }

    @DeleteMapping("/MatierePremieres/{id}")
    public void deleteMatierePremiere(@PathVariable("id") Long id){
        MatierePremiereService.deleteMatierePremiereById(id);
    }


}
