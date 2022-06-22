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
public class Rectangulo {
    private double base;
    private double altura;

    public Rectangulo() {
    }
    /**
     * 
     * @param base
     * @param altura 
     */
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    /**
     * 
     * @return 
     */
    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    /**
     * <pre>
     * Calcula el area del rec
     * </pre>
     * @return double
     */
    public double calculaArea () {
        return base*altura;
    }
    public double calculaPerimetro (){
        return 2*base+2*altura;
    }
    /**
     * 
     * @param obj
     * @return 
     */
    @Override
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
        final Rectangulo other = (Rectangulo) obj;
        if (Double.doubleToLongBits(this.base) != Double.doubleToLongBits(other.base)) {
            return false;
        }
        if (Double.doubleToLongBits(this.altura) != Double.doubleToLongBits(other.altura)) {
            return false;
        }
        return true;
    }
    /**
     * 
     * @return 
     */
    public String toString(){
        StringBuilder res= new StringBuilder();
        
        res.append("\nAltura: "+altura);
        res.append("\nBase: "+base);

        return res.toString();
    }
    
    
    
    
    
}
