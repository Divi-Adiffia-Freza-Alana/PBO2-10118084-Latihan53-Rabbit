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
public class Rabbit extends Animal {
private String color;
private String name;


    public Rabbit(String color, String name, boolean vegetarian, String eats, int noOflegs) {
        super(vegetarian, eats, noOflegs);
        this.color = color;
        this.name = name;
    }

  
    



    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }


}
