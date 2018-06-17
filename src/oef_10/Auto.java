/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oef_10;

import java.util.Comparator;

/**
 *
 * @author Karima
 */
public abstract class Auto implements Comparable<Auto> {
    private static int volgnummer = 0;
    private Type type;
    private Merk merk;
    private int kmStand;
    private long chassisnummer;
    private String nummerplaat;
    private int eigenVolgNummer;

    public Auto(Merk merk,Type type,  int kmStand, long chassisnummer, String nummerplaat) {
        this.volgnummer++;
        this.eigenVolgNummer = volgnummer;
        this.type = type;
        this.merk = merk;
        this.kmStand = kmStand;
        this.chassisnummer = chassisnummer;
        this.nummerplaat = nummerplaat;
        
    }

    public int getKmStand() {
        return kmStand;
    }

    public void setKmStand(int kmStand) {
        this.kmStand = kmStand;
    }

    public String getNummerplaat() {
        return nummerplaat;
    }

    public void setNummerplaat(String nummerplaat) {
        this.nummerplaat = nummerplaat;
    }

    public int getVolgnummer() {
        return eigenVolgNummer;
    }

    public Type getType() {
        return type;
    }

    public Merk getMerk() {
        return merk;
    }

    public long getChassisnummer() {
        return chassisnummer;
    }
    
    /*
    
    De natuurlijke ordening van een Auto is het volgnummer. 
    Een auto is gelijk aan een andere auto indien het chassisnummer hetzelfde is. 
    Maak het mogelijk om een auto te sorteren op KM stand.

    
    */
   
   
    @Override
     public boolean equals(Object o) {
        
         if(o == this){ //1) checken of het object gelijk is aan this
             return true;
         }
         
         if (o == null || !(o instanceof Auto)) //20 checken of het null is, 3) checken of het een instantie s van huidigge class
            return false;
        
        Auto n = (Auto) o; //casten naar huidige 
        
        return n.getChassisnummer() == this.getChassisnummer();
    
        }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + (int) (this.getChassisnummer() ^ (this.getChassisnummer() >>> 32));
        return hash;
    }
    
    @Override
    public int compareTo(Auto compareAuto){
        int compareVolgnummer;
        compareVolgnummer = ((Auto)compareAuto).getVolgnummer();
        
        //van klein naar groot
        return this.eigenVolgNummer - compareVolgnummer;
        
    }
    
    
    
    public static Comparator<Auto> KmStandComparator = new Comparator<Auto>(){
            @Override
            public int compare(Auto auto1, Auto auto2){
                int standAuto1 = auto1.getKmStand();
                int standAuto2 = auto2.getKmStand();
                
                return standAuto1 - standAuto2;
            
            }
            
            
    };

    @Override
    public String toString() {
        return
                "merk= " + merk 
                + ", type= " + type 
                + ", kmStand= " + kmStand 
                + ", chassisnummer= " + chassisnummer 
                + ", nummerplaat= " + nummerplaat + ' ';
    }
    
    
    
    
    
    
    
    
}
