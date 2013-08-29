/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritancepractice.concrete;

/**
 *
 * @author Peter
 */
public class SalaryPlusBonusEmployee extends Employee{
    int salary;
    int bonus;
    
    public SalaryPlusBonusEmployee(String name, String position, int age, int salary, int bonus) {
        super(name, position, age);
        this.salary = salary;
        this.bonus = bonus;
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
