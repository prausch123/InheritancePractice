/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritancepractice.abstract1;

import inheritancepractice.concrete.*;

/**
 *
 * @author Peter
 */
public class SalariedEmployee extends Employee{
    int salary;
    
    public SalariedEmployee(String name, String position, int age, int salary) {
        super(name, position, age);
        this.salary = salary;
    }
    
    public int getSalary() {
        return this.salary;
    }
}
