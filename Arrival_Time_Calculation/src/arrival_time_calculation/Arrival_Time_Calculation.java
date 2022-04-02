/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrival_time_calculation;

import java.util.Scanner;

/**
 *
 * @author Monster
 */
public class Arrival_Time_Calculation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int yol,saat;
        
        System.out.print("Enter the distance (km):");
        yol = scan.nextInt();
        System.out.print("Enter the time you want to go (time):");
        saat = scan.nextInt();
        
        System.out.println("Average speed you should go =" + (yol / saat) + "km/s dir.");
        // TODO code application logic here
    }
    
}
