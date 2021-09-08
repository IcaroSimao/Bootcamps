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
public class Pilha {
    private No no;
    
    public Pilha(){
        this.no = null;
    };
    
    public void push(No newNo){
        No aux = this.no;
        this.no = newNo;
        this.no.setReferenciaNo(aux);
    }
    
    public void pop(){
        if(!isEmpty()) {
            this.no = this.no.getReferenciaNo();
        }
    }
    
    public No top(){
        return this.no;
    }
    
    public boolean isEmpty(){
        return this.no == null;
    }
}
