package model;

import java.io.Serializable;
import java.util.UUID;

public class Listino implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2483012046534760137L;
	private String nome;
	private float prezzo;
	private int stato;
	private int ID;


	public Listino(String nome, float prezzo, int stato, int ID) {
		this.nome = nome;
		this.prezzo = prezzo;
		this.stato = stato;
		this.ID = (int) (Math.random()*10000);
	}

	@Override
	public String toString() {
		return "" + nome + " [" + prezzo + "€] ";
	}
	
	public Listino nuovoList(Listino origine) {
		Listino l= new Listino(origine.getNome(), origine.getPrezzo(), origine.getStato(), ID);
		return l;
	}

	public String toString2() {
		return "" + nome + "";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getStato() {
		return stato;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public void setStato(int stato) {
		this.stato = stato;
	}

	public float getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(float prezzo) {
		this.prezzo = prezzo;
	}

}
