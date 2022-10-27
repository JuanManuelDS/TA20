package ex7;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import java.awt.event.InputMethodListener;
import java.awt.event.InputMethodEvent;
import javax.swing.event.CaretListener;
import javax.swing.event.CaretEvent;
import java.awt.Color;

public class Ejercicio7 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private boolean pesetas = false;

	public Ejercicio7() {
		setTitle("Calculadora cambio pesetas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 431, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		//------------BOTONES--------------------------------
		JButton btnNewButton = new JButton("Pesetas a euros");
		JButton btnNewButton_1 = new JButton("Cambiar");
		
		//-----------TEXTFIELDS------------------------------------
		textField = new JTextField();
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		
		//-----------LABELS--------------------------------
		JLabel lblNewLabel = new JLabel("Ingrese euros");
		textField.setColumns(10);
		JLabel lblNewLabel_1 = new JLabel("Pesetas");
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setForeground(new Color(255, 0, 0));
		
		//-------------BOTON EUROS A PESETAS Y VICEVERSA CLICK EVENT---------------
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!pesetas) {
					lblNewLabel.setText("Ingrese pesetas");
					lblNewLabel_1.setText("Euros");
					btnNewButton.setText("Euros a pesetas");
					textField.setText("");
					textField_1.setText("");
					pesetas = true;
				} else {
					lblNewLabel.setText("Ingrese Euros");
					lblNewLabel_1.setText("Pesetas");
					btnNewButton.setText("Pesetas a euros");
					textField.setText("");
					textField_1.setText("");
					pesetas = false;
				}
			}
		});
		
		//------ TEXTFIELD UPDATE EVENT----------------------------------
		textField.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent arg0) {
				DecimalFormat df = new DecimalFormat("0.00");
				try {
					double aCambiar = Double.parseDouble(textField.getText());
					lblNewLabel_2.setText("");
					if (!pesetas) {
						String resultado = df.format(aCambiar * 166.386);
						textField_1.setText(resultado + "");
					} else {
						String resultado = df.format(aCambiar / 166.386);
						textField_1.setText(resultado + "");
					}
				} catch (NullPointerException | NumberFormatException e) {
					System.out.println(textField.getText());
					lblNewLabel_2.setText("Debe ingresar 1 o más números obligatoriamente");
				}

				

			}
		});
		
		//------BOTÓN CAMBIAR CLICK EVENT --------------------------------------
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DecimalFormat df = new DecimalFormat("0.00");
				double aCambiar = Double.parseDouble(textField.getText());
				if (!pesetas) {
					String resultado = df.format(aCambiar * 166.386);
					textField_1.setText(resultado + "");
				} else {
					String resultado = df.format(aCambiar / 166.386);
					textField_1.setText(resultado + "");
				}
			}
		});
		
		//---------AGREGO COMPONENTES AL FRAME-------------------
		contentPane.add(lblNewLabel);	
		contentPane.add(textField);				
		contentPane.add(lblNewLabel_1);		
		contentPane.add(textField_1);
		contentPane.add(btnNewButton);
		contentPane.add(btnNewButton_1);
		contentPane.add(lblNewLabel_2);


		setVisible(true);
	}

}
