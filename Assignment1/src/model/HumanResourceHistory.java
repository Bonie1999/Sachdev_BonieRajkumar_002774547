/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

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

    public ArrayList<HumanResource> getEmployeeColumns(String colName, String searchValue) {
        System.out.println(colName);
        System.out.println(searchValue);
        ArrayList<HumanResource> searchedList = new ArrayList<>();
//        System.out.println(history);
        if(colName.equals("Id")){
//            System.out.println("Colname ID");
            int id = Integer.parseInt(searchValue);
            for(int i=0;i<history.size();i++){
                HumanResource hr = history.get(i);
                if(id == hr.getEmpId()){
                    searchedList.add(hr);
//                    System.out.println(searchedList);
                }
            }
        }else{
//            System.out.println("Colname other than ID");
            if(colName.equals("Name")){
                for(int i=0;i<history.size();i++){
                    HumanResource hr = history.get(i);
                    if(hr.getEmpFullName().equals(searchValue)){
                        searchedList.add(hr);
//                        System.out.println(searchedList);
                    }
                }
            }
            else if(colName.equals("Title")){
                for(int i=0;i<history.size();i++){
                    HumanResource hr = history.get(i);
                    if(hr.getEmpTitle().equals(searchValue)){
                        searchedList.add(hr);
//                        System.out.println(searchedList);
                    }
                }
            }else if(colName.equals("Phone no")){
                for(int i=0;i<history.size();i++){
                    HumanResource hr = history.get(i);
                    if(hr.getEmpPhNumber().equals(searchValue)){
                        searchedList.add(hr);
//                        System.out.println(searchedList);
                    }
                }
            }else if(colName.equals("Email")){
                for(int i=0;i<history.size();i++){
                    HumanResource hr = history.get(i);
                    if(hr.getEmpEmail().equals(searchValue)){
                        searchedList.add(hr);
//                        System.out.println(searchedList);
                    }
                }
            }else{
                JOptionPane.showMessageDialog(null, "Invalid column name entered. Please try again!");
            }
        }
        
        return searchedList;
    }
    
}
