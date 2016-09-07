package lab1.my.solution;

import java.util.Scanner;

public class Startup {
    public static void main(String[] args) {
        //Must have a manager
        Manager hr = new Manager();
        
        //Manager asks questions to hire employee
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String fname = input.nextLine();
        System.out.print("Enter your last name: ");
        String lname = input.nextLine();
        System.out.print("Enter your SSN: ");
        String ssn = input.nextLine();
        
        //Manager hires employee      
        hr.hireEmployee(fname, lname, ssn);
        System.out.printf("\n\n%s %s Report\n", fname, lname);
        
        //Manager conducts orientation procedures
        hr.orientEmployee();
        
        //Manager verifies that orientation is 100% done
        hr.checkNewHireStatus();
    }
    
    
}
