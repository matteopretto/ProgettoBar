package ViewCameriere;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JComboBox;
import model.Listino;
import controllerCameriere.ControllerCameriere;
import javax.swing.JTextArea;



public class ViewCameriere {

	public JFrame frame;
	private JComboBox comboBoxOrdini;
	private JButton Ordina;
	private JTextArea textOrdini;
	
	
	public void registraController(ControllerCameriere controller) {
		comboBoxOrdini.addActionListener(controller);
		Ordina.addActionListener(controller);
	}

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the application.
	 */
	public ViewCameriere() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(204, 153, 204));
		frame.setBounds(100, 100, 361, 397);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		 Ordina = new JButton("ORDINA");
		Ordina.setBackground(Color.LIGHT_GRAY);
		Ordina.setBounds(124, 289, 85, 21);
		frame.getContentPane().add(Ordina);
		
		JLabel lblNewLabel = new JLabel("GOORILLA");
		lblNewLabel.setFont(new Font("Stencil", Font.PLAIN, 25));
		lblNewLabel.setForeground(Color.DARK_GRAY);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(114, 27, 123, 38);
		frame.getContentPane().add(lblNewLabel);
		
	 comboBoxOrdini = new JComboBox();
		comboBoxOrdini.setBounds(107, 85, 130, 31);
		frame.getContentPane().add(comboBoxOrdini);
		comboBoxOrdini.addItem(Listino.Campari);
		comboBoxOrdini.addItem(Listino.Cuba_Libre);
		comboBoxOrdini.addItem(Listino.Gin_Lemon);
		comboBoxOrdini.addItem(Listino.Malibu_Cola);
		comboBoxOrdini.addItem(Listino.Mojito);
		comboBoxOrdini.addItem(Listino.Prosecco);
		
		 textOrdini = new JTextArea();
		textOrdini.setBounds(114, 141, 123, 120);
		frame.getContentPane().add(textOrdini);
	}

	public JComboBox getComboBoxOrdini() {
		return comboBoxOrdini;
	}

	public void setComboBoxOrdini(JComboBox comboBoxOrdini) {
		this.comboBoxOrdini = comboBoxOrdini;
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	public JButton getOrdina() {
		return Ordina;
	}

	public void setOrdina(JButton ordina) {
		Ordina = ordina;
	}

	public JTextArea getTextOrdini() {
		return textOrdini;
	}

	public void setTextOrdini(JTextArea textOrdini) {
		this.textOrdini = textOrdini;
	}
	
}