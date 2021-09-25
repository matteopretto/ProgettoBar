package view;

import java.awt.BorderLayout;
import controller.Controller;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.Controller;


import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;

public class S extends JFrame {

	private JPanel contentPane;
	private JTextField txtTentativiRimasti;
	private JTextField textField_numero;
	private JTextField txtIndovinaNumero;
	private JButton btnInvia;
	private JTextField textField_guess;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					S frame = new S();
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
	public S() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.textInactiveText);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		 btnInvia = new JButton("INVIA");
		btnInvia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnInvia.setBounds(185, 204, 76, 23);
		contentPane.add(btnInvia);
		
		txtTentativiRimasti = new JTextField();
		txtTentativiRimasti.setEditable(false);
		txtTentativiRimasti.setBackground(new Color(238, 232, 170));
		txtTentativiRimasti.setHorizontalAlignment(SwingConstants.CENTER);
		txtTentativiRimasti.setText("Tentativi rimasti: 5");
		txtTentativiRimasti.setBounds(145, 69, 152, 20);
		contentPane.add(txtTentativiRimasti);
		txtTentativiRimasti.setColumns(10);
		
		textField_numero = new JTextField();
		textField_numero.setHorizontalAlignment(SwingConstants.CENTER);
		textField_numero.setBounds(175, 114, 86, 20);
		contentPane.add(textField_numero);
		textField_numero.setColumns(10);
		
		txtIndovinaNumero = new JTextField();
		txtIndovinaNumero.setEditable(false);
		txtIndovinaNumero.setBackground(SystemColor.controlHighlight);
		txtIndovinaNumero.setForeground(SystemColor.textText);
		txtIndovinaNumero.setFont(new Font("Symeteo", Font.PLAIN, 14));
		txtIndovinaNumero.setHorizontalAlignment(SwingConstants.CENTER);
		txtIndovinaNumero.setText("INDOVINA NUMERO");
		txtIndovinaNumero.setBounds(125, 28, 190, 30);
		contentPane.add(txtIndovinaNumero);
		txtIndovinaNumero.setColumns(10);
		
		textField_guess = new JTextField();
		textField_guess.setEditable(false);
		textField_guess.setFont(new Font("Trebuchet MS", Font.PLAIN, 11));
		textField_guess.setHorizontalAlignment(SwingConstants.CENTER);
		textField_guess.setBounds(100, 157, 245, 20);
		contentPane.add(textField_guess);
		textField_guess.setColumns(10);
	}
	

	public JTextField getTextField_tent() {
		return txtTentativiRimasti;
	}

	public void setTextField_tent(JTextField textField_tent) {
		this.txtTentativiRimasti = textField_tent;
	}

	public JTextField getTextField_numero() {
		return textField_numero;
	}

	public void setTextField_numero(JTextField textField_numero) {
		this.textField_numero = textField_numero;
	}

	public JTextField getTxtIndovinaNumero() {
		return txtIndovinaNumero;
	}

	public void setTxtIndovinaNumero(JTextField txtIndovinaNumero) {
		this.txtIndovinaNumero = txtIndovinaNumero;
	}

	public JButton getBtnInvia() {
		return btnInvia;
	}
	

	public JTextField getTextField_guess() {
		return textField_guess;
	}

	public void setTextField_guess(JTextField textField_guess) {
		this.textField_guess = textField_guess;
	}

	public void setBtnInvia(JButton btnInvia) {
		this.btnInvia = btnInvia;
	}

	public void registraController(Controller controller) {
		// TODO Auto-generated method stub
		txtTentativiRimasti.addActionListener(controller);
		textField_numero.addActionListener(controller);
		btnInvia.addActionListener(controller);
		
	}
}
