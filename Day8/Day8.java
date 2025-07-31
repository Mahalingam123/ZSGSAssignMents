

/* 1. Illustrates with an example of using Singleton class.*/

import java.util.*;

class  Methods{

    private Methods(){}

    public int add(int a,int b)
    {
        return a+b;
    }

    private static Methods m=null;

    public static Methods obj(){
        if(m==null)
        {
            m=new Methods();
        }

        return m;
    }

}

class Singleton{
    public static void main(String[] args) {

        Methods m=Methods.obj();

        System.out.println(m.add(10,12));

        Methods m1=Methods.obj();  // Same Object Returns

        System.out.println(m1.add(12,12));
    }
}

/* 2. Develop a Java program which illustrates the usage of Comparator Interface.*/

class StudentC{
    int rollno;
    String name;
    int age;

    public StudentC(int rollno, String name, int age) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }
    public String toString()
    {
        return "Name = "+this.name+" RollNo = "+this.rollno+"  Age = "+this.age+"\n";
    }
}


class StudentComparator implements Comparator<StudentC>
{

    @Override
    public int compare(StudentC o1, StudentC o2)
    {
        return Integer.compare(o1.age, o2.age);
    }


}

class StudentName implements Comparator<StudentC>
{

    @Override
    public int compare(StudentC o1, StudentC o2)
    {
        return o1.name.compareTo(o2.name) ;
    }


}

class MainComparator {

    public static void main(String[] args) {


        StudentC s=new StudentC(123,"Madhan",21);

        StudentC s1=new StudentC(121,"Karthik",22);

        StudentC s2=new StudentC(167,"Seeni",23);

        StudentC s3=new StudentC(101,"Doss",21);

        ArrayList<StudentC> stu=new ArrayList<>();

        stu.add(s);
        stu.add(s1);
        stu.add(s2);
        stu.add(s3);
        Collections.sort(stu, new StudentComparator());
        System.out.println(stu);
        Collections.sort(stu,new StudentName());
        System.out.println(stu);

    }

}

 //3. Develop a Java program which illustrates the usage of Comparable Interface.

class Student4 implements  Comparable<Student4>{

      String name;

      String password;


    public Student4(String name, String password) {
        this.name = name;

        this.password = password;

    }

    public int  compareTo(Student4 a)
    {
       return  this.name.compareTo(a.name);
    }

    public String toString()
    {
        return "Name = "+this.name+" Password = "+this.password+"\n";
    }

}

class MainComparable{

    public static void main(String[] args) {

        ArrayList<Student4 > stu=new ArrayList<>();

        Student4 s=new Student4("Madhan","12345");
        Student4 s1=new Student4("Kathilk","12545");
        Student4 s2=new Student4("Anbu","12545");
        stu.add(s);
        stu.add(s1);
        stu.add(s2);

        Collections.sort(stu);

        System.out.println(stu);

    }

}



/*4. Get some strings through the command-line prompt and use an array to store and
 display them.*/

class StrFromCommand{

    public static void main(String[] args) {

        for(String a:args)
        {
            System.out.println(a);
        }

    }

}

/* 5. Write a program to illustrate the usage of clone() and find out what
  kind of copy it will make.*/

class Copy implements Cloneable{

    String  name;

    String pass;

    public Copy(String name, String pass) {

        this.pass = pass;

        this.name = name;

    }

    public   Object  clone() throws CloneNotSupportedException
    {
        return super.clone();
    }

}

class Clone {
    public static void main(String[] args) throws  CloneNotSupportedException{

        Copy c=new Copy("Madhan","pass");

        System.out.println(c.name +"  Original Object name  \n");

        Copy d= (Copy) c.clone();

        System.out.println(d.name+" Clone Object name  \n");

    }
}




/* 6. Develop a Java program to illustrate pass-by-value.*/

class PassBy{
    public static void main(String[] args) {

        int x=100;

        System.out.println(x +" First Value ");

        change( x);


        System.out.println(x +"  After Calling ");

    }

    public static void change(int x)
    {
        x+=100;

    }

}

//7. Develop a Java program to illustrate the usage of toString() method.

class ToString{

     String name;

     String pass;

    public ToString(String name, String pass) {

        this.name = name;

        this.pass = pass;
    }

    public String toString()
     {
         return  name +" "+pass;

     }

}

class AccessitString {
    public static void main(String[] args) {

        ToString t=new ToString("madhan","1234");

        System.out.println( t.toString());

    }
}

/*8. Write a Java program to demonstrate the concept of object cloning using
 the clone() method.

 --->Create a class Student with fields like name, rollNo, and department.

 --->Attempt to clone an object of this class using the clone() method.

 --->Catch and handle the CloneNotSupportedException if thrown.

 ***Also find out and explain why the class must implement the
 Cloneable interface to avoid CloneNotSupportedException.

 -->Your program should clearly illustrate:

 a. What happens if Cloneable is not implemented

 b. How the error is resolved by implementing Cloneable*/

class Student {

    private String name;

    private int rollNo;

    private String department;

    public Student(String name, int rollNo, String department)
    {

        this.name = name;

        this.rollNo = rollNo;

        this.department = department;

    }

    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department)
    {
        this.department = department;
    }

}

class AccessStudent{

    public static void main(String[] args) {

        Student s=new Student("Madhan",112,"123");

        try {

            Student s1 = (Student) s.clone();

        }
        catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }

    }

}