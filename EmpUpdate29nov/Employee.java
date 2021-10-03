
package labb2;
import java.util.Scanner;

    public class Employee {
    private double employeeID;
    private String name;
    private double salary;
    private String gender;
    private double birth; 
    private String department;
    
    static Scanner sc = new Scanner(System.in);
    
    
    public Employee(double employeeID, String name, double salary, String gender, double birth, String department) {  // Constructor
        this.employeeID = employeeID;
        this.name = name;
        this.salary = salary;
        this.gender = gender;
        this.birth = birth;
        this.department = department;
      
    }

    public double getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(double employeeID) {
        this.employeeID = employeeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getBirth() {
        return birth;
    }

    public void setBirth(double birth) {
        this.birth = birth;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

}
