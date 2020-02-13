/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.velotn.Entite;

/**
 *
 * @author Home
 */
public class Sortie {
    private int sort_id;
    private String titre;
    private String description;
    private String date;
    private String heure;
    private String circuit;
    private String organisateur;
    private String guide;
    
    public Sortie(int sort_id, String titre, String description, String date,
            String heure, String circuit, String organisateur,
            String guide) {
        this.sort_id = sort_id;
        this.titre = titre;
        this.description = description;
        this.date = date;
        this.heure = heure;
        this.circuit = circuit;
        this.organisateur = organisateur;
        this.guide = guide;
        
    }

    public Sortie(String titre, String description, String date, String heure,
            String circuit, String organisateur, String guide ) {
        this.titre = titre;
        this.description = description;
        this.date = date;
        this.heure = heure;
        this.circuit = circuit;
        this.organisateur = organisateur;
        this.guide = guide;

    }

    public int getSort_id() {
        return sort_id;
    }

    public void setSort_id(int sort_id) {
        this.sort_id = sort_id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHeure() {
        return heure;
    }

    public void setHeure(String heure) {
        this.heure = heure;
    }

    public String getCircuit() {
        return circuit;
    }

    public void setCircuit(String circuit) {
        this.circuit = circuit;
    }


    public String getOragnisateur() {
        return organisateur;
    }

    public void setOragnisateur(String organisateur) {
        this.organisateur = organisateur;
    }

    public String getGuide() {
        return guide;
    }

    public void setRecompense(String guide) {
        this.guide = guide;
    }


    @Override
    public String toString() {
        return "Sortie{" + "id=" + sort_id + ", titre=" + titre + ", description=" 
                + description + ", date=" + date + ", heure=" + heure + ", circuit=" 
                + circuit +  ", organisateur=" + organisateur + ", guide=" + guide +  '}';
    }

}
