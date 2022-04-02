/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculate_rectangle;
import java.util.Scanner;

/**
 *
 * @author Monster
 */
public class Calculate_Rectangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println(" enter the long side ");
        int a = s.nextInt();
        
        System.out.println(" enter the small side ");
        int b = s.nextInt();
        
        System.out.println("Area : " + a*b);
        System.out.println("Perimeter : "+ (a*2)+(b*2));
        
        // TODO code application logic here
    }
    
}
