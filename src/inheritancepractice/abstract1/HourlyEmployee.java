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
public class HourlyEmployee extends Employee{
    double wage;
    int numhours;
    
    public HourlyEmployee(String name, String position, int age, double wage, int numhours) {
        super(name, position, age);
        this.wage = wage;
        this.numhours = numhours;
    }
    
    public double calcEmployeePay() {
        return this.wage * this.numhours;
    }
}
