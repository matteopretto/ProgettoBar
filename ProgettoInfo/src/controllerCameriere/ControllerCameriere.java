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
	String temp = "ORDINAZIONI EFFETTUATE:\n";
	String strFile = "";
	int apriFile = 0;
	int i = 0;
	ArrayList<Listino> list= new ArrayList<Listino>();
	int indexListino = 0;
	ArrayList<Listino> list2= new ArrayList<Listino>();

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
				//temp+=""+viewCameriere.getComboBoxOrdini().toString()+"\n";
				//viewCameriere.getTextOrdini().setText(temp);
				

			}

			else
				JOptionPane.showMessageDialog(null, "Non hai selezionato nessuna bevanda");
		}
		
		if(arg0.getSource()==viewCameriere.getBtnNewAggiorna()) {
			list2=modello.leggiDaFile();
			System.out.println(list2);
			for(int i=0; i<list2.size(); i++) {
				if(list2.get(i).getStato()==2) {
					System.out.println(list2);
					viewCameriere.getComboBoxDaServire().addItem(list2.get(i));
				}
			}
		}
	}
}