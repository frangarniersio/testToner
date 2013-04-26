package test;
import java.util.ArrayList;

import metier.Cartouche;
import metier.Imprimante;
import metier.TypeImprimante;


public class TestTP5 {


	public static void main(String[] args) {
		
		// déclarations
		TypeImprimante t1, t2;
		Cartouche c1, c2;
		Imprimante imp1, imp2;
		ArrayList<Cartouche> liste;
		
		// instanciations
		t1 = new TypeImprimante('L', "Laser");
		t2 = new TypeImprimante('J', "Jet d’encre");
		c1 = new Cartouche("P45-HP-LJ2","Cartouche toner", 54.25);
		c2 = new Cartouche("IC-WCP45-3","Cartouche Ink-HP", 32.25);
		imp1 = new Imprimante("HPLJ3",t1,"Hewlett Packard Laserjet 3", new ArrayList<Cartouche>());
		imp2 = new Imprimante("HPDJ560C",t2,"Hewlett Packard Deskjet 560C",new ArrayList<Cartouche>());
		liste = new ArrayList<Cartouche>();
		
		// ajout des cartouches à la collection
		liste.add(c1);
		liste.add(c2);
		
		// ajout de la collection à l'imprimante
		imp1.setLesCartouches(liste);
		
		// affichage
		System.out.println("Pour l'imprimante : "+imp1.toString()+", il existe "+imp1.getNbCartouchesCompatibles()+" cartouches compatibles !");
		System.out.println("Pour l'imprimante : "+imp2.toString()+", il existe "+imp2.getNbCartouchesCompatibles()+" cartouches compatibles !");


	}

}
