/*3. A class Point is declared as follows:
class Point{
public:
Point(){int=0;int=0;} //default constructor
void setPoint(int,int); //set coordinates
int getX() const {return x;} //get x coordinates
int getY() const {return y;} //get y coordinates
void printPoint(); // print (x,y) coordinates
private int x;
private int y;
};
Write the implementation of the class Point in the same file.
Then, declare a class called Circle that is derived from the class Point.
The class Circle has public member functions Circle (constructor), setRadius(),
getRadius() and area() and one private data member radius. The class Circle indirectly
uses private member x and y of class Point to store the coordinate of the center of
the circle. The class Circle also checks to make sure the radius value is a positive
number, otherwise it is set to default value 1.
Note: The private members of class Point can only be indirectly accessed by class Circle
using public methods of class point.
Implement the class Circle and write a driver program to test the class Circle. An example
of the output of the driver program is.
Enter x: 2
Enter y: 2
Enter radius: 1
Circle center is (2,2)
Radius is 1
Area is 3.14*/

import java.util.Scanner;

class Point{

    private int x;

    private int y;

    public Point()
    {
        this.x=0;

        this.y=0;
    }

   public int getX()
   {
       return x;
   }

   public int getY(){

        return y;

   }

   public void setPoint(int x,int y)
   {
       this.x=x;

       this.y=y;
   }



}

class Circle extends Point{

    private double radius;


    public double getRadius()
    {
        return radius;
    }

    public void setRadius(double radius)
    {
        this.radius = radius;
    }

    public Circle(double radius){

        if(radius<=0)
        {
            radius=1;
        }

        this.radius=radius;
    }

    public double area(double r)
    {
        return Math.PI*(r*r);
    }

    public String getCenter(){
        return "The center of circle is (" +super.getX()+","+super.getY()+")";
    }

}

public class Question3 {


    public static void main(String [] args)
    {

        Scanner scan=new Scanner(System.in);

        System.out.println("Enter X");

        int x=scan.nextInt();

        System.out.println("Enter Y");

        int y=scan.nextInt();

        System.out.println("Enter Radius ");

        double r=scan.nextDouble();

        Circle c=new Circle(r);

        c.setPoint(x,y);

        System.out.println( c.getCenter());

        System.out.println("Radius = "+c.getRadius());



    }
}
