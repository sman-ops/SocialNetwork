package com.socialnetwork.dao;

import com.socialnetwork.entity.Member;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MemberDAO {
    // TODO CRUD: Create (insert), Read:Find(select), Update, Delete
    /*
    * méthode de creation des membres*/
    public void create(Member member){

        //String SQL_INSERT = "INSERT INTO member (prenom, nom, mot_de_passe, nom, date_inscription) VALUES (?, ?, ?, NOW())";
        //preparedStatement = initialisationRequetePreparee( connexion, SQL_INSERT, true, utilisateur.getEmail(), utilisateur.getMotDePasse(), utilisateur.getNom() );
        //int statut = preparedStatement.executeUpdate();
        Connection conn = null;
        Statement stmt = null;
        try {
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (Exception e) {
                System.out.println(e);
            }
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/test_slimen", "root", "root");
            System.out.println("Connection is created successfully:");
            stmt = (Statement) conn.createStatement();
            String query1 = "INSERT INTO member " + "VALUES ('Rob', 'John')";
            stmt.executeUpdate(query1);
            query1 = "INSERT INTO InsertDemo " + "VALUES ('Bill', 'Carol')";
            stmt.executeUpdate(query1);
            System.out.println("Record is inserted in the table successfully..................");
        } catch (SQLException excep) {
            excep.printStackTrace();
        } catch (Exception excep) {
            excep.printStackTrace();
        } finally {
            try {
                if (stmt != null)
                    conn.close();
            } catch (SQLException se) {}
            try {
                if (conn != null)
                    conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
        System.out.println("Please check it in the MySQL Table......... ……..");



    }



}
