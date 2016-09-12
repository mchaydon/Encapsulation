package lab1.my.solution;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee {
    private String firstName;
    private String lastName;
    private String ssn;
    private Date birthDate;
    private boolean metWithHr;
    private boolean metDeptStaff;
    private boolean reviewedDeptPolicies;
    private boolean movedIn;
    private String cubeId;
    private Date currentDate;

    //Constructor
    public Employee(String firstName, String lastName, String ssn) {
        currentDate = new Date();
        setFirstName(firstName);
        setLastName(lastName);
        setSsn(ssn);
    }
    
    //Method that runs all the orientation processes
    public void doOrientation(String cubeId){
        meetWithHrForBenefitAndSalaryInfo();
        meetDepartmentStaff();
        reviewDeptPolicies();
        moveIntoCubicle(cubeId);
    }
    
    //Orientation Tasks
    public void meetWithHrForBenefitAndSalaryInfo() {
        SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy");
        String fmtDate = sdf.format(currentDate);
        System.out.println("Met with HR on " + fmtDate);
        metWithHr = true;
    }

    public void meetDepartmentStaff() {
        if(metWithHr) {
            SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy");
            String fmtDate = sdf.format(currentDate);
            System.out.println("Met with department staff on " + fmtDate);
            metDeptStaff = true;
        } else {
            System.out.printf("Sorry, you cannot meet with\ndepartment staff until you have met with HR.\n");
        }
    }

    public void reviewDeptPolicies() {
        if(metWithHr && metDeptStaff) {
            SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy");
            String fmtDate = sdf.format(currentDate);
            System.out.println("Reviewed department policies on " + fmtDate);
            reviewedDeptPolicies = true;
        } else {
            System.out.printf("Sorry, you cannot review\ndepartment policies until you have first met with HR\nand then with department staff.\n");
        }
    }

    public void moveIntoCubicle(String cubeId) {
        if(metWithHr && metDeptStaff && reviewedDeptPolicies) {
            SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy");
            String fmtDate = sdf.format(currentDate);
            System.out.println("Moved into cube " + cubeId + " on " + fmtDate);
            this.cubeId = cubeId;
            this.movedIn = true;
        } else {
            System.out.println("Sorry, you cannot move in to a\ncubicle until you have first met with HR\nand then with department staff, and then reviewed\ndepartment policies.\n");
        }
    }

    public String getDate(){
        SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy");
        return sdf.format(currentDate);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        //Needs validation to make sure a string and not vulgar
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        //Needs validation to make sure a string and not vulgar
        this.lastName = lastName;
    }

    public String getSsn() {
        return ssn;
    }
    
    private void setSsn(String ssn) {
        //needs validation
        this.ssn = ssn;
    }
    
    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        //Needs validagtion to make sure date
        this.birthDate = birthDate;
    }

    public boolean isMetWithHr() {
        return metWithHr;
    }

    public boolean isMetDeptStaff() {
        return metDeptStaff;
    }

    public boolean isReviewedDeptPolicies() {
        return reviewedDeptPolicies;
    }

    public boolean isMovedIn() {
        return movedIn;
    }

    public String getCubeId() {
        return cubeId;
    }

    public Date getCurrentDate() {
        return currentDate;
    }  
}
