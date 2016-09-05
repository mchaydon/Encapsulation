package lab1.my.solution;

import java.util.Scanner;

public class Startup {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String fname = input.nextLine();
        System.out.print("Enter your last name: ");
        String lname = input.nextLine();
        System.out.print("Enter your SSN: ");
        String ssn = input.nextLine();
        
        
        
        Manager hr = new Manager();
        
        
        
        hr.hireEmployee(fname, lname, ssn);
        System.out.printf("\n\n%s %s Report\n", fname, lname);
        hr.orientEmployee();
        hr.checkNewHireStatus();
    }
    
    
}
