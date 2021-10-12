package model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

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
			file.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String[] leggiRighe() {
		String[] s= new String[] {};
		int i=0;
		FileReader reader = null;
		try {
			reader = new FileReader("Comande.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Scanner in = new Scanner(reader);
		while(in.hasNextLine())
		{ 
			s[i] = in.nextLine();
			i++;
		}
		return s;
		
	}
	public String leggiRigaDaFile() {
		String riga="";
		
		return riga;
	}
}
