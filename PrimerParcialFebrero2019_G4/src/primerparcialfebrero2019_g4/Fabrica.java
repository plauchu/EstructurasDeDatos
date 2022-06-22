package primerparcialfebrero2019_g4;

/**
 * Clase principal.
 *
 * @author RodrigoPlauchú
 * @version 1.0
 */
public class Fabrica {

    private String nombre;
    private Camion[] inventario;
    private int tC;

    public Fabrica() {
        inventario = new Camion[10];
        tC = 0;
    }

    public Fabrica(String nombre) {
        this();
        this.nombre = nombre;
    }

    public boolean alta(boolean asientoCama, boolean serviBar, String modelo, String numMotor, String placas, double costo, boolean disponible, int tP) {
        boolean res = false;
        if (tC < inventario.length) {
            inventario[tC] = new Turismo(asientoCama, serviBar, modelo, numMotor, placas, costo, disponible, tP);
            tC++;
            res = true;
        }
        return res;
    }

    public boolean alta(boolean perecederos, double totalTon, String modelo, String numMotor, String placas, double costo, boolean disponible) {
        boolean res = false;
        if (tC < inventario.length) {
            inventario[tC] = new DeProductos(perecederos, totalTon, modelo, numMotor, placas, costo, disponible);
            tC++;
            res = true;
        }
        return res;
    }

    // EJERCICIO 2
    public boolean determinaExistenciaCamionesPerecederos(double cantToneladas) {
        boolean res = false;
        int i = 0;

        if (tC != 0) {
            while (i < tC && !res) {
                if (inventario[i] instanceof DeProductos) {
                    if (((DeProductos) inventario[i]).isPerecederos() && ((DeProductos) inventario[i]).isTerminado() && ((DeProductos) inventario[i]).getTotalTon() >= cantToneladas) {
                        res = true;
                    }
                }
                i++;
            }
        }

        return res;
    }

}
