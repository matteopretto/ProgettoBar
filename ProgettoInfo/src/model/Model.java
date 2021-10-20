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
import java.util.ArrayList;
import java.util.Scanner;

import model.Listino;

public class Model {
	FileWriter file;
	BufferedReader b;
	Listino lis;
	FileInputStream fis;
	FileOutputStream fos;
	int i = 0;
	ArrayList<Listino> list = new ArrayList<Listino>();

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

	public void scriviSuFile(ArrayList<Listino> lis) {
		try {

			FileOutputStream fos = new FileOutputStream("Comande.txt");

			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(lis);
			oos.flush();
			fos.close();
		} catch (Exception e) {
		}
	}

	public ArrayList<Listino> leggiDaFile() {
		ArrayList<Listino> lista= new ArrayList<Listino>();
		try {
			
			System.out.println("son dentro");
			fis = new FileInputStream("Comande.txt");
			System.out.println("son dentro 2");
			ObjectInputStream ois = new ObjectInputStream(fis);
			System.out.println("son dentro 3");
			/*while (true) {
				list.add((Listino) ois.readObject());
				System.out.println("Ci sono");
			}*/
			 lista=  (ArrayList<Listino>) ois.readObject();
			//System.out.println(lista);

		} catch (Exception e) {
			try {
				fis.close();

			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		return lista;

	}

	/*public static void main(String[] args) {
		FileWriter fw;
		try {
			ArrayList<Listino> lis= new ArrayList<Listino>();
			ArrayList<Listino> lis2= new ArrayList<Listino>();
			fw=new FileWriter("Prova.txt");
			BufferedReader br = null;
			Model m= new Model(fw, br);
			//m.leggiDaFile();
			lis.add(model.Listino.Campari);
			lis.add(model.Listino.Cuba_Libre);
			m.scriviSuFile(lis);
	
			lis2=m.leggiDaFile();
			
			
			System.out.println(lis2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}*/

}
