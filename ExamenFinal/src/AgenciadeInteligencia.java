import java.util.Scanner;

/*
 * Rodrigo
 * Dec2018
 * AgenciaDeInteligencia
 */
public class AgenciadeInteligencia {
	
	private String nombreAgencia;
	private String responsable;
	
	
	
	public AgenciadeInteligencia() {
		
	}

	public AgenciadeInteligencia(String nombreAgencia, String responsable) {

		this.nombreAgencia = nombreAgencia;
		this.responsable = responsable;
	}

	public String getNombreAgencia() {
		return nombreAgencia;
	}

	public void setNombreAgencia(String nombreAgencia) {
		this.nombreAgencia = nombreAgencia;
	}

	public String getResponsable() {
		return responsable;
	}

	public void setResponsable(String responsable) {
		this.responsable = responsable;
	}
	
	public String comprimir(String cadena) {
		String res ="";
		int cont=1;
		char aux;
		
		for(int i=0;i<cadena.length();i++) {
			aux=cadena.charAt(i);
			if(cadena.charAt(i)==aux) 
				cont++;
			res+=aux+""+cont;
				
		}
	
			
		return res;
	}
	

}
