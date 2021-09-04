/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.no;

/**
 *
 * @author ISMsi
 */
public class No {
    private String conteudo;
    private No proximoNo;
    
    public No(String conteudo){
        this.conteudo = conteudo;
        this.proximoNo = null;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public No getProximoNo() {
        return proximoNo;
    }

    public void setProximoNo(No proximoNo) {
        this.proximoNo = proximoNo;
    }

    @Override
    public String toString() {
        return "No{\n"
                + "   conteudo: "+ this.conteudo
                + "\n}";
    }

    
    
    
    
}
