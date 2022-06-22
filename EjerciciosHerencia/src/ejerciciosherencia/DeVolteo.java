/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosherencia;

/**
 *
 * @author Plauchu
 */
public class DeVolteo extends Camion{
    
    private double capacidadTon;

    public double getCapacidadTon() {
        return capacidadTon;
    }

    public void setCapacidadTon(double capacidadTon) {
        this.capacidadTon = capacidadTon;
    }
    
    public DeVolteo() {
        
    }

    public DeVolteo(double capacidadTon, String marca, String numMotor, String placas) {
        super(marca, numMotor, placas);
        this.capacidadTon = capacidadTon;
    }
    public DeVolteo(String placas) {
        super(placas);
    }
    
    public String toString(){
        StringBuilder res= new StringBuilder();
        
        res.append(super.toString());
        res.append("\nCapacidad: "+capacidadTon);
        
        
        return res.toString();
    }
    
    
}
