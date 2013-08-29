/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritancepractice.abstract1;

/**
 *
 * @author Peter
 */
public class Startup {
    public static void main(String[] args) {
        Employee e1 = new HourlyEmployee("Peter", "Programmer", 19, 10.00, 40);
        Employee e2 = new SalaryPlusBonusEmployee("Jim", "Programmer", 24, 70000, 5000);
    }
}
