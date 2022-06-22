/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import java.util.ArrayList;

/**
 *
 * @author Plauchu
 */
public class Escuela {
    
    private String nombre;
    private String direccion;
    private int numAlum;
    private int alums=0;
    private Alumno [] alumnos;

    public Escuela(String nombre, String direccion, int numAlum) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.numAlum = numAlum;
        alumnos = new Alumno[numAlum];
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNumAlum() {
        return numAlum;
    }
    
    public boolean altaAlum(String nom){
        boolean res= false;
        
        if(alums<numAlum){
            alumnos[alums]= new Alumno(nom);
            alums++;
            res=true;
        }
        
        return res;
    }
    public boolean altaCali(int clave, double calif){
        boolean res;
        Alumno aux = new Alumno(clave);
        int i=0;
        
        while(i<alums && !alumnos[i].equals(aux)){
            i++;
        }
        if(i==alums){
            res=false;
        }
        else {
            alumnos[i].altaCalif(calif);
            res=true;
        }
        return res;
    }
    
    public String getDatosAlumno (int clave){
        StringBuilder res= new StringBuilder();
        Alumno aux = new Alumno(clave);
        int i=0;
        
        while(i<alums && !alumnos[i].equals(aux)){
            i++;
        }
        if(i==alums){
            res.append("Clave no encontrada");
        }
        else
            res.append(alumnos[i].toString());
        
        
        return res.toString();
    }
    
    public String nomYprom(){
        StringBuilder res = new StringBuilder();
        
        if(alums!=0){
            for(int i=0;i<alums;i++){
                res.append("\nNombre: "+alumnos[i].getNombreAlum()+"\nPromedio: "+alumnos[i].calculaPromedio());
            }
        }
        else
            res.append("No puedo hacer eso ahora");
        
        return res.toString();
    }
    
    public String mejorAlumno(){
        String res = null;
        int maxApro=0;
        
        if(alums!=0){
            for(int i=0;i<alums;i++){
                if(alumnos[i].getTotalCalif()>maxApro){
                    res=alumnos[i].getNombreAlum();
                }
            }
        }
        else 
            res="No hay alumnos";
        
        return res;
    }
    public ArrayList<String> mejoresAlumnos(){
        ArrayList<String> lista = new ArrayList<String>();
        int maxApro=0;
        
        if(alums!=0){
            for(int i=0;i<alums;i++){
                if(alumnos[i].getTotalCalif()>=maxApro){
                    lista.add(alumnos[i].getNombreAlum());
                }
            }
        }
        
        return lista;
    }
    
    public String toString (){
        StringBuilder res= new StringBuilder();
        
        res.append("Escuela: "+nombre);
        res.append("\nDirección: "+direccion);
        res.append("\nAlumnos: "+alums);
        for(int i=0;i<alums;i++){
            res.append("\n"+alumnos[i].toString());
        }
        
        return res.toString();
    }
   
    
    
}
