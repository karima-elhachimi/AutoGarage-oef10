/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oef_10;

import java.util.Collections;

/**
 *
 * @author Karima
 */
public class Oef_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SportAuto sport1;
        sport1 = new SportAuto(Merk.BMW, Type.COUPE, 254, 3842453234l, "FYI-324234-BE", 60);
        SportAuto sport2;
        sport2 = new SportAuto(Merk.KIA, Type.HATCHBACK, 100, 38443434l, "FYI-324234-BE", 100);
        
        GezinsAuto gezin1;
        gezin1= new GezinsAuto(Merk.BMW, Type.SEDAN, 1000, 384349234l, "FYI-324234-BE", 5, true);
        GezinsAuto gezin2;
        gezin2= new GezinsAuto(Merk.CITROEN, Type.HATCHBACK, 10, 35434l, "FYI-324234-BE", 4, false);
        
        Garage garage = new Garage();
        
        garage.addAuto(sport1);
        garage.addAuto(sport2);
        garage.addAuto(gezin1);
        garage.addAuto(gezin2);
        
        System.out.println(garage.printAutoLijst());
        Collections.sort(garage.autoLijst, Auto.KmStandComparator );
        System.out.println("na sorteren");
        System.out.println(garage.printAutoLijst());
        
    }
    
}
