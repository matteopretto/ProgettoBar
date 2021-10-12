package mainCameriere;

import java.awt.EventQueue;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

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
					BufferedReader b=null;
					 b= new BufferedReader(new FileReader("Comande.txt"));
					
					FileWriter fw= new FileWriter("Comande.txt");
					String nome="";
					float prezzo=0;
					Model modello= new Model(fw, b);
					Listino listino= new Listino(nome, prezzo);
					
					ControllerCameriere controller= new ControllerCameriere(window, modello, listino);

					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
