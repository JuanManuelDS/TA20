package ex2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejercicio2 extends JFrame {

	private JPanel contentPane;

	public Ejercicio2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		
		// --------------LABEL--------------------------------------
		JLabel lblNewLabel = new JLabel("Presionaste el botón: ");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(110, 46, 276, 30);
		contentPane.add(lblNewLabel);

		
		// ---------------BOTONES---------------------------------
		JButton btnNewButton = new JButton("Botón 1");
		btnNewButton.setBounds(102, 88, 89, 23);
		contentPane.add(btnNewButton);

		JButton btnBotn = new JButton("Botón 2");
		btnBotn.setBounds(228, 88, 89, 23);
		contentPane.add(btnBotn);
		
		//--------------EVENTOS---------------------------------
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String newText = "Presionaste el botón: 1";
				lblNewLabel.setText(newText);
			}
		});
		
		btnBotn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String newText = "Presionaste el botón: 2";
				lblNewLabel.setText(newText);
			}
		});
		
		
		setVisible(true);
	}
}
