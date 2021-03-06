package oopDemot1;

import java.util.ArrayList;

public class Joukkue{
	public ArrayList<Pelaaja> pelaajat = new ArrayList<Pelaaja>();
	
	public void lisaaPelaaja(String n, int num, String pp){
		Pelaaja uusiPelaaja = new Pelaaja(n,num,pp);
		pelaajat.add(uusiPelaaja);
	}
	
	public void poistaPelaaja(int num){
		for (Pelaaja x : pelaajat){
			if(x.annaNumero() == num){
				pelaajat.remove(x);
			}
		}
	}
	
	public void tulostaJoukkue(){
		for (Pelaaja x : pelaajat){
			System.out.print(x.annaNimi());
			System.out.print(x.annaNumero());
			System.out.println(x.annaPelipaikka());
		}
	}
}