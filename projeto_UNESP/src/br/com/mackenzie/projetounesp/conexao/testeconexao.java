/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mackenzie.projetounesp.conexao;
/**
 *
 * @author Bruno
 */
public class testeconexao {
    public static void main(String[] args){
        ConnectionFactory c = new ConnectionFactory();
        c.getConnection();
        System.out.println("Conexão criada com sucesso");
    }
}
