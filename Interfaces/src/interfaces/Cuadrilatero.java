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
public abstract class Cuadrilatero implements FiguraGeometrica{
    
    protected double lado;
    protected double base;
    protected double altura;

    public Cuadrilatero(double lado) {
        this.lado = lado;
    }

    public Cuadrilatero(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    public abstract double calculaArea();
      

    
    public abstract double calculaPerim();
    
}
