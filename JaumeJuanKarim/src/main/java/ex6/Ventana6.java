package ex6;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Ventana6 extends JFrame {

	private JPanel contentPane;
	private JTextField peso;
	private JTextField altura;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana6 frame = new Ventana6();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ventana6() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		peso = new JTextField();
		peso.setBounds(101, 10, 96, 19);
		contentPane.add(peso);
		peso.setColumns(10);
		
		altura = new JTextField();
		altura.setBounds(270, 10, 96, 19);
		contentPane.add(altura);
		altura.setColumns(10);
		

		final JLabel lblNewLabel = new JLabel(" ");
		lblNewLabel.setBounds(228, 65, 45, 13);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Calcula IMC");
		btnNewButton.setBounds(48, 61, 85, 21);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				double kilos = Double.parseDouble(peso.getText());
	            double metros    = Double.parseDouble(altura.getText());
	            double    bmi       = (kilos/(metros*metros));
				lblNewLabel.setText("IMC: "+Double.toString(bmi));
				} catch (NullPointerException | NumberFormatException ex6) {
                    System.out.println("Inserte un valor correcto");
                }
			}
		});
		contentPane.add(btnNewButton);
		
		lblNewLabel_1 = new JLabel("Peso: ");
		lblNewLabel_1.setBounds(26, 13, 45, 13);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Altura: ");
		lblNewLabel_2.setBounds(215, 13, 45, 13);
		contentPane.add(lblNewLabel_2);
		
	
	}
}
