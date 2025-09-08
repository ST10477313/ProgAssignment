/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.series;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *This class contains a representation of TV series's that are managed
 * It makes use of object-oriented principles such as encapsulation, constructors and static methods
 * References:
 * Savitch, W.J (2014) Absolute Java 5th ed Pearson
 * Deitel, P.J & Deitel, H.M (2017) Java: How to Program 11th ed Pearson
 *
 * @author ethan
 */
public class Series {
    //Priavte fields are created for encapsulation 
    private String seriesId;
    private String seriesName;
    private int ageRestrictions;
    private int numberOfEpisodes;
    
    
    public static ArrayList<Series> seriesList = new ArrayList<>();
    private static Scanner scan = new Scanner(System.in);
    
    
    public Series(String seriesId, String seriesName, int ageRestriction, int numberOfEpisodes) {
        this.seriesId   = seriesId;
        this.seriesName = seriesName;
        this.ageRestrictions = ageRestriction;
        this.numberOfEpisodes = numberOfEpisodes;
    }
    
    public static void captureSeries(){
        System.out.println("\nCAPTURE A NEW SERIES");
        System.out.println("********************");
        
        System.out.println("Enter the series id: ");
        String id = scan.nextLine().trim();
        
        System.out.println("Enter the series name: ");
        String name = scan.nextLine().trim();
        
        int age;
        while (true) {
            System.out.println("Enter the series age restriction: ");
            String input = scan.nextLine().trim();
            try {
                age = Integer.parseInt(input);
                if (age >= 2 && age <= 18){
                    break;
                }
            } catch (NumberFormatException ignored) {}
            System.out.println("You have entered a incorrect age!!!"
                    + "Please re-enter series age");
                
        }
        int episodes;
        while (true) {
            System.out.println("Enter the number of episodes: ");
            String input = scan.nextLine().trim();
            try {
                episodes = Integer.parseInt(input);
                if (episodes > 0){
                    break;
                }
            } catch (NumberFormatException ignored) {}
            System.out.println("Please enter a valid positive number:");
        
        }
        seriesList.add(new Series(id, name, age, episodes));
        System.out.println("Series processed successfully!!!");
    }
    public static void searchSeries(){
        System.out.println("\nEnter the series Id to search: ");
        String id = scan.nextLine().trim();
        
        for(Series s : seriesList){
            if (s.seriesId.equals(id)){
                System.out.println("\nSeries Title: "     +s.seriesName);
                System.out.println("Series Age Restriction: "       + s.ageRestrictions);
                System.out.println("Series Number of Episodes: "      +s.numberOfEpisodes);
                return;
            }
        }
        
        System.out.println("Series with Id: " + id + "was not found!");
    }
    
    public static void updateSeries() {
        System.out.println("\nEnter the series Id to update: ");
        String id = scan.nextLine().trim();
        
        for (Series s : seriesList) {
            if(s.seriesId.equals(id)){
                System.out.println("\nSeries Title: "     +s.seriesName);
                System.out.println("Series Age Restriction: "       + s.ageRestrictions);
                System.out.println("Series Number of Episodes: "      +s.numberOfEpisodes);
                
                System.out.println("Enter new series name: ");
                s.seriesName = scan.nextLine().trim();
                
                while (true){
                    System.out.println("Enter the series age restriction: ");
                    String input = scan.nextLine().trim();
                    try {
                        int age = Integer.parseInt(input);
                        if (age >= 2 && age <=18){
                            s.ageRestrictions = age;
                            break;
                        }
                    } catch (NumberFormatException ignored) {}
                    System.out.println("You have entered an incorrect age!!!"
                            + "Please re-enter the series age restriction:");
                }
            }
            while (true) {
                System.out.println("Enter new number of episodes: ");
                String input = scan.nextLine().trim();
                try{
                    int eps = Integer.parseInt(input);
                    if (eps > 0) {
                        s.numberOfEpisodes = eps;
                        break;
                    }
                } catch (NumberFormatException ignored){}
                System.out.println("Please enter valid positive number");
            }
            System.out.println("Series updated sucessfully!");
            return;
        }   
          System.out.println("Series with Id: " + id + " was not found!");  
    }
    public static void deleteSeries(){
        System.out.println("\nEnter the series Id to delete: ");
        String id = scan.nextLine().trim();
        
        for (Series s : seriesList){
            if(s.seriesId.equals(id)){
                System.out.println("Are you sure you want to delete Series Id: "
                + id + "from the system? Yes(y) to delete: ");
                String confirm = scan.nextLine().trim();
                if (confirm.equalsIgnoreCase("y")){
                    seriesList.remove(s);
                    System.out.println("Series with Id: "+ id + " WAS deleted!");
                    
                }
                return;
            }
            
        }
        
        System.out.println("Series with Id "+ id + " was not found!");
        
    }
    public static void seriesReport(){
        System.out.println("\n SERIES INFORMATION");
        System.out.println("------------------");
        
        if (seriesList.isEmpty()){
            System.out.println("No series avaiable.");
        }
        for(Series s : seriesList){
            System.out.println("SERIES ID: "       + s.seriesId);
            System.out.println("SERIES NAME: "     + s.seriesName);
            System.out.println("SERIES AGE RESTRICTION: "        + s.ageRestrictions);
            System.out.println("NUMBER OF EPISODES: "        + s.numberOfEpisodes);
            System.out.println("");
            
        }
    }
    
    
}


