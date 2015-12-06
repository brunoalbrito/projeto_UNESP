/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mackenzie.projetounesp.modelo;

/**
 *
 * @author Bruno
 */
public class Valores {
   int  cod_valores;
   private String nome;
   private String valores;
   
   //Para o formulario FrmFAIE
   private String valores_ini;
   private String valores_final;

    public int getCod_valores() {
        return cod_valores;
    }

    public void setCod_valores(int cod_valores) {
        this.cod_valores = cod_valores;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getValores() {
        return valores;
    }

    public void setValores(String valores) {
        this.valores = valores;
    }

    public String getValores_ini() {
        return valores_ini;
    }

    public void setValores_ini(String valores_ini) {
        this.valores_ini = valores_ini;
    }

    public String getValores_final() {
        return valores_final;
    }

    public void setValores_final(String valores_final) {
        this.valores_final = valores_final;
    }
}
