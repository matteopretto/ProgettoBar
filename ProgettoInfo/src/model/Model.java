package model;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;

import model.Listino;

public class Model {
	FileWriter file;
	 BufferedReader b;


	public Model(FileWriter file, BufferedReader b) {
		this.file = file;
		this.b= b;
	}

	public void apriFile() {
		try {
			file = new FileWriter("Comande.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	public void scriviSuFile(String a) {
		try {
			file.write(a);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String leggiRigaDaFile() {
		String riga="";
		
		return riga;
	}
}
