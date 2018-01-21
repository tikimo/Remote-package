package oopTraining;

import java.util.ArrayList;

public class Kalenteri {
	private int p,k,v;
	
	/**
	 * Otetaan päivämäärä listassa,
	 * muotoa päivä, kuukausi, vuosi.
	 * 
	 * @param pkv
	 */
	public Kalenteri(ArrayList<Integer> pkv) throws pkvPoikkeus{
		try {
			
			this.p = pkv.get(0);
			if (this.p > 31 || this.p < 1) {
				throw new pkvPoikkeus("Paiva");
			}
			
			this.k = pkv.get(1);
			if (this.k > 12 || this.k < 1) {
				throw new pkvPoikkeus("Kuukausi");
			}
			
			this.v = pkv.get(2);
			
		} catch (pkvPoikkeus PPoik) {
			System.out.println("[VIRHE] Ei-normaali luku.");
			// DEBUG:
			PPoik.printStackTrace();
			this.p = 0;
			this.k = 0;
			this.v = 0;
			
		} catch (NullPointerException npe) {
			System.out.println("[VIRHE] Tyhja argumentti.");
			// DEBUG:
			npe.printStackTrace();
			this.p = 0;
			this.k = 0;
			this.v = 0;
		}
	}
	
	@Override 
	public String toString() {
		return "\nPaiva: " + p 
				+ "\nKuukausi: " + k 
				+ "\nVuosi: " + v 
				+ "\n";
	}
}

class pkvPoikkeus extends Exception {
	public pkvPoikkeus(String viesti) {
		super(viesti);
	}
}
