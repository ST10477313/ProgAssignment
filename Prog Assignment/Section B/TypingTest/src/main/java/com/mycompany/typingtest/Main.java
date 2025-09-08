/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.typingtest;

/**
 *Savitch, W.J (2014) Absolute Java 5th ed Pearson
 * Deitel, P.J & Deitel, H.M (2017) Java: How to Program 11th ed Pearson
 * @author ethan
 */
public class Main {
    public static void main(String[] args){
        String[] wordBank = {"apple", "banana", "computer", "java", "netbeans"};
        int rounds = 5;
        WordTypingTest test = new WordTypingTest(wordBank, rounds);
        test.start();
        test.printReport();
    }
    
}
