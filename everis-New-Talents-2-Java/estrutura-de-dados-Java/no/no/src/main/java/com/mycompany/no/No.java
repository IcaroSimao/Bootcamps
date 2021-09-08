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

/*
    Aplicando Generics ao NO
*/
public class No<T> {
    /*
        Conteúdo não será somente de um tipo, podendo ser Inteiro, String, Double, etc..
    */
    private T conteudo;
    private No<T> proximoNo;
    
    public No(T conteudo){
        this.conteudo = conteudo;
        this.proximoNo = null;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public No<T> getProximoNo() {
        return proximoNo;
    }

    public void setProximoNo(No<T> proximoNo) {
        this.proximoNo = proximoNo;
    }

    @Override
    public String toString() {
        return "No{\n"
                + "   conteudo: "+ this.conteudo
                + "\n}";
    }

    
    
    
    
}
