package model;

public class Modello {

	private int tentativi=5;
    private int numero=(int)((Math.random()*30)+1);
  

public void decrementaTent() {
	 tentativi--;
}

public int getTent() {
	return tentativi;
}

public int getNumero() {
	return numero;
}
}

