
package primerparcialfebrero2019_g4;

/**
 * <pre>
 * Esta es la clase camión que representa
 * un camión en general.
 * @author Silvia
 */
public abstract class Camion { 
    private String modelo;
    private String numMotor;
    private String placas;
    private double costo;
    private boolean terminado; //Ya se terminó su fabricación
    
    public Camion(String placas) {
        this.placas = placas;
    }

    public Camion(String modelo, String numMotor, String placas, double costo, boolean terminado) {
        this.modelo = modelo;
        this.numMotor = numMotor;
        this.placas = placas;
        this.costo = costo;
        this.terminado = terminado;
    }

    public String getModelo() {
        return modelo;
    }

    public double getCosto() {
        return costo;
    }

    public boolean isTerminado() {
        return terminado;
    }    
   
    @Override
    public String toString() {
        return "\nModelo: " + modelo + ", Num. de motor: " + numMotor + ", placas: " + placas;
    }
    
    @Override
    public boolean equals(Object obj) {
        boolean resp;
        
        resp = false;
        if (obj != null && this.getClass().equals(obj.getClass()))
            resp = this.placas.equals(((Camion)obj).placas);         
        return resp;
    }
}
