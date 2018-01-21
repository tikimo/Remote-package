package oopTraining;

import java.util.ArrayList;
import java.util.Random;

import java.util.Random;
import java.util.ArrayList;

public class Test{
    public static void main(String[] args){
        final Random r = new Random();
        
        
        ArrayList<Viikonpaiva> vpt = new ArrayList<Viikonpaiva>();
        for(Viikonpaiva vp : Viikonpaiva.values()){
            vpt.add(vp);
        }
        
        ArrayList<Kuukausi> kuukaudet = new ArrayList<Kuukausi>();
        for(Kuukausi k : Kuukausi.values()){
            kuukaudet.add(k);
        }
        
        for(int i = 0; i < 20; i++){
            Viikonpaiva v = vpt.get(r.nextInt(vpt.size()));
            Kuukausi k = kuukaudet.get(r.nextInt(kuukaudet.size()));
            
            System.out.println(k + "N " + (r.nextInt(4) + 1) + ". " + v);
        }
        
    }

    public enum Viikonpaiva {
    	RILLUNTAI
    }
    public enum Kuukausi {
    	TAMMIKUU, HELMIKUU, MAALISKUU, HUHTIKUU, TOUKOKUU, KESAKUU, 
    	HEINAKUU, ELOKUU, SYYSKUU, LOKAKUU, MARRASKUU, JOULUKUU
    }
}