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
public class DePasajeros extends Camion {
    
    private int totalPasaj;

    public DePasajeros() {
        
    }
    
    public DePasajeros(int totalPasaj, String marca, String numMotor, String placas) {
        super(marca, numMotor, placas);
        this.totalPasaj = totalPasaj;
    }
     public DePasajeros(String placas) {
        super(placas);
    }
    
    public String toString(){
        StringBuilder res= new StringBuilder();
        
        res.append(super.toString());
        res.append("\nTotal pasajeros: "+totalPasaj);
        
        return res.toString();
    }
    
    
 
}
