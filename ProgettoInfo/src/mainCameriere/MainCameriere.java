package mainCameriere;

import java.awt.EventQueue;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

import ViewCameriere.ViewCameriere;
import controllerCameriere.ControllerCameriere;
import model.Model;
import model.Listino;


public class MainCameriere {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewCameriere window = new ViewCameriere();
					FileWriter fw= new FileWriter("Comande.txt");
					BufferedReader b=null;
					 b= new BufferedReader(new FileReader("Comande.txt"));
					 int stato = 0;
				
					String nome="";
					float prezzo = 0;
					Model modello= new Model(fw, b);
					Listino listino= new Listino(nome, prezzo, stato);
					ArrayList<Listino> list= new ArrayList<Listino>();
					
					
					ControllerCameriere controller= new ControllerCameriere(window, modello, listino, list);

					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
