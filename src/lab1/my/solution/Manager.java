/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1.my.solution;

import java.text.SimpleDateFormat;

/**
 *
 * @author Mike
 */
public class Manager {
    private Employee e1;
    
    public void hireEmployee(String fname, String lname, String ssn){
        e1 = new Employee(fname, lname, ssn);
    }
    
    public void orientEmployee(){
        e1.doOrientation("1378");
    }
   
    //Report New Hire Orientation status
    public void checkNewHireStatus() {
        if (e1.isMetDeptStaff() && e1.isMetDeptStaff() && e1.isReviewedDeptPolicies() && e1.isMovedIn()){
            System.out.printf("Orientation was completed on: %s\n", e1.getDate());
        } else {
            System.out.printf("%s: Orientation in progress...\n", e1.getDate());
        }
    }
}
