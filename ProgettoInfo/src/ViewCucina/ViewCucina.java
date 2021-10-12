package ViewCucina;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ViewCucina {

	private JFrame frame;
	private JButton btnPronto;
	private JButton btnAggiorna;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewCucina window = new ViewCucina();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
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
		lblNewLabel.setBounds(164, 13, 123, 38);
		frame.getContentPane().add(lblNewLabel);

		JList listCucina = new JList();
		listCucina.setBounds(116, 60, 216, 119);
		frame.getContentPane().add(listCucina);

		btnAggiorna = new JButton("AGGIORNA");
		btnAggiorna.setBounds(116, 205, 99, 21);
		frame.getContentPane().add(btnAggiorna);
	}
}
