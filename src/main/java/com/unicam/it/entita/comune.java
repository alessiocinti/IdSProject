package com.unicam.it.entita;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
public class comune {

    @Id
    private String id;

    private String name;

    private String regione;



    public String getId() {return id;}
    public void setId(String id) {this.id = id;}

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public String getRegione() {return regione;}
    public void setRegione(String regione) {this.regione = regione;}
}
