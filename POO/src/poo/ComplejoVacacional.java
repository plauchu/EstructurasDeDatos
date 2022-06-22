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
public class ComplejoVacacional {
    
    private String nom;
    private int numAlb;
    private int albs=0;
    private Rectangulo [] complejo;

    public ComplejoVacacional(String nom, int numAlb) {
        this.nom = nom;
        this.numAlb = numAlb;
        complejo= new Rectangulo[numAlb];
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNumAlb() {
        return numAlb;
    }

    public void setNumAlb(int numAlb) {
        this.numAlb = numAlb;
    }
    
    public boolean AltaAlberca (double altura, double base){
        boolean res= false;
        
        if(albs<numAlb){
            complejo[albs]= new Rectangulo (altura, base);
            albs++;
            res=true;
        }
        return res;
    }
    public double totalLona(){
        double res=0;
        
        if(albs!=0){
            for(int i=0;i<albs;i++){
                res+=complejo[i].calculaArea();
            }
        }
        
        return res;
    }
    
    public double totalCerca(){
        double res=0;
        
        if(albs!=0){
            for(int i=0;i<albs;i++){
                res+=complejo[i].calculaPerimetro();
            }
        }
        
        return res;
    }
    public String toString (){
        StringBuilder res = new StringBuilder();
        
        res.append("Complejo: "+nom);
        res.append("\nAlbercas: "+albs);
        for(int i=0;i<albs;i++){
            res.append("\nMedidas: "+complejo[i].toString());
        }
        return res.toString();
    }
    
    
    
}
