/*3. Create a Java application to manage employees in a company. Define an abstract
class
 Employee with a method calculateSalary(). Then create two subclasses FullTimeEmployee
 and
 PartTimeEmployee that override calculateSalary() method based on their working type.
  Demonstrate
 runtime polymorphism by calling calculateSalary() on different types of employees
 using the Employee
  reference.
*/

public abstract class Employee {

  abstract   public double calculateSalary(double oneDaySalary);

}

class PartTimeEmployee extends Employee
{
    @Override
    public double calculateSalary(double oneDaySalary) {
        return 26*oneDaySalary;
    }
}

class FullTimeEmployee extends Employee
{
    @Override
    public double calculateSalary(double oneDaySalary) {
        return 20*oneDaySalary;
    }
}

class MainEmployee{
    public static void main(String[] args) {
        Employee  emp=new FullTimeEmployee();

        System.out.println("Full time Employee Salary  = "+emp.calculateSalary(2000));

        Employee  emp1=new PartTimeEmployee();

        System.out.println("Full time Employee Salary  = "+emp.calculateSalary(500));

    }
}
