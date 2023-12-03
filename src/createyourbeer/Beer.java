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
    
    public void yourBeer(String owner) {
        System.out.println("This beer is made by " + owner + ", the name is " + name + ", the colour is " + colour + " and it tastes like " + taste);
    }
}
