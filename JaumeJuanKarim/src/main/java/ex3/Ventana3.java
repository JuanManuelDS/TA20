package ex3;

import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Ventana3 extends JFrame {

	private JPanel contentPane;
    private int valor,valor2;

	/**
	 * Create the frame.
	 */
	public Ventana3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		// -------------------JLABELS-------------------------------
		final JLabel lblNewLabel_1 = new JLabel("Boton 1: 0");
		contentPane.add(lblNewLabel_1);
		final JLabel lblNewLabel = new JLabel("Boton 2: 0");
		contentPane.add(lblNewLabel);
		
		// -------------------JBUTTONS-------------------------------
		JButton btnNewButton = new JButton("Boton 1 ");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Sumar y mostrar el contador de las veces que sea pulsado del Botón 1
				valor++;
				lblNewLabel_1.setText("Boton 1: "+Integer.toString(valor));
			}
		});
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Boton 2");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Sumar y mostrar el contador de las veces que sea pulsado del Botón 2
				valor2++;
				lblNewLabel.setText("Boton 2: "+Integer.toString(valor2));
			}
		});
		contentPane.add(btnNewButton_1);
		
		setVisible(true);
		
	}
}
