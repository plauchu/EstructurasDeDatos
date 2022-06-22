package primerparcialfebrero2019_g4;

/**
 * Clase Pila que implementa la interface PilaADT. Es genérica.
 * El pop y el peek, en caso de que la pila esté vacía, lanzan una excepción
 * del tipo EmptyCollectionException definida para tal fin.
 * @author SGUARDATB
 */
public class Pila <T> implements PilaADT <T>{
    private T colec[];
    private int tope;
    private final int MAX = 10;

    public Pila() {
        colec = (T[]) (new Object[MAX]);
        tope = -1;
    }

    public boolean isEmpty() {
        return tope == -1;
    }

    public T peek() {
        if (isEmpty())
            throw new EmptyCollectionException("Pila Vacía");
        else
            return colec[tope];
    }

    public T pop() {
        if (isEmpty())
            throw new EmptyCollectionException("Pila Vacía");
        else{
            T dato = colec[tope];
            tope--;
            return dato;
        }
    }

    public void push(T dato) {
        if (colec.length == tope + 1)
            expandCapacity();
        tope++;
        colec[tope] = dato;
    }

    private void expandCapacity(){
        T nuevo[] = (T[]) (new Object[colec.length * 2]);
        int i;

        for (i = 0; i <= tope; i++)
            nuevo[i] = colec[i];
        colec = nuevo;
    }
    
    public String toString(){
        StringBuilder res = new StringBuilder();
        for (int i = tope; i >= 0; i--)
            res.append(colec[i] + "\n");
        return res.toString();
    }
}
