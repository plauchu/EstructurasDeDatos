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
public class Avion implements ObjVolador, Comparable <Avion>{
    
    private String aerolinea;
    private int clave;
    private static int serie=1;
    private int capacidad;

    public Avion() {
        clave=serie;
        serie++;
    }

    public Avion(String aerolinea, int capacidad) {
        this();
        this.aerolinea = aerolinea;
        this.capacidad = capacidad;
    }
    
    public Avion(int clave) {
        this.clave=clave;
    }

    public String getAerolinea() {
        return aerolinea;
    }

    public int getClave() {
        return clave;
    }

    public int getCapacidad() {
        return capacidad;
    }
    
    public void despega(){
        
    }
    
    public void aterriza(){
        
    }
    public void seDesplaza(){
        
    }
    
    public String toString(){
        StringBuilder res= new StringBuilder();
        
        res.append("Aerolinea: "+aerolinea);
        res.append("\nCapacidad: "+capacidad);
        res.append("\nClave: "+clave);
        
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
        final Avion other = (Avion) obj;
        if (this.clave != other.clave) {
            return false;
        }
        return true;
    }

    public int compareTo(Avion otro) {
         int res=-1;
        
        if(this.clave==otro.clave){
            res=0;
        }
            else 
                if(this.clave>otro.clave){
                    res=1;
                }
        
        return res;
    }
     
}
