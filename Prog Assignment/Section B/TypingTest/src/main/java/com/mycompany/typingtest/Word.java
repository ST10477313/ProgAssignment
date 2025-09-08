/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.typingtest;

/**
 *
 * @author ethan
 */
public class Word {
    private String content;
    private long timeTakenNano;
    
    public Word(String content, long timeTakenNano){
        this.content = content;
        this.timeTakenNano = timeTakenNano;
    }
    public String getContent(){
        return content;
    }
    public long getTimeTakenNano(){
        return timeTakenNano;
    }
}
