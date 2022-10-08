/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;



/**
 *
 * @author lenovo pc
 */
public class EmployeeProfileHistory {
    
    private ArrayList<EmployeeProfile> history; 
    
    public EmployeeProfileHistory(){
        this.history = new ArrayList<EmployeeProfile>(); 
    }

    public ArrayList<EmployeeProfile> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<EmployeeProfile> history) {
        this.history = history;
    }
    
    public EmployeeProfile addNewProfiles(){
        
        EmployeeProfile newProfile = new EmployeeProfile();
        history.add(newProfile);
        return newProfile;
        
    }
    
    /*public void addNewProfiles(EmployeeProfile emp){
        history.add(emp);
        
    }*/
    
    public void deleteProfile(EmployeeProfile ps){
        history.remove(ps);
        
    }
    
    

    /*public EmployeeProfile updateNewEmployee() {
        EmployeeProfile newEmployee = new EmployeeProfile();
        
        return newEmployee;
    }*/

    

    

    
}
