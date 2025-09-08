/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.typingtest;
import java.util.Scanner;

/**
 *
 * @author ethan
 */
public class WordTypingTest extends TypingTest{
    private Word[] results;
    
    public WordTypingTest(String[] wordList, int rounds){
        super(wordList);
        this.results = new Word[rounds];
    }
    @Override
    public void start(){
        Scanner scan = new Scanner(System.in);
        
        for (int i = 0; i < results.length; i++){
            String wordToType = getRandomWord();
            System.out.println("Round " + (i + 1) + ": Type this word -> " + wordToType);
            
            long startTime = System.nanoTime();
            String userInput = scan.nextLine();
            long endTime = System.nanoTime();
            
            long timeTaken = endTime - startTime;
            if (!userInput.equals(wordToType)){
                System.out.println("Incorrect! Expected: " + wordToType); 
            }
            results[i] = new Word(wordToType, timeTaken);
        }
    }
    @Override
    public void printReport(){
        System.out.println("\nTyping Speed Test Report");
        System.out.println("---------------------------------");
        
        long totalNano = 0;
        for (int i = 0; 1 < results.length; i++){
            Word w = results[i];
            double seconds = w.getTimeTakenNano() / 1_000_000_000.0;
            totalNano += w.getTimeTakenNano();
            System.out.printf("Round %d: \"%s\" in %.3f s%n",
                    i + 1, w.getContent(), seconds);
        }
        double avgSec = (totalNano / (double) results.length) / 1_000_000_000.0;
        System.out.printf("Average time: %.3f s%n", avgSec);
    }
    
    public String selectRandomWord(){
        return getRandomWord();
    }
    public Word[] getResults(){
        return results.clone();
    }
}