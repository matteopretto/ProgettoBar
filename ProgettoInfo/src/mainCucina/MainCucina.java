package mainCucina;

import java.awt.EventQueue;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

import ViewCameriere.ViewCameriere;
import ViewCucina.ViewCucina;
import controllerCameriere.ControllerCameriere;
import controllerCucina.ControllerCucina;
import model.Listino;
import model.Model;

public class MainCucina {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewCucina window = new ViewCucina();
					FileWriter fw = new FileWriter("Comande.txt");
					BufferedReader b = null;
					b = new BufferedReader(new FileReader("Comande.txt"));
					int stato = 0;
					int id = 0;

					String nome = "";
					float prezzo = 0;
					Model modello = new Model(fw, b);

					// Listino [] list= new Listino[20];

					ControllerCucina controller = new ControllerCucina(window, modello);

					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

		});
	}
}
