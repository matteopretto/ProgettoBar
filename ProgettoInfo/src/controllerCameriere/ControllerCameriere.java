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
	String fisso = "SERVITO:\n";
	String temp1="";
	String temp2="";
	String temp3="";
	String temp4="";
	private Listino listino;
	int stringa=0;

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
	int f = 10;

	public ControllerCameriere(ViewCameriere viewCameriere, Model modello, ArrayList<Listino> list, Listino listino) {
		this.viewCameriere = viewCameriere;
		viewCameriere.registraController(this);
		this.modello = modello;
		this.list = list;
		this.listino=listino;
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
				Listino tempo = listino.nuovoList((Listino) viewCameriere.getComboBoxOrdini()
						.getItemAt(viewCameriere.getComboBoxOrdini().getSelectedIndex()));
				int x = viewCameriere.getComboBoxOrdini().getSelectedIndex();
				viewCameriere.getComboBoxOrdini().removeItemAt(x);
				viewCameriere.getComboBoxOrdini().addItem(tempo);

				/*
				 * int x=list.size(); int j=list.get(x-1).getID(); list.get(x-1).setID(j+f);
				 * f+=3;
				 */
				// indexListino++;
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
					list2.get(i).setStato(list2.get(i).getStato()+1);
					modello.scriviSuFile(list2);
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
						if(stringa==0) {
							temp1= "" + list2.get(i) + "\n";
							stringa++;
						}
						else if(stringa==1) {
							temp2= "" + list2.get(i) + "\n";
							stringa++;
						}
						else if(stringa==2) {
							temp3= "" + list2.get(i) + "\n";
							stringa++;
						}
						else if(stringa==3) {
							temp4= "" + list2.get(i) + "\n";
							stringa++;
						}
						else if(stringa>=4) {
							String nw= "" + list2.get(i) + "\n";
							temp1=temp2;
							temp2=temp3;
							temp3=temp4;
							temp4=nw;
							stringa++;
						}
						
						comande++;
						totale += list2.get(i).getPrezzo();
						break;

					}
				}
				modello.scriviSuFile(list2);
				String temporanea=""+fisso+""+temp1+""+temp2+""+temp3+""+temp4;
				viewCameriere.getTextOrdini().setText(temporanea);
				nComande = "TOT. " + comande;
				viewCameriere.getTextComande().setText(nComande);
				sTotale = "TOTALE ?" + totale;
				viewCameriere.getTextTotale().setText(sTotale);
			}

		
		}
	}
}