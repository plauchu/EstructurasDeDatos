/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gaussjordan;

/**
 *
 * @author MLIMONS
 */
public class Prueba {
    
    public static void main(String[] args) {
        double A[][] = {{3,-2,4},{9,1,-2},{5,-3,6}};
        double b[] = {1,3,8};
        int n = A[0].length;
        System.out.println(imprimeA(A,n));
        System.out.println(imprimeB(b,n));
        
        /* PRUEBA SWAP
        swap(A,b,n,0,1);
        System.out.println(imprimeA(A,n));
        System.out.println(imprimeB(b,n));*/

        /*PRUEBA ENTRY
        System.out.println("Entrada: "+entry(A,n,0));
        */
        
        /*PRUEBA DIVIDE / CTE
        divide(A,b,n,0,0);
        System.out.println(imprimeA(A,n));
        System.out.println(imprimeB(b,n));
        */
        
        /*PRUEBA REDUCE ROW
        divide(A,b,n,0,0);
        System.out.println(imprimeA(A,n));
        System.out.println(imprimeB(b,n));
        reduceRow(A,b,n,1,0,0);
        System.out.println(imprimeA(A,n));
        System.out.println(imprimeB(b,n));
        */
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
        
    public static void swap(double[][] A, double[] b, int n,int i, int ii){
        double aux;
        aux= b[i];
        b[i]= b[ii];
        b[ii]=aux;
   
        for(int j =0; j< n; j++){
            aux= A[i][j];
            A[i][j]= A[ii][j];
            A[ii][j]= aux;
        }
    }
    
    public static int entry(double [][] A, int n,int j){
        int i=0;
        
        while(i<n && A[i][j]==0) i++;
   
        if(i==n)
            i=-1;
        
        
        return i;
    }  
    
    public static void divide(double [][] A, double [] b,int n,int i,int j){
        double aux = A[i][j];
        
        b[i] = b[i]/aux;
        
        for(int jj=j; jj < n; jj++){
            A[i][jj] = A[i][jj]/aux;
        }
    }
    
    public static void reduceRow(double [][]A, double []b, int n, int i, int j, int iii){
        double aux;
        
        for(int ii=i; ii<n ; ii++){
            aux= A[ii][j];
            b[ii] = (aux*b[iii])-b[ii];
            for(int jj=j; jj<n; jj++){
                A[ii][jj]= (aux*A[iii][jj])-A[ii][jj];
            }
        }
    }
}
