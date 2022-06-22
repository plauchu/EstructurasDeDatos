/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosherencia;

import java.util.Objects;

/**
 *
 * @author Plauchu
 */
public abstract class Camion implements Comparable <Camion> {
    
    private String marca;
    private String numMotor;
    private String placas;

    public Camion() {
        
    }

    public Camion(String marca, String numMotor, String placas) {
        this.marca = marca;
        this.numMotor = numMotor;
        this.placas = placas;
    }
    public Camion(String placas) {
        this.placas=placas;
    }

    public String toString(){
        StringBuilder res= new StringBuilder();
        
        res.append("Marca: "+marca);
        res.append("\nNúmero de motor: "+numMotor);
        res.append("\nPlacas: "+placas);
        
        return res.toString();
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
        final Camion other = (Camion) obj;
        if (!Objects.equals(this.placas, other.placas)) {
            return false;
        }
        return true;
    }
    
    public int compareTo (Camion otro){
        return this.placas.compareTo(otro.placas);
    }

    
}
