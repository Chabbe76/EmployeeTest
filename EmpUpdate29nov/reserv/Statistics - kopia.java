package labb2;

import java.util.Collections;
import static labb2.Methods.employees;

/**
 *
 * @author nikol
 */
public class Statistics extends Employee {

    public Statistics(double employeeID, String name, double salary, String gender, double birth, String department) {
        super(employeeID, name, salary, gender, birth, department);
    }

    public void averageSalary() {  // COME BACK AND GET IT DONE
        int total = 0;
        int avg;
        for (int i = 0; i < employees.size(); i++) {
            //total = total + employees.get(i); // här är total en int, medan employees är ..annat datatyp?
        }
        avg = total / employees.size();
        System.out.println("The Average IS:" + avg);
    }

    public void highestSalary(double salary) {
        //System.out.println("The highest salary is: " + Collections.max(employees));
    }

    public void lowestSalary(double salary) {
        //System.out.println("The lowest salasy is: " + Collections.min(employees));
    }

    public void totalBonus() {

    }

    public void women() {
        double sum = 0;

        System.out.println("The percentage of women is:" + sum);
    }

    public void men() {
        int sum = 0;
        System.out.println("The percentage of men is:" + sum);

    }
}
