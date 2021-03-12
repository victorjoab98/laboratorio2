/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.laboratorio2;

import java.io.Serializable;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;

/**
 *
 * @author victorjoab
 */
@SessionScoped
@Named("resta")
public class RestaBean implements Serializable {
    private String numero1;
    private String numero2;
    private int resultado;
    
    public String resta(){
        resultado =  Integer.parseInt(numero1) 
                - Integer.parseInt(numero2);
        return "resultadoResta";
    }

    public String getNumero1() {
        return numero1;
    }

    public void setNumero1(String numero1) {
        this.numero1 = numero1;
    }

    public String getNumero2() {
        return numero2;
    }

    public void setNumero2(String numero2) {
        this.numero2 = numero2;
    }

    public int getResultado() {
        return resultado;
    }   
}
