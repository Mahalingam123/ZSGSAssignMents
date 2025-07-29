/* . Create a Java application to manage employees in a company.
Define an Interface Employee
with a method calculateSalary(). Then create two subclasses FullTimeEmployee
and PartTimeEmployee
that override calculateSalary() method based on their working type. Demonstrate
 runtime polymorphism
by calling calculateSalary() on different types of employees using the
Employee reference.*/

interface EmployeeInterface {

       double calculateSalary(double oneDaySalary);

}

class PartTimeEmployeeInterface implements EmployeeInterface
{
    @Override
    public double calculateSalary(double oneDaySalary) {
        return 26*oneDaySalary;
    }
}

class FullTimeEmployeeInterface implements EmployeeInterface
{
    @Override
    public double calculateSalary(double oneDaySalary) {
        return 20*oneDaySalary;
    }
}

class MainEmployeeInterface{
    public static void main(String[] args) {
        EmployeeInterface  emp=new FullTimeEmployeeInterface();

        System.out.println("Full time Employee Salary  = "+emp.calculateSalary(2000));

        EmployeeInterface  emp1=new PartTimeEmployeeInterface();

        System.out.println("Full time Employee Salary  = "+emp.calculateSalary(500));

    }
}

