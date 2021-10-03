/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labb2;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Labb2 {

    static Scanner sc = new Scanner(System.in);
    static boolean yesOrNo = true;

    public static void main(String[] args) {
        System.out.println(" *** Welcome to Fixon AB's Employee Managment System! *** \n");
        
        while (yesOrNo) {
        try {
            Menu();
            yesOrNo = true;
        } catch (InputMismatchException exception) {
            System.out.println("ERROR! Invalid input. \n");
            sc.nextLine();
        }
        }
    }

    public static void Menu() {
        System.out.println("Please, select where you want to go: \n");
        System.out.println("1. Employee Managment \n2. Employee statistics \n3. Exit \n");
        int choice = sc.nextInt();

        while (yesOrNo) {

            switch (choice) {

                case 1:
                    Managment();
                    break;

                case 2:
                    Statistics();
                    break;

                case 3:
                    System.out.println("We are terminating the Employee Managment System!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("ERROR! Invalid number. ");
                    Menu();
            }
            Continue();
        }
    }

    public static void Managment() {
        System.out.println("Please, select what you want to do: \n");
        System.out.println("1. Register new Employee \n2. Fire Employee \n3. Update name of employee \n4. Update birthdate of employee ");
        System.out.println("5. Update department of employee \n6. Update salary of employee \n7. Search employee by name ");
        System.out.println("8. Search employee by ID \n9. Search employee by department \n10. Display all employees \n0. Back to the Menu");
        int choice = sc.nextInt();

        switch (choice) {
            case 0:
                Menu();
                break;
            case 1:
                //addEmployee();
                break;
            case 2:
                //removeEmployee();
                break;
            case 3:
                //updateName();
                break;
            case 4:
                //updateBirth();
                break;
            case 5:
                //updateDepartment();
                break;
            case 6:
                //updateSalary();
                break;
            case 7:
                //findSpecificEmployeeByName(String name);
                break;
            case 8:
                //findSpecificEmployeeByID(double employeeID);
                break;
            case 9:
                //findSpecificEmployeeByDepartment(String department);
                break;
            case 10:
                //showEmployees();
                break;
            default:
                System.out.println("Invalid number, please try again!");
                Managment();
        }
    }

    public static void Statistics() {
        System.out.println("Please, select what you want to see: \n");
        System.out.println("1. Average wage at the company \n2. Highest salary at the company \n3. Lowest salary at the company \n4. Total bonus ");
        System.out.println("5. Percentage of women employees \n6. Percentage of men employees \n0. Back to the Menu ");
        int choice = sc.nextInt();

        switch (choice) {
            case 0:
                Menu();
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            default:
                System.out.println("Invalid digit, please try again!");
        }
    }

    public static void Continue() {
        System.out.println("\nWould you like to go to the Managment System again? 1 = yes, 2 = no");
        int goOn = sc.nextInt();
        if (goOn == 1) {
            Menu();
        } else if (goOn == 2) {
            System.out.println("We are terminating the program!");
            System.exit(0);
        } else {
            Continue();
        }

    }

}
