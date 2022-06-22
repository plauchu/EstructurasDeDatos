import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import java.awt.GridLayout;
import javax.swing.*;

/*
 * Rodrigo
 * Dec2018
 * Vista
 */
public class vista extends JFrame{
	
	protected JPanel miPanel;
	protected Border miBorde;
	protected JLabel lbNom, lbLetra;
	protected JTextField tfNom,tfLetra, tfRes;
	protected JButton btAceptar;
	
	public vista() {
		super("Procesa Archivo");
		
		miPanel= new JPanel();
		miPanel.setLayout(new GridLayout(3,3));
		miBorde= BorderFactory.createEmptyBorder(10, 10, 10, 10);
		miPanel.setBorder(miBorde);
	
		lbNom= new JLabel("Nombre del archivo");
		miPanel.add(lbNom);
		tfNom= new JTextField();
		miPanel.add(tfNom);
		lbLetra= new JLabel("Letra");
		miPanel.add(lbLetra);
		tfLetra= new JTextField();
		miPanel.add(tfLetra);
		btAceptar= new JButton("Aceptar");
		miPanel.add(btAceptar);
		tfRes= new JTextField();
		miPanel.add(tfRes);
		
		this.add(miPanel);
		
		this.setBounds(50,50,400,400);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		
		
	}
	/*public static void main(String[] args) {
		vista inter= new vista();

	}
	*/
	
	

}
