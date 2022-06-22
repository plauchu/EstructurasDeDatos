import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/*
 * Rodrigo
 * Dec2018
 * Vista
 */
public class Controlador extends vista{
	
	public Controlador() {
		super ();
		btAceptar.addActionListener(new Escuchador());
	}
	
	public class Escuchador implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			File dato= new File(tfNom.getText());
			String linea;
			String res = "";
			try(Scanner lec= new Scanner(dato)){
				while(lec.hasNextLine()) {
					linea= lec.next();
					if(linea.charAt(0)==tfLetra.getText().charAt(0) || linea.charAt(linea.length()-1)==tfLetra.getText().charAt(0)) {
						tfRes.setText(res+=linea);
					}
					
				}
				lec.close();
				
			} catch (FileNotFoundException fnfe) {
				System.err.println("Mal"+fnfe);
				System.exit(-1);
			}
			
		}
		
	}

	public static void main(String[] args) {
		Controlador inter= new Controlador();

	}

}
