package io.yassine_safir.springprojet.springprojet.Web;

import io.yassine_safir.springprojet.springprojet.Entities.Categorie;
import io.yassine_safir.springprojet.springprojet.Services.ICategorieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CategorieController {
    @Autowired
    ICategorieService CategorieService;

    @GetMapping("/Categories")
    public List<Categorie> findall(){
        return  CategorieService.getAllCategorie();
    }

    @GetMapping("/Categories/{id}")
    public Categorie findById(@PathVariable("id") Long id){
        Categorie categorie = CategorieService.getCategorieById(id);
        return categorie;
    }

    @PostMapping("/Categories/nouveau")
    public Categorie addCategorie(@RequestBody Categorie Categorie){
        return CategorieService.saveCategorie(Categorie);
    }

    @PutMapping("/Categories/{id}")
    public Categorie updateCategorie(@PathVariable("id") Long id, @RequestBody Categorie Categorie){
        return CategorieService.updateCategorie(id,Categorie);
    }

    @DeleteMapping("/Categories/{id}")
    public void deleteCategorie(@PathVariable("id") Long id){
        CategorieService.deleteCategorieById(id);
    }

}
