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
public class AplicacionGeometrica {
    
    private FiguraGeometrica [] figuras;
    private int numFig=0;

    public AplicacionGeometrica() {
        figuras= new FiguraGeometrica[10];
    }
    
    public boolean altaTriangulo(double base, double altura, double lado, String tipo){
        boolean res=false;
        
        if(numFig<figuras.length){
            figuras[numFig]= new Triangulo(base,altura,lado,tipo);
            res=true;
            numFig++;
        }
        
        return res;
    }
    
    public boolean altaCirculo(double radio){
        boolean res=false;
        
        if(numFig<figuras.length){
            figuras[numFig]= new Circulo(radio);
            res=true;
            numFig++;
        }
        
        return res;
    }
    
    public boolean altaCuadrilatero(double base, double altura){
        boolean res=false;
        
        if(numFig<figuras.length){
            figuras[numFig]= new Rectangulo(base,altura);
            res=true;
            numFig++;
        }
        
        return res;
    }
    
     public boolean altaCuadrilatero(double lado){
        boolean res=false;
        
        if(numFig<figuras.length){
            figuras[numFig]= new Cuadrado(lado);
            res=true;
            numFig++;
        }
        
        return res;
    }
    
    public double areaFiguras(){
        double res=0;
        
        if(numFig!=0){
            for(int i=0;i<numFig;i++){
                res+=figuras[i].calculaArea();
            } 
        }
 
        return res;
    }
    
    public String datosCircGrand(){
        String res = "No hay figuras dadas de alta";
        int i,pos = 0;
        double max=0,aux;
        
        if(numFig!=0){
            for(i=0;i<numFig;i++){
                if(figuras[i] instanceof Circulo){
                    aux=((Circulo)figuras[i]).getRadio();
                    if(aux>max){
                        max=aux;
                        pos=i;
                    }
                }
            
            }
            if(max==0){
                res="No hay círculos";
            }
            else
                res=figuras[pos].toString();
        }
        
        return res;
    }
    
    public int totCuadrados(){
        int res=0;
        
        if(numFig!=0){
            for(int i=0;i<numFig;i++){
                if(figuras[i] instanceof Cuadrado){
                    res++;
                }
            }
        }
        
        return res;
    }
    
    public boolean eliminaTrianEquila(){
        boolean res= false;
        String tipo;
        
        if(numFig!=0){
            for(int i=0;i<numFig;i++){
                if(figuras[i] instanceof Triangulo){
                    tipo=((Triangulo)figuras[i]).getTipo();
                    if(tipo.equalsIgnoreCase("Equilátero")){
                        MAG.corrimientoIzq(figuras, numFig, i);
                        numFig--;
                        figuras[numFig]=null;
                        res=true;
                    }
                }
            }
        }
        
        return res;
    }
    
    public String toString(){
        StringBuilder res= new StringBuilder();
        
        for(int i=0;i<numFig;i++){
            res.append("\n"+figuras[i].toString());
        }

        return res.toString();
    }
    
}
