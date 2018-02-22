/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testpolinomios;

/**
 *
 * @author Karen Velasco
 */
public class Monomio {
    private Integer coeficiente;
    private Integer exponente;
    
    private Monomio next;
    
    public Monomio(){
        this.coeficiente = 0;
        this.exponente = 0;
    }
    
    public Monomio(Integer coeficiente, Integer exponente){
        this.coeficiente = coeficiente;
        this.exponente = exponente;
    }   
    
    //getters and setters
    
    public void setCoeficiente(Integer coeficiente){
        this.coeficiente = coeficiente;
    }
    
    public Integer getCoeficiente(){
        return coeficiente;
    }
    
    public void setExponente(Integer exponente){
        this.exponente = exponente;
    }
    
    public Integer getExponente(){
        return exponente;
    }
    
    public void setNext(Monomio next){
        this.next = next;
    }
    
    public Monomio getNext(){
        return next;
    }
    
}
