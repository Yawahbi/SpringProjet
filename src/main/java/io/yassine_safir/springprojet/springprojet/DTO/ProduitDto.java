package io.yassine_safir.springprojet.springprojet.DTO;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class ProduitDto {
    private String ref;
    private String nom;
    private String description;
    private double prix;
    private Long unite;
    private Long categorie;
    private Map<String, Long> matierePremiere_region=new HashMap<>();

}
