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
public class GJ {
    double [][] A;
    double [] b;
    int n;
    
    public GJ(double [][] A, double [] b, int n){
        this.A= A;
        this.b = b;
        this.n = n;
    }
    
    public double [][] getA(){
        return A;
    }
    
    public double [] getB(){
        return b;
    }
    
    public void set (double [][] A, double [] b, int n){
        this.A= A;
        this.b = b;
        this.n = n;
    }
    
    public void swap(int i, int ii){
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
    
    public int entry(int j){
        int i=0;
        
        while(i<n && A[i][j]==0)
            i++;
        
        
        if(i==n) i=-1;
        
        return i;
    }
    
    public void divide(int i,int j){
        double aux = A[i][j];

        b[i] = b[i]/aux;

        for(int jj=j; jj < n; jj++)
            A[i][jj] = A[i][jj]/aux;
        
    }
    
    public void reduceRow(int i, int j,int iii){
        double aux;
        
        for(int ii=i; ii<n ; ii++){
            aux= A[ii][j];
            b[ii] = (aux*b[iii])-b[ii];
            for(int jj=j; jj<n; jj++){
                A[ii][jj]= (aux*A[iii][jj])-A[ii][jj];
            }
        }
    }
    
    public boolean solve(){
        int faux;
        try{
            for(int r=0; r<n; r++){
                for(int c=0; c<n; c++){
                    faux=entry(c);
                    if(faux>=0){
                        if(faux!=c){
                            swap(c,faux);
                        }
                       
                       reduceRow(r+2,c,r);
                       reduceRow(r+1,c,r);
                       divide(r,c);
                    }else{
                        return false;
                    } 
                }
            }
            return true;
        }catch(Exception e){
            return false;
        }
    }
}
