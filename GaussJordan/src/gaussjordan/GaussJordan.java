
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gaussjordan;

import java.util.Scanner;

/**
 *
 * @author MLIMONS
 */
public class GaussJordan {

    /**
     * @param args the command line arguments
     */
    //Solo para matrices cuadradas
    public static void main(String[] args) {
        Scanner lee = new Scanner (System.in);
        GJ gaussJordan;
        double [][] A; 
        double [] b;
        int n;
        
        do{
            System.out.println("Variables");
            n = lee.nextInt();
        }while(n<=0);
        
        A = new double [n][n];
        b = new double [n];
        
        for (int i =0; i < n; i++){
            System.out.println("Ecuación "+ (i+1));
            for (int j=0; j < n; j++){
                System.out.println("("+i + " , "+ j+")");
                A[i][j] = lee.nextDouble();
            }
            System.out.println(" = ");
            b[i]= lee.nextDouble();
        }

        System.out.println(imprimeA(A,n));
        System.out.println(imprimeB(b,n));
        gaussJordan= new GJ(A,b,n);
        if(gaussJordan.solve()){
            System.out.println(imprimeA(gaussJordan.getA(),n));
            System.out.println("Soulción: "+ imprimeB(gaussJordan.getB(),n));
        }else{
            System.out.println("FAIL !");
        }
    }
    
    public static String imprimeA(double [][] A, int n){
        StringBuilder a = new StringBuilder();
        
        a.append("A = \n {");
        for (int i =0; i<n; i++){
            for(int j =0; j<n; j++){
                a.append(A[i][j]).append(" ");
            }
            a.append("\n ");
        }
        a.deleteCharAt(a.length()-1);
        a.append("}");
        return a.toString();
    
    }
    
        public static String imprimeB(double []B, int n){
        StringBuilder b = new StringBuilder();
        
        b.append("b = {");
        for (int i =0; i<n; i++){
            b.append(B[i]).append(",");
        }
        b.deleteCharAt(b.length()-1);
        b.append("}");
        return b.toString();
    }
        
}
