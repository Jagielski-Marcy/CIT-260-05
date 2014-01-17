/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package galtolit;

/**
 *
 * @author marcy
 */
class GalToLit {

    public static void main(String args[]) {
        double gallons; //variable to hold number of gallons
        double liters; //variable to hold number of liters
        gallons = 10;
        liters = gallons * 3.7854; //converts gallons to liters
        System.out.println(gallons + " gallons is " + liters + " liters.");
    }
    
}
