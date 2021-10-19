package controllerCameriere;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import model.Listino;
import model.Model;
import ViewCameriere.ViewCameriere;

public class ControllerCameriere implements ActionListener {

	private ViewCameriere viewCameriere;
	private Listino listino;
	private Model modello;
	String temp = "IN PREPARAZIONE:";
	String strFile = "";
	int apriFile = 0;
	int i = 0;
	ArrayList<Listino> list= new ArrayList<Listino>();
	int indexListino = 0;

	public ControllerCameriere(ViewCameriere viewCameriere, Model modello, Listino listino, ArrayList<Listino> list) {
		this.viewCameriere = viewCameriere;
		viewCameriere.registraController(this);
		this.modello = modello;
		this.listino = listino;
		this.list = list;
	}

	public void actionPerformed(ActionEvent arg0) {

		if (arg0.getSource() == viewCameriere.getOrdina()) {
			if (apriFile == 0) {
				modello.apriFile();
				apriFile++;
			} else
				;
			if (viewCameriere.getComboBoxOrdini().getSelectedIndex() != -1) {
				list.add( (Listino) viewCameriere.getComboBoxOrdini()
						.getItemAt(viewCameriere.getComboBoxOrdini().getSelectedIndex()));
				indexListino++;
				viewCameriere.getTextOrdini().setText(temp);

				modello.scriviSuFile(list);

			}

			else
				JOptionPane.showMessageDialog(null, "Non hai selezionato nessuna bevanda");
		}
	}
}