package oopTraining;

import java.util.ArrayList;
import oopTraining.Kalenteri;

public class KalTest {
	

	public static void main(String[] moro) throws pkvPoikkeus {

		ArrayList<Integer> sisalto = new ArrayList<Integer>();
		
		System.out.println("Luodaan sisalto");
		sisalto.add(21);
		sisalto.add(5);
		sisalto.add(2080);
		
		System.out.println("Luodaan uusi Kalenteri...");
		Kalenteri testi = new Kalenteri(sisalto);
		System.out.println("Kalenteri luotu onnistuneesti.");
		
		System.out.println(testi.toString());
		
		sisalto.clear();
		
		// Testi 2:
		sisalto.add(44);
		System.out.println("Lisataan epanormaali paiva...");
		sisalto.add(14);
		sisalto.add(2000);
		
		System.out.println("Syotetaan epanormaali paiva...");
		Kalenteri testi2 = new Kalenteri(sisalto);
		
		System.out.println(testi2.toString());
		
		
	}

}
