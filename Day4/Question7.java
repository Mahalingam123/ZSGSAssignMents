/*‌
Create the following class hierarchy:
‌
--->BasicCalculator (Base class):
Implement at least three basic arithmetic methods, such as:
‌
--->add(int a, int b)
--->subtract(int a, int b)
--->multiply(int a, int b)
--->divide(int a, int b)
‌
--->AdvancedCalculator (Inherits from BasicCalculator):
Add 3 to 4 advanced mathematical operations, such as:
‌
--->power(int base, int exponent)
--->modulus(int a, int b)
--->squareRoot(double number)
‌
--->ScientificCalculator (Inherits from AdvancedCalculator):
Add scientific functions, such as:
‌
--->sin(double angle)
--->cos(double angle)
--->log(double value)
--->exp(double value)
* Demonstrate the use of inheritance by creating an object of ScientificCalculator and calling methods from all three levels of the class hierarchy.
* Use appropriate access specifiers and method overrides where required.
* Add a main() method to test all operations.*/

import java.util.Scanner;

class BasicCalculator
{

    public int add(int a,int b)
    {
        return a+b;
    }

    public int sub(int a,int b)
    {
        return a-b;
    }

    public  int  multiply(int a,int b)
    {
        return a*b;
    }

    public int divide (int a,int b)
    {
        return a/b;
    }

}
class AdvancedCalculator extends BasicCalculator
{
    public double power(int a,int base)
    {
        return Math.pow(a,base);
    }

    public double modulus(int a,int b)
    {
        return a%b;
    }

    public double squareRoot(double a)
    {
        return Math.sqrt(a);
    }

}

class ScientificCalculator extends AdvancedCalculator
{
    public  double sin(double a)
    {
        return Math.sin(a);
    }

    public double cos(double a)
    {
        return Math.cos(a);
    }

    public double log(double a)
    {
        return Math.log(a);
    }

    public double exp(double a)
    {
        return Math.exp(a);
    }

}



public class Question7 {
    public static void main(String[] args) {

        ScientificCalculator sci=new ScientificCalculator();

        Scanner scan=new Scanner(System.in);

        while (true) {

            System.out.println("Enter 1 for Addition");
            System.out.println("Enter 2 for Subtraction ");
            System.out.println("Enter 3 for Multiplication");
            System.out.println("Enter 4 for Division");
            System.out.println("Enter 5 for Power");
            System.out.println("Enter 6 for modulus ");
            System.out.println("Enter 7 for square root");
            System.out.println("Enter 8  for sin  calculation");
            System.out.println("Enter 9 for cos calculation");
            System.out.println("Enter 10 for log calculation");
            System.out.println("Enter 11 for exp Calculation");
            System.out.println("Enter 12 for exit");
            System.out.println("Enter a choice");
            int choice = scan.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter first number");

                    int num1 = scan.nextInt();

                    System.out.println("Enter Second number");

                    int num2 = scan.nextInt();

                    System.out.println("The Addition Value = " + sci.add(num1, num2));

                    break;
                case 2:
                    System.out.println("Enter first number");

                    int val1 = scan.nextInt();

                    System.out.println("Enter Second number");

                    int val2 = scan.nextInt();

                    System.out.println("The Subtraction Value = " + sci.sub(val1, val2)+"\n");

                    break;
                case 3:
                    System.out.println("Enter first number");

                    int value1 = scan.nextInt();

                    System.out.println("Enter Second number");

                    int value2 = scan.nextInt();

                    System.out.println("The Multiplication Value = " + sci.multiply(value1, value2)+"\n");

                    break;
                case 4:

                    System.out.println("Enter first number");

                    int nums1 = scan.nextInt();

                    System.out.println("Enter Second number");

                    int nums2 = scan.nextInt();

                    System.out.println("The Division Value = " + sci.divide(nums1, nums2)+"\n");
                    break;

                case 5:
                    System.out.println("Enter a base number");

                    int base = scan.nextInt();

                    System.out.println("Enter a exponent ");

                    int expo = scan.nextInt();

                    System.out.println("The Power value is = " + sci.power(base, expo)+"\n");

                    break;
                case 6:

                    System.out.println("Enter first number");

                    int vals1 = scan.nextInt();

                    System.out.println("Enter Second number");

                    int vals2 = scan.nextInt();

                    System.out.println("The Modulus Value = " + sci.modulus(vals1, vals2) +"\n");

                    break;
                case 7:
                    System.out.println("Enter a number");

                    double sqr=scan.nextDouble();

                    System.out.println("The sqrt value = "+sci.squareRoot(sqr));
                    break;

                case 8:
                    System.out.println("Enter a Number");

                    double a = scan.nextDouble();

                    System.out.println("The value  of sin calculation = " + sci.sin(a)+"\n");
                    break;
                case 9:
                    System.out.println("Enter a Number");

                    double b = scan.nextDouble();

                    System.out.println("The value  of cos calculation = " + sci.cos(b)+"\n");
                    break;
                case 10:
                    System.out.println("Enter a Number");

                    double l = scan.nextDouble();

                    System.out.println("The value  of sin calculation = " + sci.log(l)+"\n");
                    break;
                case 11:

                    System.out.println("Enter a Number");

                    double e = scan.nextDouble();

                    System.out.println("The value  of sin calculation = " + sci.exp(e)+"\n");
                    break;
                case 12:
                    System.exit(0);

                default:
                    System.out.println("Enter a Correct Choice "+"\n");
                    break;
            }


        }
    }

}
