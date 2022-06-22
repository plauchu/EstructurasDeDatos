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
public class Rectangulo extends Cuadrilatero{
    
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        super(base,altura);
    }
    
    public double calculaArea(){
        return super.base*super.altura;
    }
    
    public double calculaPerim(){
        return (2*super.base)+(2*super.altura);
    }
    
    public String toString(){
        StringBuilder res= new StringBuilder();
        
        res.append("\nRectángulo");
        res.append("\nBase: "+super.base);
        res.append("\nAltura: "+super.altura);
        
        return res.toString();
    }
    
}
