/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1.my.solution;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Mike
 */
public class Manager {
    private Employee e1;
    //Manager has a list of open cubicles
    private String[] emptyCubes = {"A101", "A237", "A447", "A492", "A999"};
    Random rand = new Random();

    
    //Manager hires employee
    public void hireEmployee(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String fname = input.nextLine();
        System.out.print("Enter your last name: ");
        String lname = input.nextLine();
        System.out.print("Enter your SSN: ");
        String ssn = input.nextLine();
        System.out.printf("\n");
        
        e1 = new Employee(fname, lname, ssn);
    }
    
    //Manager starts orientation and gives cubeID
    public void orientEmployee(){
        e1.doOrientation(emptyCubes[rand.nextInt(5)]);
    }
    
    //Report New Hire Orientation status
    public void checkNewHireStatus() {
        if (e1.isMetDeptStaff() && e1.isMetDeptStaff() && e1.isReviewedDeptPolicies() && e1.isMovedIn()){
            System.out.printf("Orientation was completed on %s\n", e1.getDate());
        } else {
            System.out.printf("%s: Orientation in progress...\n", e1.getDate());
        }
    }
}
