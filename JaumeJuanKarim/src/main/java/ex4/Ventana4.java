package ex4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;

public class Ventana4 extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public Ventana4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 352, 402);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// --------------JLABEL------------------
		JLabel lbl = new JLabel("Eventos");
		lbl.setBounds(10, 111, 53, 14);
		contentPane.add(lbl);
		
		// --------------JTEXTAREA------------------
		JTextArea textArea = new JTextArea();
		textArea.setBounds(66, 11, 260, 341);
		contentPane.add(textArea);
		
		// Hacemos visible la interfaz gráfica
		this.setVisible(true);
		
		// Seteamos el texto en el textArea
		textArea.setText("");
		
		addWindowListener(new WindowAdapter() {
			// Añadimos texto cuando se active la ventana
			@Override
			public void windowActivated(WindowEvent arg0) {
				textArea.setText(textArea.getText()+" \nVentana activada");
			}
			// Añadimos texto cuando se cierre la ventana
			@Override
			public void windowClosed(WindowEvent e) {
				textArea.setText(textArea.getText()+" \nVentana cerrada");
			}
			// Añadimos texto cuando se minimize la ventana
			@Override
			public void windowIconified(WindowEvent e) {
				textArea.setText(textArea.getText()+" \nVentana minimizada");
			}
			// Añadimos texto cuando se desminimize la ventana
			@Override
			public void windowDeiconified(WindowEvent e) {
				textArea.setText(textArea.getText()+" \nVentana desminimizada");
			}
			// Añadimos texto cuando se abra la ventana
			@Override
			public void windowOpened(WindowEvent e) {
				textArea.setText(textArea.getText()+" \nVentana abierta");
			}
		});
		
		addWindowStateListener(new WindowStateListener() {
			public void windowStateChanged(WindowEvent e) {
				// Añadimos texto cuando se maximize la ventana
				if(getExtendedState() == 6) {
					textArea.setText(textArea.getText()+" \nVentana maximizada");
				// Añadimos texto cuando se desmaximize la ventana
				}else if(getExtendedState() == 0) {
					textArea.setText(textArea.getText()+" \nVentana desmaximizada");
				}
			}
		});	
	}
}
