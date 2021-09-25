package controller;

import model.Modello;
import view.S;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class Controller implements ActionListener {

		private Controller contr;
		private Modello model;
		private S view;
		
		public Controller(S view, Modello model) {
			this.view = view;
			this.model=model;
			view.registraController(this);
		}
		
		
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if(arg0.getSource()== view.getBtnInvia()) {
			
			
			if(model.getTent()>0) {
				
			String a=view.getTextField_numero().getText();
			int i=0;
			try {
			 i=Integer.parseInt(a);
			 model.decrementaTent();
			}catch(NumberFormatException nfe){
				view.getTextField_numero().setText("un numero..");
			}
			view.getTextField_tent().setText("Tentativi rimasti: "+model.getTent());
			if(i== model.getNumero()) {
				view.getTextField_guess().setText("Numero indovinato");
			}
			else if (i>model.getNumero()) {
				view.getTextField_guess().setText("Riprova con un numero piu basso");
			}
			else if (i<model.getNumero()) {
				view.getTextField_guess().setText("Riprova con un numero piu alto");
			}
			}
			else view.getTextField_guess().setText("TENTATIVI ESAURITI!!");
		}
		
	}

}
