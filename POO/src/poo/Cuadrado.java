/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author Plauchu
 */
public class Cuadrado {
    
    private double lado;

    public Cuadrado() {
        
    }

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cuadrado other = (Cuadrado) obj;
        if (Double.doubleToLongBits(this.lado) != Double.doubleToLongBits(other.lado)) {
            return false;
        }
        return true;
    }
    
    public String toString (){
        StringBuilder res= new StringBuilder();
        
        res.append("Lado: "+lado);
        
        return res.toString();
    }
    
    public double calculaArea (){
        return lado*lado;
    }
    
    public double calculaPerimetro (){
        return lado*4;
    }
    
    
}
