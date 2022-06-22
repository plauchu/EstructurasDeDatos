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
public class Triangulo implements FiguraGeometrica {
    
    private double base;
    private double altura;
    private double lado;
    private String tipo;

    public String getTipo() {
        return tipo;
    }

    public Triangulo(double base, double altura, double lado, String tipo) {
        this.base = base;
        this.altura = altura;
        this.lado=lado;
        this.tipo = tipo;
    }
   
    public double calculaArea() {
        return (base*altura)/2;
    }

    
    public double calculaPerim() {
        return base+altura+lado;
    }
    
    public String toString(){
        StringBuilder res= new StringBuilder();
        
        res.append("\nTriángulo");
        res.append("\nBase: "+base);
        res.append("\nAltura: "+altura);
        res.append("\nLado: "+lado);
        res.append("\nTipo: "+tipo);
        
        return res.toString();
    }
    
}
