/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.typingtest;
import java.util.Random;
/**
 *
 * @author ethan
 */
public abstract class TypingTest {
    private String[] wordList;
    private Random random;
    
    public TypingTest(String[] wordList){
        this.wordList = wordList.clone();
        this.random = new Random();

    
    }
    
    protected String getRandomWord() {
        int index = random.nextInt(wordList.length);
        return wordList[index];
    }
    public abstract void start();
    
    public abstract void printReport();
}
