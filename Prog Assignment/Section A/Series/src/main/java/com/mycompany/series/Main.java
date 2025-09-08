/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.series;
import java.util.Scanner;
/**Savitch, W.J (2014) Absolute Java 5th ed Pearson
 * Deitel, P.J & Deitel, H.M (2017) Java: How to Program 11th ed Pearson
 *
 * @author ethan
 */
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        menuLoop:
        while(true) {
            System.out.println("LATEST SERIES - 2025");
            System.out.println("**************************************");
            System.out.println("Enter 1 to launch menu or any other key to exit:");
            
            String launch = scan.nextLine().trim();
            if (!"1".equals(launch)){
                System.out.println("Exiting application...");
                break;
            }
            while (true){
                System.out.println("\nPlease select one of the following menu items:");
                System.out.println("(1) Capture a new series.");
                System.out.println("(2) Search for a series.");
                System.out.println("(3) Update series information.");
                System.out.println("(4) Delete a series.");
                System.out.println("(5) Print series report - 2023");
                System.out.println("(6) Exit");
                System.out.println("Enter choice: ");
                
                String choice = scan.nextLine().trim();
                switch (choice) {
                    case "1" -> Series.captureSeries();
                    case "2" -> Series.searchSeries();
                    case "3" -> Series.updateSeries();
                    case "4" -> Series.deleteSeries();
                    case "5" -> Series.seriesReport();
                    case "6" -> {
                        break;
                    }
                    default -> System.out.println("Invalid choice. Please select 1-6.");
                }
                
                System.out.println("\nEnter 1 to return to menu or any other key to exit: ");
                if (!"1".equals(scan.nextLine().trim())){
                    break;
                }
            }
        }
        scan.close();
    }
    
}
