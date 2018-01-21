package oopTraining;

import java.util.HashMap;
import java.util.Random;
import java.util.*;

public class HelloTrain{
	public static void main(String[] args){
		
final Random rnd = new Random();
        
        
        String[] nimet = {"Ohjelmointi", "Matematiikka", "Fysiikka", "Kemia", "Biologia", "Maantieto"};
        
        for (int i=0; i<10; i++){
            String nimi = nimet[rnd.nextInt(nimet.length)] + " " + (rnd.nextInt(5) + 1);
            int taso = rnd.nextInt(3) + 1;
            int luentoja = rnd.nextInt(7) + 7;
            boolean loppuTentti = rnd.nextInt(2) == 1;
            int demoja = rnd.nextInt(10) + 10;
            double minimiPr = (double) (rnd.nextInt(5) + 5) / 10;
            
            DemoKurssi dk1 = new DemoKurssi(nimi,taso,luentoja,loppuTentti,demoja,minimiPr);
            System.out.println("Kurssi 1:" + dk1);
            if (rnd.nextInt(2) == 1){
                DemoKurssi dk2 = new DemoKurssi(nimi,taso,luentoja,loppuTentti,demoja,minimiPr);
                System.out.println("Kurssi 2:" + dk2);
                System.out.println("equals():" + dk1.equals((Object) dk2));
            } else {
                int field = rnd.nextInt(6);
                DemoKurssi dk2;
                if (field == 0){
                    dk2 = new DemoKurssi(nimet[rnd.nextInt(nimet.length)] + " " + (rnd.nextInt(5) + 1),taso,luentoja,loppuTentti,demoja,minimiPr);
                } else if (field == 1){
                    dk2 = new DemoKurssi(nimi,taso + 1,luentoja,loppuTentti,demoja,minimiPr);
                } else if (field == 2){
                    dk2 = new DemoKurssi(nimi,taso,luentoja + (rnd.nextInt(5) + 1),loppuTentti,demoja,minimiPr);
                } else if (field == 3){
                    dk2 = new DemoKurssi(nimi,taso,luentoja,!loppuTentti,demoja,minimiPr);
                } else if (field == 4){
                    dk2 = new DemoKurssi(nimi,taso,luentoja,loppuTentti,demoja + 2,minimiPr);
                } else {
                    dk2 = new DemoKurssi(nimi,taso,luentoja,loppuTentti,demoja,minimiPr / 2);
                }
                System.out.println("Kurssi 2:" + dk2);
                System.out.println("equals():" + dk1.equals((Object) dk2));
            }
            
        }
        
}
}
class Kurssi{
    protected String nimi;
    protected int taso;
    protected int luentoja;
    protected boolean loppuTentti;
    
    public Kurssi(String nimi, int taso, int luentoja, boolean loppuTentti) {
        this.nimi = nimi;
        this.taso = taso;
        this.luentoja = luentoja;
        this.loppuTentti = loppuTentti;
    }
    
    public String annaNimi() {
        return nimi;
    }

    public int annaTaso() {
        return taso;
    }

    public int annaLuentoja() {
        return luentoja;
    }

    public boolean annaLoppuTentti() {
        return loppuTentti;
    }
}
class DemoKurssi extends Kurssi{
    protected int demoja;
    protected double minimiProsentti;
    
    public DemoKurssi(String nimi, int taso, int luentoja, boolean loppuTentti, int demoja, double minimiProsentti){
        super(nimi, taso, luentoja, loppuTentti);
        this.demoja = demoja;
        this.minimiProsentti = minimiProsentti;
    }
    
    public String toString() {
        return  nimi + ", taso:" + taso + ", luentoja:" + luentoja + ", loppuTentti:" + loppuTentti + ", demoja:" + demoja + ", minimi%:" + minimiProsentti;
    }
    
    public int annaDemoja() {
        return demoja;
    }

    public double annaMinimiProsentti() {
        return minimiProsentti;
    }
    
    public boolean equals(DemoKurssi a, DemoKurssi b) {
        if (Comparator.comparing((Kurssi k)->k.nimi)
              .thenComparingInt(k -> k.taso)
              .thenComparingInt(k -> k.luentoja)
              .thenComparing(k -> k.loppuTentti).toString() == null
              && 
              Comparator.comparing((DemoKurssi dk) -> dk.demoja)
            		  .thenComparing(dk -> dk.minimiProsentti).toString() == null) {
        	return true;
        }
        else {
        	return false;
        }
    }
    
}