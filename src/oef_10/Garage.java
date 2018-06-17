/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oef_10;

import java.util.ArrayList;

/**
 *
 * @author Karima
 */
public class Garage {
    
    public ArrayList<Auto> autoLijst;
    
    public Garage(){
        autoLijst = new ArrayList<>();
    }
    
    public void addAuto(Auto auto){
        autoLijst.add(auto);
    }
    
    public String printAutoLijst(){
        String lijst = "Alle auto's: \n";
        
        lijst = autoLijst.stream().map((auto) -> auto.toString() +"\n").reduce(lijst, String::concat);
        
        return lijst;
    }
}

