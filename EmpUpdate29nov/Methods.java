/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labb2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author nikol
 */
//behövs det läggas in return på alla metoder för att de ska kunna skickas till huvudklassen Labb2?
public class Methods extends Employee {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Employee> employees = new ArrayList<>();

    public Methods(double employeeID, String name, double salary, String gender, double birth, String department) {
        super(employeeID, name, salary, gender, birth, department);
    }

    public static void addEmployee() {
        
        System.out.println("\nEnter the following details to ADD list:\n");
        System.out.println("Enter ID :");
        double employeeID = sc.nextDouble();
        System.out.println("Enter name :");
        String name = sc.nextLine();
        System.out.println("Enter birthdate: DDMMYY :");
        double birth = sc.nextDouble();
        System.out.println("Enter gender: M or F:");
        String gender = sc.nextLine();
        System.out.println("Enter monthly salary :");
        double salary = sc.nextDouble();
        System.out.println("Enter departmant:");
        String department = sc.nextLine();

        Employee employee = new Employee(employeeID, name, gender, birth, salary, department);
        employees.add(employee);
        System.out.println("Employee is saved.");
    }

    public static void findSpecificEmployeeByID(double employeeID) {  // här kan vi lägga in en exception om user input är ID som inte finns i systemet?
        System.out.println("Enter ID for Employee:");
        employeeID = sc.nextDouble();
        sc.nextLine();

        int i = 0;
        for (Employee e : employees) {
            if (employeeID == e.getEmployeeID()) {
                System.out.println(e + "\n");
                i++;
            }
        }
        if (i == 0) {
            System.out.println("\nEmployee Details are not available. Please enter a valid ID!");
            //här kanske lägga in att den ska loopa eller bara stoppa in findSpecificEmployeeID
        }
    }

    public static void findSpecificEmployeeByName(String name) {
        System.out.println("Enter name of Employee:");
        name = sc.nextLine();

        int i = 0;
        for (Employee e : employees) {
            if (name == e.getName()) {
                System.out.println(e + "\n");
                i++;
            }
        }
        if (i == 0) {
            System.out.println("\nEmployee Details are not available, Please enter a valid name!");
        }
    }

    public static void findSpecificEmployeeByDepartment(String department) {
        System.out.println("Enter the department of Employee:");
        department = sc.nextLine();

        int i = 0;
        for (Employee e : employees) {
            if (department == e.getDepartment()) {
                System.out.println(e + "\n");
                i++;
            }
        }
        if (i == 0) {
            System.out.println("\nEmployee Details are not available, Please enter a valid name!");
        }
    }

    public static void removeEmployee(String name) {  // KOM TILLBAKA FÖR ATT LÖSA! Behövers det parameter ? Om ja, behövs det till andra metoder?
        System.out.println("Enter name of the employee");
        name = sc.nextLine();

        for (int i = employees.size() - 1; i >= 0; i--) {

            if (employees.get(i).getName().equalsIgnoreCase(name)) {
                employees.remove(employees.get(i));
                System.out.println("The employee is now removed from the database.");

            }

        }
    }

    public static void updateName() {  // Är den okej?
        System.out.println("Enter ID for the employee:");
        double id = sc.nextDouble();
        sc.nextLine();
        for (Employee employee : employees) {

            if (employee.getEmployeeID() == id) {
                System.out.println("Enter name for the employee:");
                String name = sc.nextLine();
                employee.setName(name);
                System.out.println("Employee information is updated");

            }

        }

    }

    public static void updateBirth() {
        System.out.println("Enter ID for the employee:");
        double id = sc.nextDouble();
        sc.nextLine();
        for (Employee employee : employees) {

            if (employee.getEmployeeID() == id) {
                System.out.println("Enter birthdate as DDMMYY for the employee:");
                double birth = sc.nextDouble();
                employee.setBirth(birth);
                System.out.println("Book is updated");

            }

        }
    }

    public static void updateDepartment() {
        System.out.println("Enter ID for the employee:");
        double id = sc.nextDouble();
        sc.nextLine();
        for (Employee employee : employees) {

            if (employee.getEmployeeID() == id) {
                System.out.println("Enter department for the employee:");
                String department = sc.nextLine();
                employee.setDepartment(department);
                System.out.println("Book is updated");

            }

        }
    }

    public static void updateSalary() {
        System.out.println("Enter ID for the employee:");
        double id = sc.nextDouble();
        sc.nextLine();
        for (Employee employee : employees) {

            if (employee.getEmployeeID() == id) {
                System.out.println("Enter the monthly salary for the employee:");
                double salary = sc.nextDouble();
                employee.setSalary(salary);
                System.out.println("Book is updated");

            }

        }
    }

    public static void showEmployees() {
        System.out.println("\nEmployee List with \n");
        System.out.println(String.format("%-10s%-15s%-10s%-20s%-10s", "ID", "Name", "salary", "gender", "department"));

        for (Employee showAll : employees) {
            System.out.println(String.format("%-5s%-20s%-10s%-15s%-10s", showAll.getEmployeeID(), showAll.getName(), showAll.getGender(), showAll.getDepartment(), showAll.getDepartment()));
        }
    }
}
