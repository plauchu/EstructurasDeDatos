
package primerparcialfebrero2019_g4;

public class Turismo extends DePasajeros{
    private boolean asientoCama;
    private boolean serviBar;

    public Turismo(String placas) {
        super(placas);
    }

    public Turismo(boolean asientoCama, boolean serviBar, String modelo, String numMotor, String placas, double costo, boolean disponible, int tP) {
        super(modelo, numMotor, placas, costo, disponible, tP);
        this.asientoCama = asientoCama;
        this.serviBar = serviBar;
    }
    
    public boolean isServiBar() {
        return serviBar;
    }

    public boolean isAsientoCama() {
        return asientoCama;
    }

    public void setServiBar(boolean serviBar) {
        this.serviBar = serviBar;
    }
    
    public String toString() {
        StringBuilder cad = new StringBuilder("\nCamión de turismo\n");
        cad.append(super.toString());
        if (asientoCama)
            cad.append("\nTiene asiento-cama");
        if (serviBar)
            cad.append("nTiene servicio de bar");
        return cad.toString();
    }
    
}
