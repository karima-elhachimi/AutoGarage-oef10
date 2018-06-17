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
public class SportAuto extends Auto {
    
    private int pk;
    
    public SportAuto( Merk merk,Type type, int kmStand, long chassisnummer, String nummerplaat, int pk) {
        super( merk,type, kmStand, chassisnummer, nummerplaat);
        this.pk = pk;
    }

    @Override
    public String toString() {
        return "SportAuto: \n " + super.toString()+ "pk= " + pk;
    }
    
    
}


