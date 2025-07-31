/*1. Create a class named 'Student' with a string variable 'name' and 
an integer variable 'roll_no'. Assign the value of roll_no as '2' and that of name as 
"John" by creating an object of the class Student.*/


/*2. Create a class named Student that has the following attributes:
name (String)
roll_no (int)
phone_no (int)
address (String)
Create a constructor Student(String name, int roll_no, int phone_no, 
String address) and store and display the details for two students having names
 "Sam" and "John" respectively. */

import java.util.ArrayList;
import java.util.Scanner;

class Student{
    int rollNo;
    String name;
    String address;
    int phoneNo;

    Student(int rollNo,String name)
    {
      
        this.name=name;
        this.rollNo=rollNo;

    }
    
    Student(int rollNo,String name,String address,int phoneNo)
    {
       this.address=address;
       this.phoneNo=phoneNo;
        this.name=name;
        this.rollNo=rollNo;

    }

    public void display(Student s)
    {
      
      System.out.println("Address = "+s.address);

      System.out.println("Phone Number = "+s.phoneNo);

      System.out.println("Name = "+s.name);  

      System.out.println("RollNo = "+s.rollNo);

    }
}

class MainForStudent{
    public static void main(String []args)
    {
      Student stu=new Student(115,"jhon");  //Question 1
   
      Student stu2=new Student(116,"Madhan","Tirunelveli Taruvai",100000);

      Student stu3=new Student(117,"Mark","Tirunelveli Taruvai",12344);
 
       System.out.println("Student Detail");
      
      stu2.display(stu2);

      stu3.display(stu3);

    }
}


/*3. Write a Java program where you define a class named Employee. 
Inside the class, define fields to hold an employee’s name, employee ID, designation, and salary.
a. First, create a no-argument constructor that prints a message saying
 the object has been created, and sets default values for all the fields.
b. Write a parametrized constructor that allows you to set values for all
 the fields when an object is created.
c. Add another constructor — a copy constructor — that takes an existing
 employee object and creates a new one with the same values.
In the main method, create:
a. One object using the no-argument constructor,
b. One object using the parametrized constructor,
c. And a third object using the copy constructor.
Finally, display the details of all three employees. */

class Employee {
    String name;

    int eid;

    String designation;

    int salary;

    Employee()
    {
        System.out.println("The Object is Created");
    }

    Employee(String name,int eid,String designation,int salary)
    {
        this.name=name;

        this.designation=designation;

        this.eid=eid;

        this.salary=salary;
    }

    Employee(Employee e)
    {
     this.designation=e.designation;

     this.eid=e.eid;

     this.name=e.name;

     this.salary=e.salary;
    }

    public void display(Employee emp)
    {
    
        System.out.println("Employee Name = "+emp.name);

        System.out.println("Employee Id  = "+emp.eid);

        System.out.println("Employee Destination = "+emp.designation);

        System.out.println("Employee Salary = "+emp.salary);



    }

}

// Access Employee

class MainForEmployee
{
public static void main(String[] args) {
    
    Employee emp=new Employee();

    Employee emp1=new Employee("MADHAN", 20, "Tirunelveli", 100000);

    Employee emp2=new Employee("Karthik", 21, "Tirunelveli", 100000);

    Employee emp3=new Employee(emp1);

    emp1.display(emp1);

    emp.display(emp2);

    System.out.println("Copy Constructor");

    emp.display(emp3);
    
}
}
/*4. Design the Vehicle class that stores information 
about a vehicle such as its vehicle ID, brand name, and price, such
 that it can internally keep track of 
how many vehicles have been created so far, without requiring manual counting from outside the class. */

class Vehicle{
    int vehicleId;

    String brandName;

    int price;

    public Vehicle(int vehicleId,int price,String brandName)
    {
     this.brandName=brandName;

     this.price=price;

     this.vehicleId=vehicleId;

    }


}


class VehicleAccess{
    public static void main(String []args)
    {
      Scanner  scan=new Scanner(System.in);

    ArrayList<Vehicle> vehicles=new  ArrayList<>();
     

      while(true)
      {
        System.out.println();

          System.out.println("Type 'Add' for add and Type 'Exit' for exit");

        String option=scan.next();

        System.out.println();

        option=option.toLowerCase();

        switch (option) {
            case "add":
                
                 System.out.println("Enter Vehicle Id");
                 
                 int id=scan.nextInt();
                 
                 System.out.println("Enter a Vehicle Brand ");

                 String name=scan.next();

                 System.out.println("Enter a vehicle price");

                 int price=scan.nextInt();

                 Vehicle vehicle=new Vehicle(id,price,name);

                 vehicles.add(vehicle);
                
                 System.out.println("Added Successfully");

                break;

                case "exit":

                System.out.println("This count of car added = "+vehicles.size());
                 scan.close();
                return;
            default:
                
             System.out.println("You entered Wrong choice");
                break;
        }

      }
     
      
    }
}




 
/*5. Design a simple inventory system in Java using object-oriented principles that
 demonstrates the use of static variables and object containment.
‌
Create two classes:
---Store
---Product
‌
Requirements:
The Store class should have:
a. storeName and storeLocation as static variables since they are common to all products in the store.
b. A static method setStoreDetails(String name, String location) to initialize the static variables.
c. A static method displayStoreDetails() to print store details.
d. A list to maintain multiple Product objects (i.e., the store contains many products).
e. A method addProduct(Product product) to add products to the store.
f. A method displayAllProducts() to display details of all products.
‌
The Product class should have:
a. Product ID, name, price, and quantity as instance variables.
b. A constructor to initialize these fields.
c. A method displayProduct() to show product details.
‌
Task:
Implement the above classes and demonstrate their use in the main() method by:
a. Setting store details once.
b. Creating multiple product objects.
c. Adding them to the store.
d. Displaying store and product information.
‌
Also Check how many .class files are generated. */

class Product{

    int pid;

    String pName;

    int quantity;

    int price;


    Product(int pid,String pName,int price,int quantity)
    {
     this.pName=pName;

     this.pid=pid;

     this.quantity=quantity;

     this.price=price;

    }

    public static void display(Product p )
    {
        
        System.out.println("The Product Name = "+p.pName);
        
        System.out.println("The Product id = "+p.pid);

        System.out.println("The Product Price = "+p.price);

        System.out.println("The Product Quantity = "+p.quantity);
    }
}


class Store
{
    static String storeName;

    static String location;

    public void setNameLocation(String storeName,String location)
    {
       this.storeName=storeName;
       this.location=location;
    }

     public  void display( )
    {
        
        System.out.println("The Store Name = "+Store.storeName);
        
         System.out.println();

        System.out.println("The Store Locations  = "+Store.location);
    }

   static ArrayList<Product> product=new ArrayList<>();

    public void addProduct(Product pro)
    {
    
       product.add(pro);

       System.out.println("Added SuccessFully");

    }

    public void displayAllProduct(){

     for(int i=0;i<product.size();i++)
     {

        Product.display(product.get(i));
     }

    }

}

class InventryManagement
{
    public static void main(String []args){

      Store store=new Store();
 
      store.setNameLocation("ThePcShop", "Tirunelveli");
      
      Scanner scan=new Scanner(System.in);

      System.out.println("Enter how many Product want to add");

      int size=scan.nextInt();

      while(size-->0)
      {
        System.out.println("Enter Product Id");

        int pid=scan.nextInt();

        System.out.println("Enter Product Name");

        String name=scan.next();

        System.out.println("Enter Product Price");
   
        int price=scan.nextInt();

        System.out.println("Enter Product Quantity");

        int quantity=scan.nextInt();

        Product product =new Product(pid,name,price,quantity);

        store.addProduct(product);
      }

       store.display();

       System.out.println();

      store.displayAllProduct();

       scan.close();
    

    }
}




/*‌
6. Write a program that would print the information (name, year of joining, salary, address) of 
three employees by creating a class named 'Employee'. The output should be as follows:
Name Year of joining Address
Robert 1994 64C- WallsStreat
Sam 2000 68D- WallsStreat
John 1999 26B- WallsStreat
Can use format method to format the above said output. */

class EmployeeAndDetail
{
    int year;

    String name;

    String address;

    EmployeeAndDetail(int year,String name,String address){

     this.year=year;

     this.name=name;

     this.address=address;


    }

    public void display(EmployeeAndDetail e)
    {

    System.out.println(e.name +"  "+e.year+" "+e.address);

    }

    
}

class AccessEmployeeDetail{

    public static void main (String []args)
    {
        EmployeeAndDetail emp=new EmployeeAndDetail(1990, "sam", "68-WallStreet");

        EmployeeAndDetail emp1=new EmployeeAndDetail(1991, "jhon", "69-WallStreet");

        EmployeeAndDetail emp2=new EmployeeAndDetail(1992, "Robert", "68/2-WallStreet");


        emp.display(emp2);
        emp.display(emp);
        emp.display(emp1);




    }
}