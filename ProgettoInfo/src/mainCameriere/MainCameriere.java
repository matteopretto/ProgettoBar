package mainCameriere;

import java.awt.EventQueue;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import ViewCameriere.ViewCameriere;
import controllerCameriere.ControllerCameriere;
import model.Model;
import model.Listino;

public class MainCameriere {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JOptionPane.showMessageDialog(null, "Per i professori: fixato problema che preparava piu comande."
							+ "Nella textfield mainCameriere vengono scritte le ultime 4 comande servite(aggiornate ad ogni servizio).\n"
							+ "Dovendo creare un nuovo oggetto dopo ogni ordinazione, per evitare che ci sia lo stesso id per pi? comande uguale"
							+ ", ogni volta che viene fatta un ordinazione lo stesso drink andr? a finire in fondo all comboBoxOrdini");
					ViewCameriere window = new ViewCameriere();
					FileWriter fw = new FileWriter("Comande.txt");
					BufferedReader b = null;
					b = new BufferedReader(new FileReader("Comande.txt"));
					int stato = 0;
					int id = 0;

					String nome = "";
					float prezzo = 0;
					Model modello = new Model(fw, b);
					Listino listino = new Listino(nome, prezzo, stato, id);
					ArrayList<Listino> list = new ArrayList<Listino>();

					ControllerCameriere controller = new ControllerCameriere(window, modello, list, listino);

					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
