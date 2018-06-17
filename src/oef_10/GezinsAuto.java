/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oef_10;

/**
 *
 * @author Karima
 */
public class GezinsAuto extends Auto {
    private int aantalZitjes;
    private boolean trekhaak;

    public GezinsAuto( Merk merk,Type type, int kmStand, long chassisnummer, String nummerplaat, int aantalZits, boolean trekhaak) {
        super(merk,type, kmStand, chassisnummer, nummerplaat);
        this.aantalZitjes = aantalZits;
        this.trekhaak = trekhaak;
    }
    
    public String heeftTrekHaak(){
        if(trekhaak){
            return "heeft trekhaak";
        } else {
            return "heeft geen trekhaak";
        }
    }

    @Override
    public String toString() {
        return "GezinsAuto \n" + super.toString()+"aantalZitjes= " + aantalZitjes + " " + heeftTrekHaak();
    }
    
    
    
    
    
    
    
}
