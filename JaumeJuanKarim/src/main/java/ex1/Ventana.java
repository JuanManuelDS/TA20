package ex1;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JSpinner;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class Ventana extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Ejercicio 1");
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTamano = new JLabel("New label");
		lblTamano.setBounds(10, 135, 70, 20);
		contentPane.add(lblTamano);
		
		JSpinner spinner = new JSpinner();
		// Indicamos el valor de la fuente actual del JLabel
		spinner.setValue(11);
		spinner.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				// Siempre que haya un cambio en el valor del Spinner, lo guardamos
				int v = Integer.parseInt(spinner.getValue().toString());
				
				// Seteamos una nueva fuente con los mismos valores bases, salvo el tamaño de la fuente
				lblTamano.setFont(new Font("Tahoma", Font.BOLD, v));
				// También aumentamos el tamaño de los límites del JLabel 
				lblTamano.setBounds(10, 135, 70+(v*5), 20+(v*2));
			}
		});
		spinner.setBounds(10, 11, 46, 20);
		contentPane.add(spinner);
		
		// Minimizar
		this.setExtendedState(JFrame.ICONIFIED);
		
		//Maximizar
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		// Hacemos visible la interfaz gráfica
		this.setVisible(true);
		
		
	}
	
	
}
