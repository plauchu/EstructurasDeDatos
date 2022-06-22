package primerparcialfebrero2019_g4;



/**
 * Clase para manejo de excepciones. se usará en las clases que
 * implementen colecciones.
 * @author Silvia Guardati 2011
 */
public class EmptyCollectionException extends RuntimeException{

    public EmptyCollectionException(){
        super("Colección vacía");
    }

    public EmptyCollectionException(String mensaje){
        super(mensaje);
    }

}
