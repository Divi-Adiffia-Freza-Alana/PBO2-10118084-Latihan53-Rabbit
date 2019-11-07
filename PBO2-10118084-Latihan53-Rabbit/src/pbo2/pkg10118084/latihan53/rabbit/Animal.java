/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118084.latihan53.rabbit;

/**
 *
 * @author Freza
 */
public class Animal {
    protected boolean vegetarian;
    protected String eats;
    protected int noOflegs;

    public Animal(boolean vegetarian, String eats, int noOflegs) {
        this.vegetarian = vegetarian;
        this.eats = eats;
        this.noOflegs = noOflegs;
    }
    
    public boolean isVegetarian(){
        return false;
    
    }
    public String getEats(){
        return "grass";
    
    }
    public int getNoOfLegs(){
        return 4;
    }
    
}
