/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import genericos.MAG;

/**
 *
 * @author Plauchu
 */
public class Aplicacion {
    
    private Pajaro[] pajaros;
    private int numPaja=0;
    private Avion[] aviones;
    private int numAvi=0;

    public Aplicacion() {
        pajaros= new Pajaro[10];
        aviones= new Avion[10];
    }
    
    public boolean altaPajaro(String tipo, String habitat){
        boolean res=false;
        
        if(numPaja<pajaros.length){
            pajaros[numPaja]= new Pajaro(tipo,habitat);
            numPaja++;
            res=true;
        }
        
        return res;
    }
    
    public boolean altaAvion(String aerolinea, int capacidad){
        boolean res=false;
        
        if(numAvi<aviones.length){
            aviones[numAvi]= new Avion(aerolinea,capacidad);
            numAvi++;
            res=true;
        }
        
        return res;
    }
    
    public String datosPajaro(int cu){
        String res= "No hay un pajaro con esa clave";
        Pajaro aux= new Pajaro(cu);
        int pos=MAG.busSecOrd(pajaros, numPaja, aux);
        
        if(pos!=-1){
            res=pajaros[pos].toString();
        }
            
        return res;
    }
    
    public String cuantosPasajeros(int cu){
        String res= "No hay un avión con esas características";
       Avion aux= new Avion(cu);
        int pos=MAG.busSecOrd(aviones, numAvi, aux);
        
        if(pos!=-1){
            res="El avión puede trasportar hasta "+aviones[pos].getCapacidad()+" pasajeros";
        }
            
        return res;
    }
    
    public boolean actualizaHabitat(int cu, String habitat){
        boolean res= false;
        Pajaro aux= new Pajaro(cu);
        int pos= MAG.busSecOrd(pajaros, numPaja, aux);
        
        if(pos!=-1){
            pajaros[pos].setHabitat(habitat);
            res=true;
        }
        
        return res;
    }
    
    public String toString(){
        StringBuilder res= new StringBuilder();
        
        res.append("Número de pajaros: "+numPaja);
        for(int i=0;i<numPaja;i++){
            res.append("\n"+pajaros[i].toString());
        }
        res.append("\nNúmero de Aviones: "+numAvi);
        for(int i=0;i<numAvi;i++){
            res.append("\n"+aviones[i].toString());
        }
        
        
        return res.toString();
    }
}
