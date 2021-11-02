package ViewCameriere;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JComboBox;
import model.Listino;
import controllerCameriere.ControllerCameriere;
import javax.swing.JTextArea;
import java.awt.event.ActionEvent;

public class ViewCameriere {

	public JFrame frame;
	private JComboBox comboBoxOrdini;
	private JButton Ordina;
	private JTextArea textServito;
	private JButton btnNewAggiorna;
	private JComboBox comboBoxDaServire;
	private JButton btnNewServito;
	private JTextField textComande;
	private JTextField textTotale;

	public void registraController(ControllerCameriere controller) {
		comboBoxOrdini.addActionListener(controller);
		Ordina.addActionListener(controller);
		comboBoxDaServire.addActionListener(controller);
		btnNewServito.addActionListener(controller);
		btnNewAggiorna.addActionListener(controller);
		textComande.addActionListener(controller);
		textTotale.addActionListener(controller);
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
		Ordina.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// JOptionPane.showMessageDialog(null, "ORDINATO");
			}
		});
		Ordina.setBackground(Color.LIGHT_GRAY);
		Ordina.setBounds(226, 90, 85, 21);
		frame.getContentPane().add(Ordina);

		JLabel lblNewLabel = new JLabel("GOORILLA");
		lblNewLabel.setFont(new Font("Stencil", Font.PLAIN, 25));
		lblNewLabel.setForeground(Color.DARK_GRAY);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(114, 27, 123, 38);
		frame.getContentPane().add(lblNewLabel);

		comboBoxOrdini = new JComboBox();
		comboBoxOrdini.setBounds(57, 85, 158, 31);
		frame.getContentPane().add(comboBoxOrdini);
		Listino Gin_Lemon = new Listino("Gin_Lemon     ", (float) 7.00, 0, 1);
		Listino Cuba_Libre = new Listino("Cuba_Libre     ", (float) 8.00, 0, 2);
		Listino Spritz_Campari = new Listino("Spritz_Campari     ", (float) 5.00, 0, 3);
		Listino Malibu_Cola = new Listino("Malibu_Cola     ", (float) 7.00, 0, 4);
		Listino Mojito = new Listino("Mojito     ", (float) 7.00, 0, 5);
		Listino Prosecco = new Listino("Prosecco     ", (float) 7.00, 0, 6);
		comboBoxOrdini.addItem(Gin_Lemon);
		comboBoxOrdini.addItem(Cuba_Libre);
		comboBoxOrdini.addItem(Spritz_Campari);
		comboBoxOrdini.addItem(Malibu_Cola);
		comboBoxOrdini.addItem(Mojito);
		comboBoxOrdini.addItem(Prosecco);

		textServito = new JTextArea();
		textServito.setFont(new Font("Modern No. 20", Font.PLAIN, 13));
		textServito.setBounds(26, 171, 130, 121);
		frame.getContentPane().add(textServito);

		comboBoxDaServire = new JComboBox();
		comboBoxDaServire.setBounds(168, 188, 158, 31);
		frame.getContentPane().add(comboBoxDaServire);

		btnNewAggiorna = new JButton("AGGIORNA");
		btnNewAggiorna.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewAggiorna.setBounds(241, 329, 102, 21);

		frame.getContentPane().add(btnNewAggiorna);

		btnNewServito = new JButton("SERVITO");
		btnNewServito.setBounds(204, 229, 85, 21);
		frame.getContentPane().add(btnNewServito);

		textComande = new JTextField();
		textComande.setFont(new Font("Times New Roman", Font.BOLD, 10));
		textComande.setText("TOT. 0");
		textComande.setBackground(Color.LIGHT_GRAY);
		textComande.setEditable(false);
		textComande.setBounds(8, 10, 48, 19);
		frame.getContentPane().add(textComande);
		textComande.setColumns(10);

		textTotale = new JTextField();
		textTotale.setText("TOTALE \u20AC 0.00");
		textTotale.setFont(new Font("Times New Roman", Font.BOLD, 10));
		textTotale.setEditable(false);
		textTotale.setBackground(Color.LIGHT_GRAY);
		textTotale.setBounds(247, 9, 79, 20);
		frame.getContentPane().add(textTotale);
		textTotale.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Cameriere");
		lblNewLabel_1.setFont(new Font("Source Serif Pro Black", Font.ITALIC, 12));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setBounds(8, 329, 85, 21);
		frame.getContentPane().add(lblNewLabel_1);
	}

	public JComboBox getComboBoxOrdini() {
		return comboBoxOrdini;
	}

	public JButton getBtnNewAggiorna() {
		return btnNewAggiorna;
	}

	public void setBtnNewAggiorna(JButton btnNewAggiorna) {
		this.btnNewAggiorna = btnNewAggiorna;
	}

	public JComboBox getComboBoxDaServire() {
		return comboBoxDaServire;
	}

	public void setComboBoxDaServire(JComboBox comboBoxDaServire) {
		this.comboBoxDaServire = comboBoxDaServire;
	}

	public JButton getBtnNewServito() {
		return btnNewServito;
	}

	public JTextField getTextTotale() {
		return textTotale;
	}

	public void setTextTotale(JTextField textTotale) {
		this.textTotale = textTotale;
	}

	public void setBtnNewServito(JButton btnNewServito) {
		this.btnNewServito = btnNewServito;
	}

	public void setComboBoxOrdini(JComboBox comboBoxOrdini) {
		this.comboBoxOrdini = comboBoxOrdini;
	}

	public JTextArea getTextServito() {
		return textServito;
	}

	public void setTextServito(JTextArea textServito) {
		this.textServito = textServito;
	}

	public JTextField getTextComande() {
		return textComande;
	}

	public void setTextComande(JTextField textComande) {
		this.textComande = textComande;
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
		return textServito;
	}

	public void setTextOrdini(JTextArea textOrdini) {
		this.textServito = textOrdini;
	}
}
