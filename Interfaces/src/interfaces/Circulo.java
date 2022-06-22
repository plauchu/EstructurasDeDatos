/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author Plauchu
 */
public class Circulo implements FiguraGeometrica{
    
    private double radio;

    public double getRadio() {
        return radio;
    }


    public Circulo(double radio) {
        this.radio = radio;
    }
    
     public double calculaArea() {
        return Math.PI*(Math.pow(radio, 2));
    }

    
    public double calculaPerim() {
        return Math.PI*(2*radio);
    }
    
    public String toString(){
        StringBuilder res= new StringBuilder();
        
        res.append("\nCírculo");
        res.append("\nRadio: "+radio);
        
        return res.toString();
    }
    
}
