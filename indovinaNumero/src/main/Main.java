package main;

import controller.Controller;
import model.Modello;
import view.S;


public class Main {
	public static void main(String[] args) {
		// Creo i vari pezzi e avvio l'applicazione
		S p = new S();
		Modello s= new Modello();
		Controller c = new Controller( p, s);
		// Avvio l'applicazione rendendola visibile
		p.setVisible(true);
	}
}