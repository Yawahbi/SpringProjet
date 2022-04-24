package io.yassine_safir.springprojet.springprojet.Web;

import io.yassine_safir.springprojet.springprojet.DTO.ProduitDto;
import io.yassine_safir.springprojet.springprojet.DTO.authDto.response.MessageResponse;
import io.yassine_safir.springprojet.springprojet.Entities.Produit;
import io.yassine_safir.springprojet.springprojet.Services.IProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Produits")
public class ProduitController {
    @Autowired
    IProduitService produitService;

    @GetMapping("")
    public List<Produit> findall(){
        return  produitService.getAllProduit();
    }

    @GetMapping("/{ref}")
    public ResponseEntity<?> findById(@PathVariable("ref") String ref){
        Produit produit = produitService.getProduitById(ref);
        if (produit==null) {
            return ResponseEntity
                    .badRequest()
                    .body(new MessageResponse("Error: No produit found!"));
        }
        return ResponseEntity.ok(produit);
    }

    @PostMapping("/nouveau")
    public ResponseEntity<?> addProduit(@RequestBody ProduitDto produitDto){
        if (produitService.getProduitById(produitDto.getRef())!=null) {
            return ResponseEntity
                    .badRequest()
                    .body(new MessageResponse("Error: Ref already exists!"));
        }
        if (produitService.saveProduit(produitDto)==null) {
            return ResponseEntity
                    .badRequest()
                    .body(new MessageResponse("Error: Operation faild!"));
        }
        return ResponseEntity.ok("Produit "+produitDto.getRef()+" have been created ");
    }

    @PutMapping("/{ref}")
    public ResponseEntity<?> updateProduit(@PathVariable("ref") String ref, @RequestBody Produit Produit){
        if (produitService.getProduitById(ref)==null) {
            return ResponseEntity
                    .badRequest()
                    .body(new MessageResponse("Error: No produit found!"));
        }
        if (produitService.updateProduit(ref,Produit)==null) {
            return ResponseEntity
                    .badRequest()
                    .body(new MessageResponse("Error: No produit found!"));
        }
        return ResponseEntity.ok("Produit "+ref+" have been deleted ");
    }

    @DeleteMapping("/{ref}")
    public ResponseEntity<?> deleteProduit(@PathVariable("ref") String ref){
        if (produitService.getProduitById(ref)==null) {
            return ResponseEntity
                    .badRequest()
                    .body(new MessageResponse("Error: No produit found!"));
        }
        produitService.deleteProduitById(ref);
        if (produitService.getProduitById(ref)!=null) {
            return ResponseEntity
                    .badRequest()
                    .body(new MessageResponse("Error: Operation faild!"));
        }
        return ResponseEntity.ok("Produit "+ref+" have been deleted ");
    }


}
