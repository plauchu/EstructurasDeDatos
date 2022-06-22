package primerparcialfebrero2019_g4;

/**
 * Interface para definirel comportamiento de una Pila.
 * @author SGUARDATB
 */
public interface PilaADT <T>{
    public T pop();
    public T peek();
    public boolean isEmpty();
    public void push(T dato);
    @Override
    public String toString();
}
