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
public class Alumno {
    
    private static int serie=100;
    private int claveUnica;
    private String nombreAlum;
    private double [] calificaciones;
    private int totalCalif=0;

    public Alumno() {
        calificaciones = new double[12];
        claveUnica=serie;
        serie++;
    }

    public Alumno(String nombreAlum) {
        this();
        this.nombreAlum = nombreAlum;
    }
    public Alumno(int claveUnica) {
        this.claveUnica=claveUnica;
    }

    public int getTotalCalif() {
        return totalCalif;
    }
    
    
    
    public boolean altaCalif(double calif){
        boolean res=false;
        
        if(totalCalif<calificaciones.length && calif>=6){
            calificaciones[totalCalif]= calif;
            totalCalif++;
            res=true;
        }
        
        return res;
    }

    public String getNombreAlum() {
        return nombreAlum;
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
        final Alumno other = (Alumno) obj;
        if (this.claveUnica != other.claveUnica) {
            return false;
        }
        return true;
    }
    
    public String toString (){
        StringBuilder res= new StringBuilder();
        
        res.append("Nombre: "+nombreAlum);
        res.append("\nClave: "+claveUnica);
        res.append("\nCalificaciones aprobadas "+totalCalif);
        for(int i=0;i<totalCalif;i++){
            res.append("\n: "+calificaciones[i]);
        }
        
        return res.toString();
    }
    
    public double calculaPromedio (){
        double res=0;
        
        if(totalCalif!=0){
            for(int i=0;i<totalCalif;i++){
                res+=calificaciones[i];
            }
            res=res/totalCalif;
        }
        
        return res;
    }
    
    
    
    
    
    
}
