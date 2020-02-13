/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.velotn.Test;

import com.velotn.Entite.Competition;
import com.velotn.Entite.Sortie;
import com.velotn.Service.ServiceCompetition;
import com.velotn.Service.ServiceSortie;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Home
 */
public class Test {
    
    public static void main(String[] args) {
        ServiceCompetition com = new ServiceCompetition();
        ServiceSortie sor = new ServiceSortie();
        
        Competition c1 = new Competition("Ejri", "circuit panoramique", "10/02/2020", "10h00", "bizerte", 10, "cab", "voyage", 50);
        Sortie s2 = new Sortie("ejri", "panoramique", "11/02/2020", "9h00", "benzart", "aiesec", "dali");
        
        try {
//         
            com.ajouter(c1);
            sor.ajouter(s2);
            List<Competition> list = com.readAll();
            List<Sortie> list2 = sor.readAll();
            System.out.println(list);
            System.out.println(list2);
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
    
}