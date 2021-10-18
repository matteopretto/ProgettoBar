package model;

import java.io.Serializable;

public class Listino implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2483012046534760137L;
	private String nome;
	private float prezzo;
	private int stato;

	public static Listino Gin_Lemon = new Listino("Gin_Lemon     ", (float) 7.00, 0);
	public static Listino Campari = new Listino("Spritz_Campari", (float) 5.00, 0);
	public static Listino Prosecco = new Listino("Prosecco      ", (float) 4.50, 0);
	public static Listino Malibu_Cola = new Listino("Malibu_cola   ", (float) 7.00, 0);
	public static Listino Cuba_Libre = new Listino("Cuba_Libre    ", (float) 8.00, 0);
	public static Listino Mojito = new Listino("Mojito        ", (float) 7.50, 0);

	public Listino(String nome, float prezzo, int stato) {
		this.nome = nome;
		this.prezzo = prezzo;
		this.stato=stato;
	}

	@Override
	public String toString() {
		return "" + nome + " [" + prezzo + "€]";
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

	public float getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(float prezzo) {
		this.prezzo = prezzo;
	}
	
	

}
