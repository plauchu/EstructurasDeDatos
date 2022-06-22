/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosherencia;

import genericos.MAG;

/**
 *
 * @author Plauchu
 */
public class EmpresaMinera {
    
    private String nombreEmpresa;
    private Camion [] camion;
    private int totalCam=0;

    public EmpresaMinera() {
        camion= new Camion[10];
    }

    public EmpresaMinera(String nombreEmpresa) {
        this();
        this.nombreEmpresa = nombreEmpresa;
    }
    
    public boolean altaCamion(int totalPasaj, String marca, String numMotor, String placas){
        boolean res=false;
        
        if(totalCam<camion.length){
            camion[totalCam]= new DePasajeros(totalPasaj,marca,numMotor,placas);
            totalCam++;
            res=true;
        }
        
        return res;
    }
    public boolean altaCamion(double capacidadTon, String marca, String numMotor, String placas){
        boolean res=false;
        
        if(totalCam<camion.length){
            camion[totalCam]= new DeVolteo(capacidadTon,marca,numMotor,placas);
            totalCam++;
            res=true;
        }
        
        return res;
    }
    
    public String datosCamPas(){
        StringBuilder res= new StringBuilder();
        
        if(totalCam!=0){
            for(int i=0;i<totalCam;i++){
                if(camion[i] instanceof DePasajeros){
                    res.append(camion[i].toString());
                }
            }
        }
        else
            res.append("No hay camiones dados de alta");
        
        return res.toString();
    }
    
    public boolean actualizarCapVolt(String placas, int capacidad){
        boolean res= false;
        DeVolteo aux= new DeVolteo(placas);
        int pos= MAG.busquedaSecuencialDesordenada(camion, totalCam, aux);
        
        
        return res;
    }
    
}
