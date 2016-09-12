package lab1.my.solution;

public class Startup {
    public static void main(String[] args) {
        //Must have a manager
        Manager hr = new Manager();

        //Manager hires employee      
        hr.hireEmployee();
        
        //Manager instructs employee to go through orientation procedures
        hr.orientEmployee();
        
        //Manager verifies that orientation is 100% done
        hr.checkNewHireStatus();
    }
    
    
}
