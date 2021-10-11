package model;

public class Listino {
	private String nome;
	private float prezzo;
	
	public static Listino Gin_Lemon= new Listino("Gin Lemon", (float)7.00);
	public static Listino Campari= new Listino("Spritz Campari", (float)5.00);
	public static Listino Prosecco= new Listino("Prosecco", (float)4.50);
	public static Listino Malibu_Cola= new Listino("Malibu cola", (float)7.00);
	public static Listino Cuba_Libre= new Listino("Cuba Libre", (float)8.00);
	public static Listino Mojito= new Listino("Mojito", (float)7.50);
	
	
			
			public Listino(String nome, float prezzo) {
		this.nome=nome;
		this.prezzo=prezzo;
	}



			@Override
			public String toString() {
				return "" + nome + " [" + prezzo + "€]";
			}
			
			public String toString2() {
				return "" + nome + "";
			}
			
}
