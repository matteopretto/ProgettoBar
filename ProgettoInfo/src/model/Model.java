package model;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import model.Listino;

public class Model {
	FileWriter file;
	BufferedReader b;
	Listino lis;
	FileInputStream fis;
	FileOutputStream fos;
	int i = 0;

	public Model(FileWriter file, BufferedReader b) {
		this.file = file;
		this.b = b;
	}

	public void apriFile() {
		try {
			file = new FileWriter("Comande.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void scriviSuFile(Listino[] lis) {
		try {
			
			FileOutputStream fos = new FileOutputStream("Comande.txt");
			
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(lis);
			oos.flush();
			fos.close();
		} catch (Exception e) {}
	}

	public Listino[] leggiDaFile() {
		Listino[] list = null;
		while (true) {
			try {
				int a=0;
			 fis = new FileInputStream("Comande.txt");
				ObjectInputStream ois = new ObjectInputStream(fis);
				while(true) {
				 list[a] = (Listino) ois.readObject();
				 a++;
				 System.out.println(""+list.toString());
				}
				
			} catch (Exception e) {
				try {
					fis.close();
					return list;

				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			
		}
	

	}

}
