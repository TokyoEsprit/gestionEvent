/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.velotn.Service;

import com.velotn.Entite.Competition;
import com.velotn.IService.IService;
import com.velotn.Utils.DataBase;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Home
 */
public class ServiceCompetition implements IService<Competition> {

    private Connection con;
    private Statement ste;

    public ServiceCompetition() {
        con = DataBase.getInstance().getConnection();

    }

    @Override
    public void ajouter(Competition c) throws SQLException {
        ste = con.createStatement();
        String requeteInsert = "INSERT INTO `velotn`.`competition` (`comp_id`, `nom`,"
                + " `description`, `date`, `heure`, `circuit`, `long_circuit`,"
                + " `oraganisateur`, `recompense`, `nbr_participant`)"
                + " VALUES (NULL, '" + c.getNom() + "', '" + c.getDescription()+
                "', '" + c.getDate()+ "', '" + c.getHeure()+
                "', '" + c.getCircuit()+ "', '" + c.getLong_circuit()+ "', '"
                + c.getOragnisateur()+ "', '" + c.getRecompense()+ "', '" +
                c.getNbr_participant()+ "');";
        ste.executeUpdate(requeteInsert);
    }
//    public void ajouter1(Competition m) throws SQLException
//    {
//    PreparedStatement pre=con.prepareStatement("INSERT INTO `velotn`.`competition` "
//            + "( `nom`, `description`, `date`, `heure`, `circuit`, `long_circuit`, "
//            + "`organisateur`, `recompense`, `nbr_participant` ) VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ?);");
//    pre.setString(1, m.getNom());
//    pre.setString(2, m.getDescription());
//    pre.setString(3, m.getDate());
//    pre.setString(4, m.getHeure());
//    pre.setString(5, m.getCircuit());
//    pre.setInt(6, m.getLong_circuit());
//    pre.setString(7, m.getOragnisateur());
//    pre.setString(8, m.getRecompense());
//    pre.setInt(9, m.getNbr_participant());
//    pre.executeUpdate();
//    }
            

    @Override
    public boolean delete(Competition c) throws SQLException {
         String sql = "DELETE FROM competition WHERE nom=?";
 
PreparedStatement statement = con.prepareStatement(sql);
statement.setString(1, c.getNom());
 
int rowsDeleted = statement.executeUpdate();
if (rowsDeleted > 0) {
    System.out.println("une competition a été supprimée avec succés!");
}
return true;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Competition c) throws SQLException {
         String sql = "UPDATE competition SET nom=?, description=?, date=?, heure=?, circuit=?,long_circuit=?, oraganisateur=?, recompense=?, nbr_participant=? WHERE titre=?";
 
PreparedStatement statement = con.prepareStatement(sql);
statement.setString(1, c.getNom());
statement.setString(2, c.getDescription());
statement.setString(3, c.getDate());
statement.setString(4, c.getHeure());
statement.setString(5, c.getCircuit());
statement.setInt(6, c.getLong_circuit());
statement.setString(7, c.getRecompense());
statement.setInt(8, c.getNbr_participant());
 
int rowsUpdated = statement.executeUpdate();
if (rowsUpdated > 0) {
    System.out.println("An existing competition was updated successfully!");
}
return true;
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Competition> readAll() throws SQLException {
    List<Competition> arr=new ArrayList<>();
    ste=con.createStatement();
    ResultSet rs=ste.executeQuery("select * from competition");
     while (rs.next()) {                
               int comp_id=rs.getInt("comp_id");
               String nom=rs.getString("nom");
               String description=rs.getString("description");
               String date=rs.getString("date");
               String heure=rs.getString("heure");
               String circuit=rs.getString("circuit");
               int long_circuit=rs.getInt("long_circuit");
               String organisateur=rs.getString("organisateur");
               String recompense=rs.getString("recompense");
               int nbr_participant=rs.getInt("nbr_participant");
               Competition C=new Competition(comp_id, nom, description, date, heure, circuit, long_circuit, organisateur, recompense, nbr_participant);
     arr.add(C);
     }
    return arr;
    }
}

