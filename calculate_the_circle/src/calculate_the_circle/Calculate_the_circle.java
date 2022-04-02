/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculate_the_circle;
import java.util.Scanner;

/**
 *
 * @author Monster
 */
public class Calculate_the_circle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int pi=3;
        
        System.out.println("Enter the radius : ");
        
        int radius = s.nextInt();
        
        System.out.println(pi*radius*2 + " circumference of the circle ");
        // TODO code application logic here
    }
    
}
