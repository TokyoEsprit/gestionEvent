/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.velotn.Service;

import com.velotn.Entite.Sortie;
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
public class ServiceSortie implements IService<Sortie> {

    private Connection con;
    private Statement ste;

    public ServiceSortie() {
        con = DataBase.getInstance().getConnection();

    }

    public void ajouter(Sortie s) throws SQLException {
        ste = con.createStatement();
        String requeteInsert = "INSERT INTO `velotn`.`sortie` (`sort_id`, `titre`,"
                + " `description`, `date`, `heure`, `circuit`, "
                + " `oraganisateur`, `guide`)"
                + " VALUES (NULL, '" + s.getTitre()+ "', '" + s.getDescription()+
                "', '" + s.getDate()+ "', '" + s.getHeure()+
                "', '" + s.getCircuit()+  "', '"
                + s.getOragnisateur()+ "', '" + s.getGuide()+ "');";
        ste.executeUpdate(requeteInsert);
    }
//    public void ajouter1(Sortie n) throws SQLException
//    {
//    PreparedStatement pre=con.prepareStatement("INSERT INTO `velotn`.`sortie` "
//            + "( `titre`, `description`, `date`, `heure`, `circuit`,  "
//            + "`organisateur`, `guide` ) VALUES ( ?, ?, ?, ?, ?, ?, ?);");
//    pre.setString(1, n.getTitre());
//    pre.setString(2, n.getDescription());
//    pre.setString(3, n.getDate());
//    pre.setString(4, n.getHeure());
//    pre.setString(5, n.getCircuit());
//    pre.setString(6, n.getOragnisateur());
//    pre.setString(7, n.getGuide());
//    pre.executeUpdate();
//    }
            

    @Override
    public boolean delete(Sortie s) throws SQLException {
        
        String sql = "DELETE FROM sortie WHERE titre=?";
 
PreparedStatement statement = con.prepareStatement(sql);
statement.setString(1, s.getTitre());
 
int rowsDeleted = statement.executeUpdate();
if (rowsDeleted > 0) {
    System.out.println("A user was deleted successfully!");
}
return true;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Sortie s) throws SQLException {
        String sql = "UPDATE sortie SET titre=?, description=?, date=?, heure=?, circuit=?, oraganisateur=?, guide=? WHERE titre=?";
 
PreparedStatement statement = con.prepareStatement(sql);
statement.setString(1, s.getTitre());
statement.setString(2, s.getDescription());
statement.setString(3, s.getDate());
statement.setString(4, s.getHeure());
statement.setString(5, s.getCircuit());
statement.setString(6, s.getOragnisateur());
statement.setString(7, s.getGuide());
 
int rowsUpdated = statement.executeUpdate();
if (rowsUpdated > 0) {
    System.out.println("An existing sortie was updated successfully!");
}
return true;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Sortie> readAll() throws SQLException {
    List<Sortie> arr=new ArrayList<>();
    ste=con.createStatement();
    ResultSet rs=ste.executeQuery("select * from sortie");
     while (rs.next()) {                
               int sort_id=rs.getInt("sort_id");
               String titre=rs.getString("titre");
               String description=rs.getString("description");
               String date=rs.getString("date");
               String heure=rs.getString("heure");
               String circuit=rs.getString("circuit");
               String organisateur=rs.getString("organisateur");
               String guide=rs.getString("guide");
               Sortie s=new Sortie(sort_id, titre, description, date, heure, circuit, organisateur, guide);
     arr.add(s);
     }
    return arr;
    }
}