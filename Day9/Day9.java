/*1. Program to check if person is eligible to vote or not. */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.rmi.StubNotFoundException;
import java.util.*;

class AgeCheck {

public static void main(String...args)
{

Scanner scan=new Scanner(System.in);

System.out.println("Enter Your Age ");

int age=scan.nextInt();

  try{
  
  if(isValid(age))
  {
   System.out.println("Your Valid ");
  }

   }
 catch(Exception e)
   {

System.out.println("Your Not Eligible\n\n");

e.printStackTrace();
   
   }

}

public static boolean isValid(int age)
{

if(age<18) {

throw new ArithmeticException("Not Eligible");

}

return true;

}

}
// Question 1 part 2 question
/*int[] arr = {2, 5, 1, 4, 0, 7};
int quotient = arr[7] / arr[4];
Develop a Java program which handles any unexpected situations that may arise during execution.

*/

class UnExpected {

    public static  void main(String ...args)
    {
        int[]arr={2,5,1,4,0,7};

        try {
            int quotient = arr[7] / arr[4];
        }
        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic Exception Handled");
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexBounds Exception Handled");
        }
        catch (Exception e)
        {
            System.out.println("All Exception Solved");
        }

    }

}

/*2. Demonstrate multiple catch blocks: accept two numbers as strings, then convert
 them to integers, and perform division, and catch the following exceptions: InputMismatchException,
NumberFormatException, ArithmeticException and Exception.*/


class MultipleBlock {

    public static  void main(String ...args)
    {
       Scanner scan=new Scanner(System.in);

        try {
            System.out.println("Enter a String 1");

            String s1=scan.nextLine();

            System.out.println("Enter a String 2");

            String s2=scan.nextLine();

            int a= Integer.parseInt(s1)/Integer.parseInt(s2);


        }
        catch (InputMismatchException e)
        {

            System.out.println("Input Mismatch Exception Handled");

        }
        catch(ArithmeticException e)
        {

            System.out.println("Arithmetic Exception Handled");

        }
        catch (NumberFormatException  e)
        {

            System.out.println("Number Format Exception Handled");

        }
        catch (Exception e)
        {

            System.out.println("All Exception Solved");
        }

    }

}

/*3. Write a program to illustrate how to throw a ClassNotFoundException.*/

class ClassNotException {

    public static void main(String[] args) {

     try {
         if (!loads("className.com")) {
             System.out.println("ClassNotFoundException");
         }
     } catch (ClassNotFoundException e) {

         e.printStackTrace();

     }
    }

    private static boolean loads(String className)  throws ClassNotFoundException{

        Class.forName(className);

        return true;
    }

}

/*4. Write a method to parse a string to an integer. Throw an exception if the string is not a valid number. Handle it using try-catch.*/

class Parse {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Enter a String 1");

        String s1= scan.nextLine();


        try{
            System.out.println(  stringToInt(s1));
        }
        catch(NumberFormatException e){

            System.out.println("Catches NumberFormat Exception");

            e.printStackTrace();
        }

    }
    public static int stringToInt(String s) {

        int result=0;  int k=1;

        for(int i=s.length()-1;i>=0;i--)
        {
            if(s.charAt(i)>57||s.charAt(i)<48)
            {
                throw  new NumberFormatException("Plz Give Number, this is not a number  " +s);
            }

          result+=k*(s.charAt(i)-48);

            k*=10;

        }

       return result;
    }
}

/*5. Create a program where try block contains a return statement.
Ensure that finally block executes before the method returns. Show this with output.*/

class FinallyFirst{
    public static void main(String[] args) {

        System.out.println(division(10,0));

    }
    public static int division(int a,int b){

        try{
            a=a/b;

            return  a;
        }
        catch (ArithmeticException e)
        {
            System.out.println("An Exception Happen \n");
        }
        finally {
            System.out.println("Finally is Still Executed");

            System.exit(0);
        }

        return a;
    }

}

/*6. Write a Java program to accept a 4-digit ATM PIN from the user and validate whether it meets the following conditions:
--->It must be exactly 4 digits long.
--->It should contain only numeric characters.
--->It must not start with 0.
Display an appropriate message whether the PIN is valid or invalid.*/

class ValidateAtmPin{
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Enter a Pin");

         String s=scan.nextLine();

        System.out.println(isValid(s)?"It is Valid pin ":"Not a valid pin");

    }
    public static boolean isValid(String s)
    {
        if(s.length()>4||s.charAt(0)=='0'){
            return false;
        }

        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)>57||s.charAt(i)<48)
            {
                return false;
            }
        }

        return true;

    }
}
/*7. Write a Java program that shows exception propagation
across multiple methods (method1 calls method2 calls method3,
 which throws the exception). Handle the exception in method1.*/

class ExceptionPropagation {
    public static void main(String[] args) {
     method1();
    }
    public static void method1()
    {
        System.out.println("Method 1 calling \n");

        method2();
    }
    public static void method2()
    {
        System.out.println("Method 2 calling \n");

       try {
           method3();
       }
       catch (IOException e)
       {
           System.out.println("Catches Successfully");
       }
    }
    public static void method3() throws  IOException
    {
        System.out.println("Method 3 throws Exception \n");

        throw new IOException("Method Throws Exception");
    }

}

/*8. Design a login system that throws AuthenticationException if the username or
 password is incorrect. Handle it and display a login failure message.*/
class User{
    private String email;

    private String pass;


    User(String email,String pass)
        {
            this.email=email;

            this.pass=pass;
        }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}


class Login{

    public static void main(String[] args) {

        User user=null;

        Scanner scan=new Scanner(System.in);

        while(true) {

            System.out.println("Enter 1 for Register");

            System.out.println("Enter 2 for Login");

            System.out.println("Enter 3 for Exit ");

            System.out.println("Enter choice");

            int choice = scan.nextInt();

            scan.nextLine();

            switch (choice) {
                case 1:

                    if (user != null) {

                        System.out.println("Already Registered \n");

                        break;
                    }

                    System.out.println("Enter  email ");

                    String email = scan.nextLine();

                    System.out.println("Enter  Password");

                    String password = scan.nextLine();


                    user = new User(email, password);

                    break;
                case 2:

                    if (user == null) {
                        System.out.println("Register first \n");
                        break;
                    }

                    System.out.println("Enter  email ");

                    String email1 = scan.nextLine();

                    System.out.println("Enter  Password");

                    String password2 = scan.nextLine();

                    try {

                        if (isValidate(email1, password2, user)) {

                            System.out.println("Login SuccessFully \n");

                        }
                    } catch (Exception e) {
                        System.out.println(e.getMessage() + "\n");

                        e.printStackTrace();
                    }

                    break;

                case 3:
                    System.exit(0);

                default:
                    System.out.println("Enter a correct Choice \n");
                    break;
            }

        }
    }

    public static  boolean isValidate(String email,String pass,User user) throws Exception
    {
        if(email.equals(user.getEmail())&&pass.equals(user.getPass()))
        {
            return true;
        }
        else{
            throw new Exception("Enter Correct User Name Password \n");
        }


    }

}

/*9. Create a method to read a file from disk. Handle FileNotFoundException and IOException using try-catch-finally.*/

class ReadFile {

    public static void main(String[] args) {

        try {
           readFile("./Question.txt");
        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());

            e.printStackTrace();
        }
    }

    public static void readFile(String pathFile) throws IOException
    {
        BufferedReader bf=new BufferedReader(new FileReader(pathFile));

        String line=bf.readLine();

        System.out.println(line +"\n");

        while(line!=null)
        {
            line=bf.readLine();

            System.out.println(line +"\n");
        }

    }

}

/*10. Write a Java program to manage a voting system where a person must be at
 least 18 years old to be eligible to vote. Use a custom exception to handle the scenario
 when an ineligible person tries to register for voting.
 Display appropriate messages for eligible and ineligible voters*/


class VotingSystem{

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter name");

        String name =sc.nextLine();

        System.out.println("Enter Your Age ");

        int age= sc.nextInt();

        try {

            if (isValid(age)) {

                System.out.println( name+" You  Eligible for Voting and Registered SuccessFully");

            }
        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());

            e.printStackTrace();

        }

    }
    public static boolean isValid(int age) throws IOException
    {

        if(age<18) {

            throw new IOException("Your  Not Eligible");

        }

        return true;

    }

}