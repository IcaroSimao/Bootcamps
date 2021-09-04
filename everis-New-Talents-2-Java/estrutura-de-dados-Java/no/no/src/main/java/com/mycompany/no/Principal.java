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
public class Principal {
    public static void main(String[] args) {
        No no1 = new No("1");
        No no2 = new No("2");
        No no3 = new No("3");
        No no4 = new No("4");
        
        no1.setProximoNo(no2);
        no2.setProximoNo(no3);
        no3.setProximoNo(no4);
        
        printarNosFilhos(no1);
    }
    
    public static void printarNosFilhos(No no){
        System.out.println(no);
        if(no.getProximoNo() != null) printarNosFilhos(no.getProximoNo());
    }
}
