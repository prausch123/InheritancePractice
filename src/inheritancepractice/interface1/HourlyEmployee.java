/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritancepractice.interface1;

import inheritancepractice.concrete.*;

/**
 *
 * @author Peter
 */
public class HourlyEmployee implements Employee{
    String name;
    String position;
    int age;
    double wage;
    int numhours;
    
    public HourlyEmployee(String name, String position, int age, double wage, int numhours) {
        this.name = name;
        this.position = position;
        this.age = age;
        this.wage = wage;
        this.numhours = numhours;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public int getAge() {
        return age;
    }

    public double getWage() {
        return wage;
    }

    public int getNumhours() {
        return numhours;
    }
    
    
    
    public double calcEmployeePay() {
        return this.wage * this.numhours;
    }
}
