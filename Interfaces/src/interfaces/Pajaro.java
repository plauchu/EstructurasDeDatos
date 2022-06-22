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
public class Pajaro implements ObjVolador, Comparable <Pajaro>{
    
    private String tipo;
    private String habitat;
    private int clave;
    private static int serie=1;

    public Pajaro() {
        clave=serie;
        serie++;
    }

    public Pajaro(String tipo, String habitat) {
        this();
        this.tipo = tipo;
        this.habitat=habitat;
    }    
  
    public Pajaro(int clave) {
       this.clave=clave;
    } 

    public String getTipo() {
        return tipo;
    }

    public String getHabitat() {
        return habitat;
    }

    public int getClave() {
        return clave;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
    
    public void despega(){
        
    }
    
    public void aterriza(){
        
    }
    public void seDesplaza(){
        
    }
    
    public String toString(){
        StringBuilder res= new StringBuilder();
        
        res.append("Tipo: "+tipo);
        res.append("\nHabitat: "+habitat);
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
        final Pajaro other = (Pajaro) obj;
        if (this.clave != other.clave) {
            return false;
        }
        return true;
    }
    
    public int compareTo(Pajaro otro){
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
