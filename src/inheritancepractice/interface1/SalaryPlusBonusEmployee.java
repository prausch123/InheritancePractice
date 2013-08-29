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
public class SalaryPlusBonusEmployee implements Employee{
    String name;
    String position;
    int age;
    int salary;
    int bonus;
    
    public SalaryPlusBonusEmployee(String name, String position, int age, int salary, int bonus) {
        this.name = name;
        this.position = position;
        this.age = age;
        this.salary = salary;
        this.bonus = bonus;
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
    
    
    
    public int getSalary(){
        return this.salary;
    }
    
    public int getSalaryAndBonus() {
        return this.salary + this.bonus;
    }
    
    public int getBonus() {
        return this.bonus;
    }
}
