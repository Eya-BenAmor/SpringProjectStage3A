package com.example.projetstage.models;

import java.math.BigDecimal;
import javax.persistence.*;

@Entity
@Table(name = "vehicule")
public class Vehicule {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Integer id;


    private String marque;

    private String couleur;
    private String etat;
    private String modele;
    private String matricule;

    private Integer nbC;
    private Integer chas;
    public Integer getId() {
        return id;
    }

    public Integer getNbC() {
        return nbC;
    }

    public Integer getChas() {
        return chas;
    }

    public void setChas(Integer chas) {
        this.chas = chas;
    }

    public String getEtat() {
        return etat;
    }

    public String getModele() {
        return modele;
    }

    public String getMatricule() {
        return matricule;
    }

    public String getCouleur() {
        return couleur;
    }

    public String getMarque() {
        return marque;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public void setNbC(Integer nbC) {
        this.nbC = nbC;
    }



    public void setEtat(String etat) {
        this.etat = etat;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public Vehicule() {
    }


    public Vehicule(Integer id, String marque, String couleur, String etat, String modele, String matricule, Integer nbC, Integer chas) {
        this.id = id;
        this.marque = marque;
        this.couleur = couleur;
        this.etat = etat;
        this.modele = modele;
        this.matricule = matricule;
        this.nbC = nbC;
        this.chas = chas;
    }

    @Override
    public String toString() {
        return "Vehicule{" +
                "id=" + id +
                ", marque='" + marque + '\'' +
                ", couleur='" + couleur + '\'' +
                ", etat='" + etat + '\'' +
                ", modele='" + modele + '\'' +
                ", matricule='" + matricule + '\'' +
                ", nbC=" + nbC +
                ", chas=" + chas +
                '}';
    }
}
