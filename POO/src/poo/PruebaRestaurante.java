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
public class PruebaRestaurante {
    
    public static void main(String[] args) {
        
        Restaurante canarios = new Restaurante("Canarios",4);
        
        canarios.altaMesa(5);
        canarios.altaMesa(5);
        canarios.altaMesa(5);
        canarios.altaMesa(5);
        
        System.out.println(canarios.toString());
        System.out.println("Total tela: "+canarios.totalTela()+" m");
        System.out.println("Total puntilla : "+canarios.totalPuntilla()+" m");
    }
    
}
