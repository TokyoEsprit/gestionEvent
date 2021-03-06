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
public class Competition {

    private int comp_id;
    private String nom;
    private String description;
    private String date;
    private String heure;
    private String circuit;
    private int long_circuit;
    private String organisateur;
    private String recompense;
    private int nbr_participant;

    public Competition(int comp_id, String nom, String description, String date,
            String heure, String circuit, int long_circuit, String organisateur,
            String recompense, int nbr_participant) {
        this.comp_id = comp_id;
        this.nom = nom;
        this.description = description;
        this.date = date;
        this.heure = heure;
        this.circuit = circuit;
        this.long_circuit = long_circuit;
        this.organisateur = organisateur;
        this.recompense = recompense;
        this.nbr_participant = nbr_participant;
    }

    public Competition(String nom, String description, String date, String heure,
            String circuit, int long_circuit, String organisateur, String recompense,
            int nbr_participant) {
        this.nom = nom;
        this.description = description;
        this.date = date;
        this.heure = heure;
        this.circuit = circuit;
        this.long_circuit = long_circuit;
        this.organisateur = organisateur;
        this.recompense = recompense;
        this.nbr_participant = nbr_participant;

    }

    public int getComp_id() {
        return comp_id;
    }

    public void setComp_id(int comp_id) {
        this.comp_id = comp_id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
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

    public int getLong_circuit() {
        return long_circuit;
    }

    public void setLong_circuit(int long_circuit) {
        this.long_circuit = long_circuit;
    }

    public String getOragnisateur() {
        return organisateur;
    }

    public void setOragnisateur(String organisateur) {
        this.organisateur = organisateur;
    }

    public String getRecompense() {
        return recompense;
    }

    public void setRecompense(String recompense) {
        this.recompense = recompense;
    }

    public int getNbr_participant() {
        return nbr_participant;
    }

    public void setNbr_participant(int nbr_participant) {
        this.nbr_participant = nbr_participant;
    }

    @Override
    public String toString() {
        return "Competition{" + "id=" + comp_id + ", nom=" + nom + ", description=" 
                + description + ", date=" + date + ", heure=" + heure + ", circuit=" 
                + circuit + ", longueur du circuit=" + long_circuit + ", organisateur="
                + organisateur + ", recompense=" + recompense + ", nombre participants="
                + nbr_participant + '}';
    }

}
