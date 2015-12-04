/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mackenzie.projetounesp.conexao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Bruno
 */
public class ConnectionFactory {
    public Connection getConnection(){
        System.out.println("Conectando ao banco");
        try {
            return 
        DriverManager.getConnection("jdbc:mysql://localhost/projetounesp","teste","123");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
