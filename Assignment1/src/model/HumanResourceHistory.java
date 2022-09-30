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
    
    public HumanResource addNewEmpDetails(){
        
        HumanResource newEmployee = new HumanResource();
        history.add(newEmployee);
        return newEmployee;
    }
    public HumanResource updateEmpDetails(int rowIndexPoint, HumanResource hr){
        
//        HumanResource updateEmployee = new HumanResource();
//        System.out.println(hr);
        history.set(rowIndexPoint, hr);
//        System.out.println(hr);
        return hr;
    }

    public void deletedetails(HumanResource hr) {
        history.remove(hr);
    }
    
}
