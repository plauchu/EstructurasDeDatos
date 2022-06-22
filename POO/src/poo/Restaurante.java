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
public class Restaurante {
    
    private String nom;
    private int numMesas;
    private int mesitas=0;
    private Cuadrado[] mesas;

    public Restaurante(String nom, int numMesas) {
        this.nom = nom;
        this.numMesas = numMesas;
        mesas= new Cuadrado[numMesas];
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNumMesas() {
        return numMesas;
    }

    public void setNumMesas(int numMesas) {
        this.numMesas = numMesas;
    }
    
    public boolean altaMesa(double lado){
        boolean res= false;
        
        if(mesitas<numMesas){
            mesas[mesitas]= new Cuadrado(lado);
            mesitas++;
            res=true;
        }
        return res;
    }
    
    public double totalTela(){
        double res=0;
        
        if(mesitas!=0){
            for(int i=0;i<mesitas;i++){
                res+=mesas[i].calculaArea();
            }
        }
            
        return res;    
    }
    
    public double totalPuntilla(){
        double res=0;
        
        if(mesitas!=0){
            for(int i=0;i<mesitas;i++){
                res+=mesas[i].calculaPerimetro();
            }
        }
            
        return res;    
    }
    
    public String toString(){
        StringBuilder res= new StringBuilder();
        
        res.append("Restaurante: "+nom);
        res.append("\nMesas: "+mesitas);
        for(int i=0;i<mesitas;i++){
            res.append("\nMedidas: "+mesas[i].toString());
        }
        
        return res.toString();
    }
    
}


