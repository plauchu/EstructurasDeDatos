/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractos;

import java.util.ArrayList;

/**
 *
 * @author Plauchu
 */
public class Empresa {
    
    private String nombreEmpresa;
    private String direccion;
    private String nombreDueño;
    private Administrativo [] admin;
    private int numAdmin=0;
    private Operario [] oper;
    private int numOper=0;
    private int totEmpleados=0;

    public Empresa(String nombreEmpresa, String direccion, String nombreDueño) {
        this.nombreEmpresa = nombreEmpresa;
        this.direccion = direccion;
        this.nombreDueño = nombreDueño;
        admin= new Administrativo[30];
        oper= new Operario[20];
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombreDueño() {
        return nombreDueño;
    }

    public void setNombreDueño(String nombreDueño) {
        this.nombreDueño = nombreDueño;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public int getTotEmpleados() {
        return totEmpleados;
    }
    
    public boolean altaAdministrativo(String departamento, String telefono, String nombreEmpleado, double sueldoBase){
        boolean res=false;
        
        if(numAdmin<admin.length){
            admin[numAdmin]= new Administrativo(departamento,telefono, nombreEmpleado, sueldoBase);
            res=true;
            numAdmin++;
            totEmpleados++;
        }
        
        return res;
    }
    
    public boolean altaOperario(int horasExtras, String nombreEmpleado, double sueldoBase){
        boolean res=false;
        
        if(numOper<oper.length){
            oper[numOper]= new Operario(horasExtras,nombreEmpleado,sueldoBase);
            res=true;
            numOper++;
            totEmpleados++;
        }
        
        return res;
    }
    
    public String nomYsueldoAdmin(){
        StringBuilder res= new StringBuilder();
        
        if(numAdmin!=0){
            for(int i=0;i<numAdmin;i++){
                res.append("\nNombre: "+admin[i].getNombreEmpleado()+" \nSueldo base: "+admin[i].getSueldoBase());
            }
        }
        else
            res.append("La empresa no tiene empleados administrativos");
        
        return res.toString();
    }
    
    public boolean actualizaSueldoAdmin(int clave, double porcentaje){
        boolean res=false;
        Administrativo aux= new Administrativo(clave);
        int i=0;
        
        if(numAdmin!=0){ 
            while(i<numAdmin && admin[i].getClaveEmpleado()!=clave){
                i++;
            }
            if(i==numAdmin){
                res=false;
            }
            else {
                res=true;
                admin[i].setSueldoBase(admin[i].getSueldoBase()*porcentaje);
            }
                
        }

        return res;
    }
    
    public boolean cambioDeptoAdmin(int clave, String depto){
        boolean res=false;
        Administrativo aux= new Administrativo(clave);
        int i=0;
        
        if(numAdmin!=0){ 
            while(i<numAdmin && admin[i].getClaveEmpleado()!=clave){
                i++;
            }
            if(i==numAdmin){
                res=false;
            }
            else {
                res=true;
                admin[i].setDepartamento(depto);
            }
                
        }

        return res;
    }
    
    public double datosOperario(int clave, double prestac, double deduc, double precioHE){
        double res=0;
        Operario aux= new Operario(clave);
        int i=0;
        
        if(numOper!=0){ 
            while(i<numOper && oper[i].getClaveEmpleado()!=clave)
                i++;
            if(i==numOper){
                res=-1;
            }
            else {
                res=oper[i].calculaSalario(prestac, deduc, precioHE);
                
            }
        }
        return res;
    
    }
    
    public ArrayList<String> reporteSueldoMenorA(double parametro){
        ArrayList<String> lista= new ArrayList();
        int cantOper=0;
        
        if(numOper!=0){
            for(int i=0;i<numOper;i++){
                if(oper[i].getSueldoBase()<parametro){
                    lista.add(oper[i].getNombreEmpleado());
                    cantOper++;
                }
            }
            lista.add("Cantidad de Operarios que cumplen esta condición: "+cantOper);
        }
            
        
        return lista;
    }
    
    public String toString(){
        StringBuilder res= new StringBuilder();
        
        res.append("Empresa: "+nombreEmpresa);
        res.append("\nDirección: "+direccion);
        res.append("\nDueño: "+nombreDueño);
        res.append("\nTotal de Empleados: "+totEmpleados);
        res.append("\nAdministrativos:");
        for(int i=0;i<numAdmin;i++){
            res.append("\n"+admin[i].toString());
        }
        res.append("\nOperarios:");
        for(int i=0;i<numOper;i++){
            res.append("\n"+oper[i].toString());
        }
        
        return res.toString();
    }
}
