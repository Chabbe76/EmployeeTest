/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labb2;

/**
 *
 * @author nikol
 */
public class Secretaries extends Employee {
    
    public Secretaries (double employeeID, String name, double salary, String gender, double birth, String department) {
        super(employeeID, name, salary, gender, birth, department);
    }    

    public double calculateBonus(String salary) { // polymorphism
        int bonus = 0; //här ska koden för bonus finnas
        
        return bonus;
    }
}
