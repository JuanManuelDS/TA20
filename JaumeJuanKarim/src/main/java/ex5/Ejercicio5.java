package ex5;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseWheelListener;
import java.awt.event.MouseWheelEvent;
import javax.swing.JTextArea;

public class Ejercicio5 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private boolean mouseMoved = false;

	public Ejercicio5() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		// -----------TEXTAREA & TEXTAREA EVENTS ----------------------------

		JTextArea textArea = new JTextArea();
		textArea.addMouseWheelListener(new MouseWheelListener() {
			public void mouseWheelMoved(MouseWheelEvent e) {
				String newText = textArea.getText() + "MouseWheelMoved \n";
				textArea.setText(newText);
			}
		});
		textArea.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				String newText = textArea.getText() + "MouseDragged \n";
				textArea.setText(newText);
			}

			@Override
			public void mouseMoved(MouseEvent e) {
				// Hago que este evento suceda solo una vez sino ocupa todo el textarea
				if (!mouseMoved) {
					String newText = textArea.getText() + "MouseMoved \n";
					textArea.setText(newText);
					mouseMoved = true;
				}

			}
		});
		textArea.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				String newText = textArea.getText() + "MouseClicked \n";
				textArea.setText(newText);
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				String newText = textArea.getText() + "MouseEntered \n";
				textArea.setText(newText);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				String newText = textArea.getText() + "MouseExited \n";
				textArea.setText(newText);
			}

			@Override
			public void mousePressed(MouseEvent e) {
				String newText = textArea.getText() + "MousePressed \n";
				textArea.setText(newText);
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				String newText = textArea.getText() + "MouseReleased \n";
				textArea.setText(newText);
			}
		});
		textArea.setBounds(10, 45, 414, 205);
		contentPane.add(textArea);

		// ---------------BOTÓN LIMPIAR--------------------------------
		JButton btnNewButton = new JButton("Limpiar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("");
			}
		});
		btnNewButton.setBounds(172, 11, 89, 23);
		contentPane.add(btnNewButton);

		setVisible(true);
	}
}
