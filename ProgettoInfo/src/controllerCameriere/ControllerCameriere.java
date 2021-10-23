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
	private Model modello;
	String temp = "SERVITO:\n";
	String strFile = "";
	int apriFile = 0;
	int i = 0;
	ArrayList<Listino> list = new ArrayList<Listino>();
	int indexListino = 0;
	ArrayList<Listino> list2 = new ArrayList<Listino>();
	int comande = 0;
	String nComande = "";
	float totale;
	String sTotale = "";

	public ControllerCameriere(ViewCameriere viewCameriere, Model modello, ArrayList<Listino> list) {
		this.viewCameriere = viewCameriere;
		viewCameriere.registraController(this);
		this.modello = modello;
		this.list = list;
	}

	public void actionPerformed(ActionEvent arg0) {

		if (arg0.getSource() == viewCameriere.getOrdina()) {
			JOptionPane.showMessageDialog(null, "ORDINATO");
			if (apriFile == 0) {
				modello.apriFile();
				apriFile++;
			} else
				;
			if (viewCameriere.getComboBoxOrdini().getSelectedIndex() != -1) {
				list.add((Listino) viewCameriere.getComboBoxOrdini()
						.getItemAt(viewCameriere.getComboBoxOrdini().getSelectedIndex()));
				indexListino++;
				modello.scriviSuFile(list);
				// temp+=""+viewCameriere.getComboBoxOrdini().toString()+"\n";
				// viewCameriere.getTextOrdini().setText(temp);

			}

			else
				JOptionPane.showMessageDialog(null, "Non hai selezionato nessuna bevanda");
		}

		if (arg0.getSource() == viewCameriere.getBtnNewAggiorna()) {
			list2 = modello.leggiDaFile();
			// System.out.println(list2);
			for (int i = 0; i < list2.size(); i++) {
				if (list2.get(i).getStato() == 2) {
					// System.out.println(list2);
					viewCameriere.getComboBoxDaServire().addItem(list2.get(i));
				}
			}
		}

		if (arg0.getSource() == viewCameriere.getBtnNewServito()) {
			if (viewCameriere.getComboBoxDaServire().getSelectedIndex() == -1) {
				// System.out.println("devi preparare un cocktail prima");
				JOptionPane.showMessageDialog(null, "aggiorna la pagina o aspetta che un cocktail sia pronto");
			} else {
				int a = viewCameriere.getComboBoxDaServire().getSelectedIndex();
				int b = ((Listino) viewCameriere.getComboBoxDaServire().getSelectedItem()).getID();
				viewCameriere.getComboBoxDaServire().removeItemAt(a);
				list2 = modello.leggiDaFile();
				for (int i = 0; i < list2.size(); i++) {
					if (list2.get(i).getID() == b) {
						int v = list2.get(i).getStato();
						list2.get(i).setStato(v + 1);
						temp += "" + list2.get(i) + "\n";
						comande++;
						totale += list2.get(i).getPrezzo();

					}
				}
				modello.scriviSuFile(list2);
				viewCameriere.getTextOrdini().setText(temp);
				nComande = "TOT. " + comande;
				viewCameriere.getTextComande().setText(nComande);
				sTotale = "TOTALE €" + totale;
				viewCameriere.getTextTotale().setText(sTotale);
			}
		}
	}
}