
package primerparcialfebrero2019_g4;

public class DeProductos extends Camion{
    private boolean perecederos;
    private double totalTon;

    public DeProductos(String placas) {
        super(placas);
    }
   
    public DeProductos(boolean perecederos, double totalTon, String modelo, String numMotor, String placas, double costo, boolean disponible) {
        super(modelo, numMotor, placas, costo, disponible);
        this.perecederos = perecederos;
        this.totalTon = totalTon;
    }
    
    public boolean isPerecederos() {
        return perecederos;
    }

    public double getTotalTon() {
        return totalTon;
    }
    
    @Override
    public String toString() {
        StringBuilder cad = new StringBuilder();
        cad.append(super.toString());
        if (perecederos)
            cad.append("\nPuede transportar " + totalTon + " toneladas de productos perecederos\n");
        else
            cad.append("\nPuede transportar " + totalTon + " toneladas de productos no perecederos\n");
        return cad.toString();
    }
}
