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
public class PruebaComplejo {
    
    public static void main(String[] args) {
        
        ComplejoVacacional astur = new ComplejoVacacional("Asturiano",4);
        
        astur.AltaAlberca(10.0, 30.0);
        astur.AltaAlberca(11.0, 20.0);
        astur.AltaAlberca(12.0, 10.0);
        astur.AltaAlberca(13.0, 50.0);
        
        System.out.println("Información: "+astur.toString());
        System.out.println("\nLona necesaria: "+astur.totalLona()+" m");
        System.out.println("\nCerca necesaria: "+astur.totalCerca()+" m");
    }
    
}
