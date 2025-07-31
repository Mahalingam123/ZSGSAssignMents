//Write a code to illustrate the various scope of variables(static, local, instance, block, final variables)?

import java.util.Scanner;

public class Scopes
{
	int instanceVariable;
	
	static int staticVariable=34;  
	
	
	public static void main(String[]args){
		
		
		final int finalVariable=10;
		
		 {
			int blockVariable=21;
		 }
		
		if(true)
		{
			int localVariable=21;
		}
		
	}
}

//2. Write a program in which, declare all data types like integer, double, float, long integer, character and byte data and print them.

class DeclereVariable{

public static void main(String[] args)
{

 byte byteVariable=23;
 
 System.out.println("byteVariable ="+byteVariable);
 
 short shortVariable=100;
 
 System.out.println("shortVariable = "+shortVariable);
 
 int integerVariable=200;
 
 System.out.println("integerVariable ="+integerVariable);
 
 long longVariable=341232;
 
 System.out.println("localVariable ="+longVariable);
 
 float floatVariable=3.14f;
 
 System.out.println("finalVariable ="+floatVariable );
 
 double doubleVariable=3.232332;
 
 System.out.println("doubleVariable ="+doubleVariable);
 
 boolean booleanVariable=true;
 
 System.out.println("booleanVariable ="+booleanVariable);
 
 char charVariable='A';
 
 System.out.println("charVariable ="+charVariable);

}

}

//3. Write a program to find the maximum of two numbers using ternary operator.

class Maximum{
public static void main(String[]args)
{
	int value_1=50;
	
	int value_2=60;
	
	System.out.println( (value_1>value_2)?value_1:value_2);
	
}
}

//4. Write a program to check whether the given two numbers are equal or not w/o using comparison operator?

class CheckEqual
{

public static void main(String[]args)
	{
		int value_1=50;

        int value_2=5;
		
		int xor=  (value_1^value_2);
		
		boolean[]arr=new boolean[xor+1];
		
		arr[xor]=true;
		
		if(arr[0])
 {
      System.out.println("Equals");
}	
else{
	  System.out.println("NotEquals");
}
	}
		
}

//5. Write a program that illustrate the execution order of static block and initializer block?

class Execution{
	
	int value;
	
	static{
		System.out.println("Welcome");
	}
	
	  {
		value=40;
		
		}
	public static void main(String[]args)
	{
		Execution exe=new Execution();
		
		System.out.println(exe.value);
	}
}

//7. Write a program to check if a number is a power of 2?

class PowerOfTwo{
	
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter a num");
		
		int n=scan.nextInt();
		
		while(n%2==0)
		{
	     n=n/2;		
		}
		
		System.out.println(n==1?"It's Power of two":"Not power");
	}
}

//8. Write a program to find the first set bit of a number?

class SetBit{
	
	public static void main(String []args)
	{
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter a number");
		
		int n=scan.nextInt();
		
		 String s="";
    
        while(n>0)
    {
        int res=n%2;
        
        s+=res;
        
        n/=2;
    }
    
       for(int i=0;i<s.length();i++)
    
    {
        if(s.charAt(i)=='1')
        {
            System.out.println(i+"");
            break;
        }
    }
		
		
	}
}

/*9. Write a class Employee with attributes empId, name, department and salary and define a parametrized 
constructor Employee(int empId, String name, String department, double salary) and assign these variables 
to instance variables accordingly and display them?*/


class Employee {
	int empId;
	String name;
	String department;
	int salary;
	
	Employee(int empId,String name,String department,int salary)
	{
		this.empId=empId;
		this.name=name;
		this.department=department;
		this.salary=salary;
	}
	
	public void display(Employee e)
	{
	
    System.out.println("Employee name ="+e.name);

    System.out.println("Employee id ="+e.empId);

   System.out.println("Employee department ="+e.department);

    System.out.println(" Employee salary ="+e.salary);
	
	}
	
}

class Access{
	
	public static void main(String []args)
	{
		Employee emp=new Employee(001,"Madhan","CSE",100000);
		
		emp.display(emp);
	}
	
	
}
//10. Write a program to check whether the object is an instance of a particular class?

  

class CheckInstance{
	
	public static void main(String []args)
	{
		Employee emp=new Employee(001,"Madhan","CSE",100000);
		
		if(emp instanceof Employee)
		{
			System.out.println("YES");
		}
		else{
			System.out.println("No");
		}
	}
	
	
}




