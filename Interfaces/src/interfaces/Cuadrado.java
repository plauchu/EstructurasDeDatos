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
public class Cuadrado extends Cuadrilatero{
    
    private double lado;

    public Cuadrado(double lado) {
        super(lado);
    }

    public double calculaArea(){
        return Math.pow(super.lado, 2);
    }
    
    public double calculaPerim(){
        return 4*super.lado;
    }
    
    public String toString(){
        StringBuilder res= new StringBuilder();
        
        res.append("\nCuadrado");
        res.append("\nLado: "+super.lado);
        
        return res.toString();
    }
}
