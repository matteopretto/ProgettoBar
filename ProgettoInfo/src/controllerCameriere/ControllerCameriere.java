package controllerCameriere;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import model.Listino;
import ViewCameriere.ViewCameriere;
//ciao
public class ControllerCameriere implements ActionListener {

	private ViewCameriere viewCameriere;
	private Listino listino;
	String temp = "IN PREPARAZIONE:";
	String strFile="";

	public ControllerCameriere(ViewCameriere viewCameriere) {
		this.viewCameriere = viewCameriere;
		viewCameriere.registraController(this);
	}

	public void actionPerformed(ActionEvent arg0) {

		if (arg0.getSource() == viewCameriere.getOrdina()) {
			if (viewCameriere.getComboBoxOrdini().getSelectedIndex() != -1) {
				String newOrder = viewCameriere.getComboBoxOrdini().getSelectedItem().toString();
				temp += "\n" + newOrder;
				viewCameriere.getTextOrdini().setText(temp);
				
			}

			else
				JOptionPane.showMessageDialog(null, "Non hai selezionato nessuna bevanda");
		}
	}
}