/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mackenzie.projetounesp.dao;

import br.com.mackenzie.projetounesp.modelo.Valores;
import br.com.mackenzie.projetounesp.conexao.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Bruno
 */
public class ValoresDAO {
    
    private Connection connection;    
    
    public ValoresDAO(){
        this.connection = new ConnectionFactory().getConnection();
    }
    public void pesquisa(Valores valores){
        try {
            PreparedStatement stml = this.connection.prepareStatement("select * from "+ valores.getNome() +" where codigo_valores = "+
                    valores.getCod_valores());
            
            ResultSet rs=stml.executeQuery();
            while(rs.next()){
                
                valores.setValores(rs.getString("valores"));
            }
            rs.close();
            stml.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    //Criando método para retorno em lista
    
    public List<Valores> getLista(Valores valor){
        String sql = ("select * from "+valor.getNome()+" where codigo_valores>="+valor.getValores_ini()+" and codigo_valores<="+valor.getValores_final()+";");
        try {
            List<Valores> valores = new ArrayList<>();
            PreparedStatement stml = this.connection.prepareStatement(sql);
            ResultSet rs =  stml.executeQuery();
            
            while(rs.next()){
                Valores v = new Valores();
                v.setCod_valores(rs.getInt("codigo_valores"));
                v.setValores(rs.getString("valores"));
                
                valores.add(v);
            }
            rs.close();
            stml.close();
            return valores;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
