/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package createyourbeer;

/**
 *
 * @author michi
 */
public class CreateYourBeer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Create your own beer");
        

        Beer beer1 = new Beer("Dark Angel", "Raspberry and Lemon", "Dark");
        beer1.yourBeer("Domenico");


        
        Beer beer2 = new Beer("Crocodile", "Lime", "ligth green");
        beer2.yourBeer(4.50);

        
        Beer beer3 = new Beer("Ghost", "Lime", "White");
        beer3.yourBeer("Patrick");
        
        
        Beer beer4 = new Beer("Black heart", "Coffee", "Dark");
        beer4.yourBeer(6.00);



        
        


    }
    
}
