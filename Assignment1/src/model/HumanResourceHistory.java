/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author hp
 */
public class HumanResourceHistory {
    
    private ArrayList<HumanResource> history;
    
    public HumanResourceHistory(){
        this.history = new ArrayList<HumanResource>();
    }

    public ArrayList<HumanResource> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<HumanResource> history) {
        this.history = history;
    }
    
    
}
