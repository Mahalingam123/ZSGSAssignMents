/*2. Construct a base class called twoD contains x and y and methods to
 read and write the x and y. Create another class called threeD which is
 derived from twoD and also contains z and write methods to read and write z.
  Also write a method to find the distance of two threeD Points.
sqrt((x2-x1)^2+(y2-y1)^2+(z2-z1)^2)
In main:
Create one ThreeD object using the default constructor.
Use the setters to set x, y, and z.
Create the second ThreeD object using the constructor with three arguments.
in the TwoD class:
Add a cout statement to the TwoD default constructor with a message "TwoD default
constructor"
Add a cout statement to other TwoD constructor with a message "TwoD constructor with
 two arguments"*/

 class twoD {

    int x;

    int y;

    public twoD()
    {
        System.out.println("TwoD  Default Constructor \n");

    }

    public twoD(int x,int y)
    {
        this.x=x;

        this.y=y;

        System.out.println("TwoD  constructor with 2 parameter \n");
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }


}

class threeD extends twoD
{
    int z;

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public threeD(){

        System.out.println("ThreeD  Default Constructor \n");
    }


    public threeD(int x,int y,int z) {

        super(x,y);

        this.z = z;

        System.out.println("ThreeD  constructor with 3 parameter \n");
    }

    public  double distance(threeD d1,threeD d2)
    {
        return Math.sqrt(Math.pow(d2.x-d1.x,2)+Math.pow(d2.y-d1.y,2)+Math.pow(d2.z-d1.z,2));
        //sqrt((x2-x1)^2+(y2-y1)^2+(z2-z1)^2)
    }
}

public class Question2
{
public static void main(String ...args)
{
 twoD d=new twoD();

 twoD d1=new twoD(10,20);

 threeD v=new threeD();

 threeD v1=new threeD(5,10,20);

 threeD v2=new threeD(10,20,30);

    System.out.println( v.distance(v1,v2));
}

}


