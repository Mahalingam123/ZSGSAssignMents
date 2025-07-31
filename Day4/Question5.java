/* 5. Create a class named Shape with a method that prints "This is a shape".
Create another class named Polygon inheriting the Shape class with the same method
that prints "Polygon is a shape". Create two other classes named Rectangle and
Triangle having the same method which prints "Rectangle is a polygon" and "Triangle
is a polygon" respectively. Again, make another class named Square having the same
method which prints "Square is a rectangle".
Now, try calling the method by the object of each of these classes.*/

class Shape{

    public void whatIsThis()
    {
        System.out.println("THIS IS SHAPE \n ");
    }

}
class  Polygon extends  Shape{

    public  void WhatIsThis()
    {
        System.out.println("THIS IS POLYGON \n");
    }

}

class Rectangle {


    public void WhatIsThis() {
        System.out.println("Rectangle is Polygon \n");
    }
}

class Triangle
{

    public void WhatIsThis() {
        System.out.println("Triangle is Polygon \n");
    }
}

class Square {

    public void WhatIsThis() {
        System.out.println("Square is a Rectangle \n");
    }

}


public class Question5 {

    public static void main(String[] args) {

        System.out.println("SHAPE OBJECT CALLING  ");

        Shape s=new Shape();

        s.whatIsThis();

        System.out.println("Polygon Object is Calling ");

        Polygon p=new Polygon();

        p.WhatIsThis();

        System.out.println("Rectangle Object is Calling ");

        Rectangle r=new Rectangle();

        r.WhatIsThis();

        System.out.println("Triangle Object is Calling ");

        Triangle t=new Triangle();

        t.WhatIsThis();

        System.out.println("Square Object is Calling ");

        Square sq=new Square();

        sq.WhatIsThis();


    }
}
