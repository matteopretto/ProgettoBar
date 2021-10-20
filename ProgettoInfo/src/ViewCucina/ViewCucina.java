package ViewCucina;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;

import controllerCameriere.ControllerCameriere;
import controllerCucina.ControllerCucina;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;

public class ViewCucina {

	public JFrame frame;
	private JButton btnPronto;
	private JButton btnAggiorna;
	private JButton btnInPreparazione;
	private JComboBox comboBoxOrdini;
	private JComboBox comboBoxPronto ;

	/**
	 * Launch the application.
	 */
	public void registraController(ControllerCucina controller) {
		btnPronto.addActionListener(controller);
		btnAggiorna.addActionListener(controller);
		btnInPreparazione.addActionListener(controller);
		comboBoxOrdini.addActionListener(controller);
		comboBoxPronto.addActionListener(controller);
	}

	/**
	 * Create the application.
	 */
	public ViewCucina() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(204, 153, 204));
		frame.getContentPane().setForeground(new Color(0, 0, 0));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		btnPronto = new JButton("PRONTO");
		btnPronto.setBackground(new Color(240, 240, 240));
		btnPronto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnPronto.setBounds(247, 205, 85, 21);
		frame.getContentPane().add(btnPronto);

		JLabel lblNewLabel = new JLabel("GOORILLA");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.DARK_GRAY);
		lblNewLabel.setFont(new Font("Stencil", Font.PLAIN, 25));
		lblNewLabel.setBounds(158, 39, 123, 38);
		frame.getContentPane().add(lblNewLabel);

		btnAggiorna = new JButton("AGGIORNA");
		btnAggiorna.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnAggiorna.setForeground(Color.BLACK);
		btnAggiorna.setBounds(0, 232, 99, 21);
		frame.getContentPane().add(btnAggiorna);
		
		btnInPreparazione = new JButton("PREPARA");
		btnInPreparazione.setBackground(new Color(240, 240, 240));
		btnInPreparazione.setForeground(Color.BLACK);
		btnInPreparazione.setBounds(127, 205, 85, 21);
		frame.getContentPane().add(btnInPreparazione);
		
		comboBoxOrdini = new JComboBox();
		comboBoxOrdini.setBounds(52, 117, 143, 27);
		frame.getContentPane().add(comboBoxOrdini);
		
		 comboBoxPronto = new JComboBox();
		comboBoxPronto.setBounds(219, 117, 143, 27);
		frame.getContentPane().add(comboBoxPronto);
	}

	public JButton getBtnPronto() {
		return btnPronto;
	}

	public void setBtnPronto(JButton btnPronto) {
		this.btnPronto = btnPronto;
	}

	public JButton getBtnAggiorna() {
		return btnAggiorna;
	}

	public JComboBox getComboBoxPronto() {
		return comboBoxPronto;
	}

	public void setComboBoxPronto(JComboBox comboBoxPronto) {
		this.comboBoxPronto = comboBoxPronto;
	}

	public void setBtnAggiorna(JButton btnAggiorna) {
		this.btnAggiorna = btnAggiorna;
	}

	public JButton getBtnInPreparazione() {
		return btnInPreparazione;
	}

	public void setBtnInPreparazione(JButton btnInPreparazione) {
		this.btnInPreparazione = btnInPreparazione;
	}

	public JComboBox getComboBoxOrdini() {
		return comboBoxOrdini;
	}

	public void setComboBoxOrdini(JComboBox comboBoxOrdini) {
		this.comboBoxOrdini = comboBoxOrdini;
	}
}
