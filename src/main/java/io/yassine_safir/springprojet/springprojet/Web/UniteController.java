package io.yassine_safir.springprojet.springprojet.Web;

import io.yassine_safir.springprojet.springprojet.Entities.Unite;
import io.yassine_safir.springprojet.springprojet.Services.IUniteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UniteController {
    @Autowired
    IUniteService UniteService;

    @GetMapping("/Unites")
    public List<Unite> findall(){
        return  UniteService.getAllUnite();
    }

    @GetMapping("/Unites/{id}")
    public Unite findById(@PathVariable("id") Long id){
        Unite unite = UniteService.getUniteById(id);
        return unite;
    }

    @PostMapping("/Unites/nouveau")
    public Unite addUnite(@RequestBody Unite Unite){
        return UniteService.saveUnite(Unite);
    }

    @PutMapping("/Unites/{id}")
    public Unite updateUnite(@PathVariable("id") Long id, @RequestBody Unite Unite){
        return UniteService.updateUnite(id,Unite);
    }

    @DeleteMapping("/Unites/{id}")
    public void deleteUnite(@PathVariable("id") Long id){
        UniteService.deleteUniteById(id);
    }
}
