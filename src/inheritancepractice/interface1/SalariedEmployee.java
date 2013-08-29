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
public class SalariedEmployee implements Employee{
    String name;
    String position;
    int age;
    int salary;
    
    public SalariedEmployee(String name, String position, int age, int salary) {
        this.name = name;
        this.position = position;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    
    
    public int getSalary() {
        return this.salary;
    }
}
