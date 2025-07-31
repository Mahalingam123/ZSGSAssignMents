/*3. Create a Java application to manage employees in a company. Define a base 
class Employee with a method calculateSalary(). Then create two subclasses FullTimeEmployee 
and PartTimeEmployee that override 
calculateSalary() method based on their working type. */

import java.util.Scanner;

class Employee
 {
    int empId;
    String empName;
   

    public Employee(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
        
    }

    public  double calculateSalary(){

       return 1.0;
    }

}

class FullTimeEmployee extends Employee{
       
   double  dailySalary;

    FullTimeEmployee(int empId, String empName, double dailySalary){
        super(empId,empName);

        this.dailySalary=dailySalary;
    }

    public double calculateSalary(){
    
     return  dailySalary*30;
    }

}

class PartTimeEmployee extends Employee{
       
     double  dailySalary;

    PartTimeEmployee(int empId, String empName, double dailySalary){

        super(empId,empName);
        
        this.dailySalary=dailySalary;
    }

     public double calculateSalary()
     {
    
     return  dailySalary*15;
    }

}

class AccessEmp{
    public static void main(String ...arg){


     while(true){

     Scanner scan =new Scanner(System.in);

     System.out.println("Enter a Daily Salary ");

     int dailySalary =scan.nextInt();

     System.out.println("Enter Employee Id ");

     int empId=scan.nextInt();

     scan.nextLine();

     System.out.println("Enter a Your Name");

     String name=scan.nextLine();

    System.out.println("Enter 1.For Full Time Employee");

    System.out.println("Enter 2.For part Time Employee");

    System.out.println("Enter 3 for Exit");

    System.out.println("Enter Choice");

    int choice=scan.nextInt();

    switch (choice) {
        case 1:
        FullTimeEmployee full=new FullTimeEmployee(empId, name, dailySalary);

        System.out.println("Your Monthly Salary = "+ full.calculateSalary());

        System.out.println();
          break;
        case 2:
            PartTimeEmployee part=new PartTimeEmployee(empId, name, dailySalary);

           System.out.println("Your Monthly Salary = "+ part.calculateSalary());
           System.out.println();
            break;
        case 3:
            System.exit(0);
            break;   

        default:
         System.out.println("Enter Correct Choice");
            break;
    }

     }

    }
}
