package controllerCucina;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import ViewCucina.ViewCucina;
import controllerCameriere.ControllerCameriere;
import model.Model;
import model.Listino;

public class ControllerCucina implements ActionListener {
	private ViewCucina viewCucina;
	private Model model;
	private Listino listino;
	ArrayList<Listino> list= new ArrayList<Listino>();

		public ControllerCucina(ViewCucina viewCucina, Model model, Listino listino) {
			this.viewCucina=viewCucina;
			viewCucina.registraController(this);
			this.listino=listino;
			this.model=model;
		}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getSource()==viewCucina.getBtnAggiorna()) {
			list=model.leggiDaFile();
			for(int i=0; i<list.size(); i++) {
				viewCucina.getComboBoxOrdini().addItem(list.get(i));
			}
		}
		
	}
	/*
	 * public ControllerCucina(ViewCucina viewCucina, ControllerCameriere
	 * controllerCameriere) { this.viewCucina = viewCucina; }
	 */

}
