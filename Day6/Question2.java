/*2. Create a Java application that demonstrates the use of user-defined packages by organising 
classes based on their functionality:
--- arithmetic: This package should include a class that defines methods to perform the
 following operations on two numbers:
a. Addition
b. Subtraction
c. Multiplication
d. Division
e. Modulo
--- stringutils: This package should include a class that defines methods for:
a. Concatenating two strings
b. Reversing a string
c. Finding the length of a string
In your main class (outside those packages), import the above packages and
 demonstrate the usage of all the methods. */
import com.arithmetic.Arithmetic;

import com.String.StringOper;

 class PackageAccess{

    public static void main(String ...a){

      Arithmetic art=new Arithmetic();

      int x=100; int y=5;

      System.out.println("Addition = "+art.add(x,y));

      System.out.println("Substraction = "+art.sub(x,y));
      
      System.out.println("Division = "+art.divide(x,y));

      System.out.println("Multiplication = "+art.mul(x,y));

      System.out.println("Modular value = "+art.mod(x,y));

      System.out.println();

     String one="ZOHOCORP";

     String two="TARUVAI";

  
     StringOper str=new StringOper();

     System.out.println("Reverse String = "+str.rev(two));

     System.out.println("Concatation = "+str.concat(one ,two));

     System.out.println("Length = "+str.len(one));





    }

 }