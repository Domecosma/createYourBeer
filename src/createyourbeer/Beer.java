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

    public Beer(String dark_Angel, String raspberry_and_Lemon, String dark) {
    }
    
    String name;
    String taste;
    int quantity;
    String colour;
    

    
    public void yourBeer(double price) {
        System.out.printf("The beer %s that tastes like %s and the colour is %s cost %.2f euro", name,taste,colour,price);
    }
    public void yourBeer(String owner) {
        System.out.println("This beer is made by " + owner + ", the name is " + name + ", the colour is " + colour + " and it tastes like " + taste);

    }
}
