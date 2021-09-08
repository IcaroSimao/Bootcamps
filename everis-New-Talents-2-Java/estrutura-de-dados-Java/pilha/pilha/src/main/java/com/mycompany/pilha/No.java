/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pilha;

/**
 *
 * @author ISMsi
 */
public class No {
    private No referenciaNo;
    private String conteudo;
    
    public No(String conteudo){
        this.conteudo = conteudo;
        this.referenciaNo = null;
    }

    public No getReferenciaNo() {
        return referenciaNo;
    }

    public void setReferenciaNo(No referenciaNo) {
        this.referenciaNo = referenciaNo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    @Override
    public String toString() {
        return "No{ "
                + this.conteudo
                + " }";
    }
    
    
}
