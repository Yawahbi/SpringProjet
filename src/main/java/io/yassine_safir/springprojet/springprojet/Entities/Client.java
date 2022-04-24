package io.yassine_safir.springprojet.springprojet.Entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;

//@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Client {

    @Id
    private String CIN;
    private String nom;
    private String prenom;
    private String Address;
    private String tel;


}
