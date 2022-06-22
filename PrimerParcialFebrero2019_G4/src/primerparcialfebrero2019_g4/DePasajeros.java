/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package primerparcialfebrero2019_g4;

public abstract class DePasajeros extends Camion{
    private int totalPasaj;

    public DePasajeros(String placas) {
        super(placas);
    }
    
    public DePasajeros(String modelo, String numMotor, String placas,double costo, boolean disponible, int tP) {
        super(modelo, numMotor, placas,costo,disponible);
        totalPasaj = tP;
    }
    
    public int getTotalPasaj() {
        return totalPasaj;
    }
   
    @Override
    public String toString() {
        StringBuilder cad = new StringBuilder();
        cad.append(super.toString());
        cad.append("\nTotal de pasajeros:" + totalPasaj);
        return cad.toString();
    }
}

