package io.yassine_safir.springprojet.springprojet.Web;

import io.yassine_safir.springprojet.springprojet.DTO.ProduitDto;
import io.yassine_safir.springprojet.springprojet.Entities.Produit;
import io.yassine_safir.springprojet.springprojet.Services.IProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProduitController {
    @Autowired
    IProduitService produitService;

    @GetMapping("/Produits")
    public List<Produit> findall(){
        return  produitService.findAllProduit();
    }

    @GetMapping("/Produit/{ref}")
    public ResponseEntity<Produit> findById(@PathVariable("ref") String ref){
        Produit pr = produitService.getProduitById(ref);
        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.add("token","value1");
        return new ResponseEntity<>(pr, responseHeaders, HttpStatus.OK);
    }

    @PostMapping("/addProduit")
    public Produit addProduit(@RequestBody Produit Produit){
        produitService.saveProduit(Produit);
        return produitService.saveProduit(Produit);
    }

    @PutMapping("/Produit/{ref}")
    public Produit upProduit(@PathVariable("ref") String ref, @RequestBody Produit Produit){
        return produitService.updateProduit(ref,Produit);
    }

    @DeleteMapping("/Produit/{ref}")
    public void deleteProduit(@PathVariable("ref") String ref){
        produitService.deleteProduitById(ref);
    }

    @PostMapping("/Produitcat")
    public void ProduitCat(@RequestBody ProduitDto ProduitDto) {
        produitService.ProduitCat(ProduitDto.getProduitNom(),ProduitDto.getCategorieLibelle());
    }

    @PostMapping("/Produitcategory")
    public void ProduitCategpry(@RequestParam String nomp,@RequestParam String nomc) {
        produitService.ProduitCat(nomp,nomc);


    }

}
