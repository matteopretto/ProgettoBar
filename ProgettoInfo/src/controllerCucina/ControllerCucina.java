package controllerCucina;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import ViewCucina.ViewCucina;
import controllerCameriere.ControllerCameriere;
import model.Model;
import model.Listino;

public class ControllerCucina implements ActionListener {
	private ViewCucina viewCucina;
	private Model model;
	private Listino listino;

		public ControllerCucina(ViewCucina viewCucina, Model model, Listino listino) {
			this.viewCucina=viewCucina;
			viewCucina.registraController(this);
			this.listino=listino;
			this.model=model;
		}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getSource()==viewCucina.getBtnAggiorna()) {

		}
		
	}
	/*
	 * public ControllerCucina(ViewCucina viewCucina, ControllerCameriere
	 * controllerCameriere) { this.viewCucina = viewCucina; }
	 */

}
