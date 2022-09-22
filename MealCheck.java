/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package meal.check;
 import java.text.NumberFormat;
/**
 *
 * @author ikoro
 */
public class MealCheck {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int  cost = 45;
        double grossPay, tax = 0.08*cost;
        double tip = 0.10*cost;
        grossPay = (cost + tax + tip);
        
        /*"cost" is basic cost or original price of meal. grossPay is just the total cost of the meal inlcuding the tip and taxes.
        the point of this code is for it to be used to calculate meal costs and make a printed receipt to the customer*/
        
        System.out.println ("basic cost: $" + cost); 
        System.out.println ("tax computed: $" + tax);
        System.out.println ("tip added: $" + tip);
        System.out.println ("final amount is: $" + grossPay);
              
    }
    
}
