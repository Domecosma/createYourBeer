/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package createyourbeer;

/**
 *
 * @author michi
 */
public class Beer {
    
    String name;
    String taste;
    int quantity;
    String colour;
    
     public Beer(String name, String taste, String colour) {
        this.name = name;
        this.taste = taste;
        this.quantity = quantity;
        this.colour = colour;
    }
    
    
    public void yourBeer(double price) {
        System.out.println(String.format("The beer %s that tastes like %s and the colour is %s cost %.2f euro", name,taste,colour,price));
    }
}
