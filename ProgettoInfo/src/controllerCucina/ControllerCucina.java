package controllerCucina;

import java.awt.AWTEvent;
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
	ArrayList<Listino> list = new ArrayList<Listino>();
	int i = 0;
	int f=3;

	public ControllerCucina(ViewCucina viewCucina, Model model) {
		this.viewCucina = viewCucina;
		viewCucina.registraController(this);
		this.model = model;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == viewCucina.getBtnAggiorna()) {
			list = model.leggiDaFile();
			//MODIFICHE PER ID
			/*for(int i=0; i<list.size(); i++) {
				list.get(i).setID((list.get(i).getID())+f);
				f+=3;
			}
			*/
			//FINE MODIFICHE
			while (i < list.size()) {
				viewCucina.getComboBoxOrdini().addItem(list.get(i));
				i++;
			}
		}

		if (arg0.getSource() == viewCucina.getBtnInPreparazione()) {

			if (viewCucina.getComboBoxOrdini().getSelectedIndex() == -1) {
				// System.out.println("inserisci un cocktail e aggiorna");
				JOptionPane.showMessageDialog(null, "inserisci un cocktail e aggiorna");
			} else {
				int j = viewCucina.getComboBoxOrdini().getSelectedIndex();
				int g = ((Listino) viewCucina.getComboBoxOrdini().getItemAt(j)).getID();
				// System.out.println(g);
				viewCucina.getComboBoxPronto().addItem(viewCucina.getComboBoxOrdini().getSelectedItem());
				viewCucina.getComboBoxOrdini().removeItemAt(j);
				list = model.leggiDaFile();
				for (int i = 0; i < list.size(); i++) {
					if (list.get(i).getID() == g) {
						int c = list.get(i).getStato();
						list.get(i).setStato(c + 1);
						model.scriviSuFile(list);
						// System.out.println(list);
						break;
					}
				}

			}

			System.out.println(list);

		}
		if (arg0.getSource() == viewCucina.getBtnPronto()) {

			if (viewCucina.getComboBoxPronto().getSelectedIndex() == -1) {
				// System.out.println("devi preparare un cocktail prima");
				JOptionPane.showMessageDialog(null, "devi preparare un cocktail prima");
			} else {
				int y = viewCucina.getComboBoxPronto().getSelectedIndex();
				int z = ((Listino) viewCucina.getComboBoxPronto().getItemAt(y)).getID();
				// System.out.println(z);
				viewCucina.getComboBoxPronto().removeItemAt(y);
				list = model.leggiDaFile();
				for (int i = 0; i < list.size(); i++) {
					if (list.get(i).getID() == z) {
						int c = list.get(i).getStato();
						list.get(i).setStato(c + 1);
						model.scriviSuFile(list);
						// System.out.println(list);
						break;
					}
				}
				/*
				 * int x=list.get(y).getStato(); list.get(y).setStato(x+1);
				 * model.scriviSuFile(list); System.out.println(list);
				 */
			}

		}

	}
	/*
	 * public ControllerCucina(ViewCucina viewCucina, ControllerCameriere
	 * controllerCameriere) { this.viewCucina = viewCucina; }
	 */

}
