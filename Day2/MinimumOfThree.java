//1. Write a program that uses if statement to find the minimum of three numbers.
import java.util.Scanner;

import java.util.Arrays;


public class MinimumOfThree
{
 public static void main (String [] args)
 {
  
 Scanner scan=new Scanner(System.in);
 
 System.out.println("Enter a value");
 
 int value_1=scan.nextInt();

 System.out.println("Enter a value");
 
 int value_2=scan.nextInt();

 System.out.println("Enter a value");
 
 int value_3=scan.nextInt();
 
 if(value_1<value_2&&value_1<value_3)
 {
	 System.out.println("value 1 is small");
 }
 else if(value_1>value_2&&value_3<value_2)
 {
	 System.out.println("Value 3 is smmall");
 }
 else
 {
	 System.out.println("value 2 is small");
 }
 
 
 }
}

/*2. Write a program to do the following patterns using for loop?
a)   R R R R
     R     R
     R R R R
     R   R
     R     R

 */

 class RPattern{
	public static void main(String[]args)
	{

		
		Scanner scan=new Scanner(System.in);

        System.out.println("Enter a size");

		int n=scan.nextInt();

        int a=(n/2)+1;

		for(int i=1;i<=n;i++)
		{
        
			for(int j=1;j<=n;j++)
			{
             if(i==1||i==a)
			 {
				System.out.print("R");
				continue;
			 }

			 if(j==1||j==n&&i<a||i>a&&j==i)
			 {
				System.out.print("R");

			 }
             else{
				System.out.print(" ");
			 }

			}
			System.out.println();
		}


	}
 }

 /*    
 1   1
   1
 1   1
 
 */  

 class XPattern
 {
	public static void main(String[]args)
	{
   
		Scanner scan=new Scanner(System.in);

         System.out.println("Enter a size");

		int n=scan.nextInt();


    for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=n;j++)
		{
			if(i==j||j==(n-i)+1)
			{
				System.out.print("1");
			}
			else{
				System.out.print("  ");
			}
		}
		System.out.println();
	}

	}
 }







//3. Write a program to do the following patterns using while loop?

//Diamond pattern 

class Pattern
{
	public static void main(String[]args)
	{
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter a size");
		
		int size=scan.nextInt();
		
		int i=1,a=0,cnt=1;
		
		do
		{
			int j=1,space=1;
			
			if(i>(size/2)+1)
			{
				a--;
		
			}
			else{
				a=i;
			}
			
			while(space<=Math.abs(((size/2)+1)-i))
			{
				System.out.print(" ");
				space++;
			}
			
			while(j<=a)
			{  
				 System.out.print((cnt++)+" ");  
			  
				j++;
			}
			System.out.println();
		i++;
		}while(i<=size);
	}
}
//b w   Pattern
 



class PatternB
{
	public static void main(String[]args)
	{
		
		int size=5;
		
		int i=1,a=0;
		
		while(i<=size)
		{
			int j=1;
			
			if(i>(size/2)+1)
			{
				a--;
			}
			else{
				a=i;
			}
			
			while(j<=a)
			{  
				 System.out.print("w ");  
			  
				j++;
			}
			System.out.println();
		i++;
		}
	}
}
 


/*  4. Write a program to do the following patterns using do...while loop?
a) Pascal Triangle
b)ZOHO
CORP
ORAT
IONS */

class Pascal {
	
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter a size");
		
		int size=scan.nextInt();
		
		int i=1;  int j=1;
		
		do{
		 for(int k=1;k<=size-i;k++)
		 {
          System.out.print(" ");
		  
		 }
		 int c=1; j=1;
        while(j<=i)
		{
           System.out.print(c+" ");
		   
		   c=c*(i-j)/j;
		   
		   j++;
		}			
			
		System.out.println();
		i++;
		}while(i<=size);
		
		
	}
	
}

/*  
b)ZOHO
CORP
ORAT
IONS
*/  

class QuestionB{

public static void main(String[]args)
{
	Scanner scan=new Scanner(System.in);
	
	System.out.println("Enter a String");
	
	String str=scan.next();
	
	int size= (int) Math.sqrt(str.length());
	int i=0;
	
	while(i<str.length())
	{
		for(int k=0;k<size&&i<str.length();k++)
		{
    	System.out.print(str.charAt(i++));     
	    	 
		}
		
		System.out.println();
		
	}
}

}
//5. Define a method to find the sum of even numbers from the series 1, 2, 3, 4, 5, ...n using continue statement.

class SumOFEven{
	
	public static void main(String[]args)
	{
	Scanner scan=new Scanner(System.in);
	
	System.out.println("Enter num range");

    int n=scan.nextInt();

   int sum=sumOfEven(n);
    
		System.out.println("Sum of All Even num ="+sum);
		
	}
	public static int sumOfEven(int n)
	{
		int sum=0;
		
      for(int i=1;i<=n;i++)
      {
	     if(i%2==1)
	   {
		   continue;
	   }
	   
	   sum+=i;
      }	 
return sum;	  
	}
	
	
}

//6. Define a method to convert the decimal number to a binary number?

 class ConvertDecimalToBinary
 {
	 public static void main(String[]args)
	 {
		 Scanner scan=new Scanner(System.in);
		 
		 System.out.println("Enter a number ");
	     
		 int n=scan.nextInt();
		 
		 System.out.println("Binary Num  of "+n+" =" +toBinary(n));
	 }
	 
	 public static String toBinary(int n)
	 {
    
      String result="";

     while(n>0)
	 {
      result=result+(n%2);
       n/=2;	  
	 }	 
	 
	 return result;
	 
	 }
	 
 }
 
 /* 7. Use both if and switch case statement  as two ways to find the grade of a student.
Percent>=85 && Percent<=100 Grade ‘A’
Percent>=70 Grade ‘B’
Percent>=50 Grade ‘C’
otherwise print ”Fail”*/

//IfOnly
 
 class GradeCalcIf
 {
   public static void main(String[]args)
   {
    Scanner scan=new Scanner(System.in);
	
	System.out.println("Enter a mark");
	
	int mark=scan.nextInt();
	
	if(mark>=85&&mark<=100)
	{
		System.out.println("A");
	}
	else if(mark<85&&mark>=70)
	{
		System.out.println("B");
	}
	else if(mark<70&&mark>=50)
	{
		System.out.println("C");
	}
	else{
		System.out.println("Sorry Your Fail");
	}
	
   }	   
 }
 
 //SwitchOnly
 
 class GradeCheckSwitch{
	 
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter a mark");
	
	    int mark=scan.nextInt();
		
		int cnt=0;
		
		if(mark>=85&&mark<=100)
	     {
		cnt=1;
	      }
	     else if(mark<85&&mark>=70)
	    {
		cnt=2;
	     }
	    else if(mark<70&&mark>=50)
	   {
		cnt=3;
	   }
		
		
		switch(cnt)
		{
			case 1:
			
			System.out.println("A");
			
			break;
			
			case 2:
			
			System.out.println("B");
			
			break;
			
			case  3:
			
			System.out.println("C");
			
			break;
			
			default:
			
			System.out.println("Sorry Your Fail");
              
            break;			  
		}
	}		
	 
	 
 }
 
 //PART TWO QUESTIONS DAY 2
 //1. Write a program that creates an integer array of 10 elements, accepts values of arrays and Find the sum of all odd numbers.
 
 class SumOfArray
 {
	 public  static void main(String[] args)
	 {
		 int[]arr=new int[10];
		 
		 Scanner scan=new Scanner(System.in);
		 
		 for(int i=0;i<arr.length;i++)
		 {
			 System.out.println("Enter "+(i+1)+" Value");
			 arr[i]=scan.nextInt();
		 }
		 
		 int sum=0;
		 
		   for(int i=0;i<arr.length;i++)
		 {
			 if(arr[i]%2==1)
			 {
				 sum+=arr[i];
			 }
		 }
		 
		 System.out.println("Odd sum ="+sum);
		 
	 }
 }
 //2. Write a program to take in 10 values and print only those numbers which are prime.
 
 class PrimeOnly{
	 
  public  static void main(String[] args)
	 {
		 int[]arr=new int[10];
		 
		 Scanner scan=new Scanner(System.in);
		 
		 for(int i=0;i<arr.length;i++)
		 {
			 System.out.println("Enter "+(i+1)+" Value");
			 arr[i]=scan.nextInt();
		 }
		 
		 
		   for(int i=0;i<arr.length;i++)
		 {
			 if(isPrime(arr[i]))
			 {
				System.out.println(arr[i]);
			 }
		 } 
	 }
	 public static boolean isPrime(int n)
	 {
		 for(int i=1;i<=Math.sqrt(n);i++)
		 {
			 if(n%i==0)
			 {
				 return false;
			 }
		 }
		 return true;
	 }
 }
 
 
 //3. Write a program which generates 30 terms of Fibonacci no in an array and then prints it.
 
 class Fibonacci{
	 public static void main(String[]args)
	 {
		 int first=0;
		 
		 int second=1;
		 
		 System.out.print(first+" ");
		 
		 System.out.print(second+" ");
		 
		 for(int i=2;i<=30;i++)
		 {
			 
			int add=first+second;
			
			System.out.print(add+" ");
			
			first=second;
			
			second=add;
			

             			 
		 }
		 
	 }
 }
 

/*. Design a function void print( ) with a single dimensional array x[ ] and n (as size of the array)
 as function arguments. The function calculates sum of only single digit 
 and sum of only double digit elements from the array. Design a main() function
 to input size of the array ‘len' and single dimensional array
 of size 'len', and print the required result by invoking the function print( ).*/
 
 class PrintCreation
 {
	 public static void main(String []args)
	 {
       Scanner scan=new Scanner(System.in);
     
	 System.out.println();
	 
       int size=scan.nextInt();

       int []arr=new int[size];
	   
	   for(int i=0;i<arr.length;i++)
		 {
			 System.out.println("Enter "+(i+1)+" Value");
			 arr[i]=scan.nextInt();
		 }
      

      System.out.println("Sum of  Single Digits ="+ sumDigits(1,arr));	
	  
	  System.out.println("Sum of  Double Digits ="+ sumDigits(2,arr));	
	 }
	 
	 public static int  sumDigits(int digits,int []arr)
	 {
		 int sum=0;
		 
		 for(int i=0;i<arr.length;i++)
		 { 
	         
			 int numDigits=(int) Math.log10(arr[i]);
			 if(digits==(numDigits+1))
			 {
				 sum+=arr[i];
			 }
		 }
		 return sum;
	 }
 }
 /*5. Write a program to initialize the following character arrays and print
 a suitable message after checking the arrays whether the two arrays are identical 
 or not. Make suitable use of Boolean data type. X[] =('m', 'n', 'o', 'p'} and Y[] =('m', 'n', 'o', 'p' }
X[] =('m', 'n', 'o', 'p'} and
Y[] =('m', 'n', 'o', 'p' }*/
 
 class IdenticalArray
 {
	 public static void main(String args[])
	 {
		 char X[] ={'m','n','o','p'} ;
		 
		 char Y[] ={'m','n','o','p' };
		 
		System.out.println(isIdentical(X,Y)?"Identical":"False");
		  
	 }
	 public static boolean isIdentical(char [] A,char [] B)
	 {
		  boolean isTrue=true;
		  
		  for(int i=0;i<A.length&&isTrue;i++)
		  {
			  if(A[i]!=B[i])
			  {
				  isTrue=false;
			  }
		  }
		  
		  return isTrue;
	 }
 }
 
 /*6. Write a program to accept the year of graduation from school as an integer
 value from the users . Using the Binary search technique on the sorted array of
 integers given below . Output the message “record exists" if the value input is
 located in the array and if not output the message record does not exits”.
{1982, 1987, 1993, 1996, 1999, 2003, 2006, 2007, 2009, 2010, 2016, 2002}*/

class Graduation{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter size of Array");
		
		int size=scan.nextInt();
		
		int[] year=new int[size];
		
		for(int i=0;i<year.length;i++)
		 {
			 System.out.println("Enter "+(i+1)+" Value");
			 year[i]=scan.nextInt();
		 }
      

        System.out.println("Enter a target year");
		
		int target=scan.nextInt();

        Arrays.sort(year);	

      	System.out.println(isExists(year,target)?"record Exists":"Not Exists");	
		
	}
	
	public static boolean isExists(int arr[],int target)
	{
		
	 int left =0;
    
     int right=arr.length-1;

     while(left<=right)
	 {
      int mid=(left+right)/2;
	  
	  if(arr[mid]==target)
	  {
		  return true;
	  }
	  
	  if(arr[mid]<target)
	  {
		  left=mid+1;
	  }
	  else{
		  right=mid-1;
	  }
	
	 }	

   return false;	 
		
	}
	
}

//7. Write a program to input and store 
//the weight of ten people. Sort and display them in descending order using the Selection sort technique.

class SelectionSort
{
	public static void main(String []args)
	{
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter a Size");
		
		int size=scan.nextInt();
		
		int []arr=new int[size];
		
		 for(int i=0;i<arr.length;i++)
		 {
			 System.out.println("Enter "+(i+1)+" Value");
			 arr[i]=scan.nextInt();
		 }
		 
		 selectionSort(arr);
		 
		 
		 System.out.println(Arrays.toString(arr));
		
		
	}
	
	public static void selectionSort(int []arr){
		
		 int index=0;
	
	 for(int i=0;i<arr.length;i++)
	 {
		  int max=0;
		  
		 for(int j=i;j<arr.length;j++)
		 {
		    if(max<arr[j])
			{
				max=arr[j];
				
				index=j;
			}				
		 }
		 int temp=arr[index];
		 
		 arr[index]=arr[i];
		 
		 arr[i]=temp;
	 }
		
	}
	
}

//8. Write a program which takes in 10 people’s age and gives number of people who are <18, 18-60, >60.

class People{
	public static void main(String []args)
	{
		Scanner scan=new Scanner(System.in);
		
		int size=scan.nextInt();
		
		int []arr=new int[size];
		
		 for(int i=0;i<arr.length;i++)
		 {
			 System.out.println("Enter "+(i+1)+" Value");
			 arr[i]=scan.nextInt();
		 }
		 
		 int below_18=0;
		 
		 int middle=0;
		 
		 int greter_60=0;
		 
		 for(int i=0;i<arr.length;i++)
		 {
			 if(arr[i]<18)
			 {
				 below_18++;
			 }
			 else if(arr[i]>=18&&arr[i]<=60){
			   middle++;
			 }
			 else{
				 greter_60++;
			 }
		 }
		 
		 System.out.println("Below 18 ="+below_18);
		 
		 System.out.println("Middle Value ="+middle);
		 
		 System.out.println("Greater of Sixty ="+greter_60);
		 
	}
}

/*9.Write an array which takes in roll no and marks in 3 subjects for 
10 students. Format and Print the roll no, total marks and 
average for all students in a table form.*/

class Student {
    int rollNo;
	
	int mark_1;
	
	int mark_2;
	
	int mark_3;
	
	Student(int rollNo,int mark_1,int mark_2,int mark_3)
	{
		this.rollNo=rollNo;
		
		this.mark_1=mark_1;
		
		this.mark_2=mark_2;
		
		this.mark_3=mark_3;
	}
	
	public  int Avg(Student s)
	{
		return (s.mark_1+s.mark_2+s.mark_3)/3;
	}
	
	public  int total(Student s)
	{
		
		return (s.mark_1+s.mark_2+s.mark_3);
		
	}
	
}

class AccessingStudent{
	
	public static void main(String[]args)
	{
	
	Scanner scan=new Scanner(System.in);
	
	int size=scan.nextInt();
	
	Student[] student =new Student[size];
	
	for(int i=0;i<size;i++)
	{
		System.out.println("Enter a Rollno");
		
		int rollNo=scan.nextInt();
		
		System.out.println("Enter a Mark 1");
		
		int mark1=scan.nextInt();
		
		System.out.println("Enter a Mark 2");
		
		int mark2=scan.nextInt();
		
		System.out.println("Enter a Mark 3");
		
		int mark3=scan.nextInt();
		
		Student s=new Student(rollNo,mark1,mark2,mark3);
		
		student[i]=s;
		
	}
	
	for(int i=0;i<size;i++)
	{
		Student s =student[i];
		
		System.out.println("RollNo ="+s.rollNo);
		
		System.out.println("Average ="+s.Avg(s));
		
		System.out.println("Total ="+s.total(s));
	}
	
}
}

/*10. Write a menu driven program to do following operation on two dimensional array A of size m x n. 
You should use user-defined methods which accept 2-D array A, and its size m and n as arguments. The options are:
● To input elements into matrix of size m x n
● To display elements of matrix of size m x n
● Sum of all elements of matrix of size m x n
● To display row-wise sum of matrix of size m x n
● To display column-wise sum of matrix of size m x n
● To create transpose of matrix of size n x m*/


class MatrixOperation{
	public static void main(String []args)
	{
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter row Size");
		
	    int row=scan.nextInt();
		
		System.out.println("Enter Column Size");
		
		int col=scan.nextInt();
		
		int[][]matrix=new int[row][col];
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.println("Enter a Value");
				
				matrix[i][j]=scan.nextInt();
			}
		}
		
		displayMatrix(matrix); // show matrix
		
		System.out.println("The sum Of all Element ="+sumOfAll(matrix));
		
		sumOfRowWise(matrix);
		
		sumOfColWise(matrix);
		
		System.out.println("Transpose");
		
		displayMatrix(transpose(matrix));
		
		
	}
	
	public static void displayMatrix(int[][]A)
	{
		for(int[]a:A)
		{
			for(int i=0;i<a.length;i++)
			{
				System.out.print(a[i]+" ");
			}
			
			System.out.println();
		}
	}
	
	
	public static int sumOfAll(int[][]A)
	{
		int sum=0;
		
		for(int[]a:A)
		{
			for(int i=0;i<a.length;i++)
			{
			  sum+=a[i];
			}
		}
		return sum;
	}
	
	public static void sumOfRowWise(int[][]A)
	{
		int cnt=1;
		
		for(int[]a:A)
		{
			int sum=0;
			for(int i=0;i<a.length;i++)
			{
			  sum+=a[i];
			}
			
			System.out.println((cnt++)+"st  Rows Sum ="+sum );
			
		}
		
	}
	
	public static void sumOfColWise(int[][]A)
	{
		int cnt=1;
		
		for(int i=0;i<A.length;i++)
		{
			int sum=0;
			
			for(int j=0;j<A[i].length;j++)
			{
				sum+=A[j][i];
			}
			
			System.out.println((cnt++)+"st The Column Wise Sum ="+sum);
		}
	}
	
	public static int[][] transpose(int[][] A)
	{
		int[][] trans=new int[A[0].length][A.length];
		
		for(int i=0;i<A.length;i++)
		{	
			for(int j=0;j<A[i].length;j++)
			{
			  trans[j][i]=A[i][j];
			}
			
		}
		return trans;
	}
	
	
}

//Part 3 String 

// 1. BINARY ADDITION

class BinaryAddition{
	
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter a binary String 1");
		
		String num1=scan.nextLine();
		
		System.out.println("Enter a binary String 2");
		
		String num2=scan.nextLine();
		
		System.out.println( "Addition value = "+Add(num1,num2));
		
	}
	
	 public static String Add(String num1,String num2){

         int i=num1.length()-1;

        int j=num2.length()-1;

        int carry=0;

        StringBuilder result=new StringBuilder();

        int a,b;

        int length=(i+1)>(j+1)?(i+1):(j+1);

        while(length-->0)
        {
          
          a=i>=0?num1.charAt(i)-48:0;
          
          b=j>=0?num2.charAt(j)-48:0;

         int sum=a+b+carry;

         if(sum==2)
         {
            carry=1;
            
            result.insert(0,"0");

         }
         else if(sum==3)
         {
               result.insert(0,"1");

              carry =1;
         }
         
         else{
            carry=0;
             result.insert(0,sum+"");

         }

         i--;
         j--;

        }
        

        if(carry==1)
        {
               result.insert(0,"1");

               return result.toString();
        }

        return result.toString();

    }
}

class ExcelSheetTitle
{
  public  static void main(String[] args) {
	
   Scanner scan=new Scanner(System.in);

   System.out.println("Enter a  num");

   int n=scan.nextInt();

   String result="";

   while(n-->0)
   {
    int rem=n%26;
  result= ((char)(65+rem))+result;

  n/=26;

   }

   System.out.println("ExcelSheet title = "+result);  }

}

//3. Given a string s, reverse only all the vowels in the string and return it.

class ReverseVowel 
{
  public static void main(String[]args)
  {
    Scanner scan=new Scanner(System.in);

	System.out.println("Enter a String ");

	String str=scan.nextLine();

	int left=0;

	int right=str.length()-1;

	int lcnt=0,rcnt=0;

	char [] arr=str.toCharArray();

	while(left<=right)
	{
      if(isVowel(arr[left]))
	  {
		lcnt=1;
	  }

	  if(isVowel(arr[right]))
	  {
		rcnt=1;
	  }

     if(lcnt==1&&rcnt==1)
	 {
		char temp=arr[left];

		arr[left]=arr[right];

		arr[right]=temp;

		lcnt=rcnt=0;

	 }
    if(lcnt==0)
	{
		left++;
	}
	if(rcnt==0)
	{
		right--;
	}

	}

	System.out.println("Result ="+String.valueOf(arr));
  }
  public static boolean isVowel(char a)
  {
	return "aeiouAEIOU".contains(a+"");
  }

}

/*4. You are given two strings s and t.
‌
String t is generated by random shuffling string s and then add 
one more letter at a random position. */

class Differnce{
	public static void main(String [] args)
	{
       Scanner scan=new Scanner(System.in);

	   System.out.println("Enter a String 1");

	   String s=scan.nextLine();

	   System.out.println("Enter a String 2");

	   String t=scan.nextLine();

      System.out.println(charDiff(s, t));

	  scan.close();

	}
	public static char charDiff(String s, String t) {
        char A  []=s.toCharArray();
		
        char B []=t.toCharArray();
		
        Arrays.sort(A);
		
        Arrays.sort(B);
		
        for(int i=0;i<A.length;i++){
			
            if(A[i]!=B[i]){
				
                return B[i];
				
            }
        }
        return B[B.length-1];
    }
}

//5. Given two strings s and t, return true if s is a subsequence of t, or false otherwise.

class  SubSequence{

	public static void main(String[] args)
	{
     
		Scanner scan=new Scanner(System.in);

	   System.out.println("Enter a String 1");

	   String s=scan.nextLine();

	   System.out.println("Enter a String 2");

	   String t=scan.nextLine();

	   System.out.println(isSub(s, t)?"Yes":"No");

	}

	public static boolean isSub(String s,String t)
	{
      int cnt=0;
   
     for(int i=0;i<s.length();i++)
	 {
		if(s.charAt(i)==t.charAt(cnt))
		{
			cnt++;
		}
		
	 }

   return cnt==t.length();

	}
}
//Add two Strings 


class AddString{

	public static void main(String[]args)
	{

	   Scanner scan=new Scanner(System.in);

	   System.out.println("Enter a num 1");

	   String s=scan.nextLine();

	   System.out.println("Enter a num 2");

	   String t=scan.nextLine();

	   System.out.println("The Result = "+addStrings(s,t));

	}

	public static String addStrings(String num1, String num2) {
        
        int a=0;

        int b=0;

        int length=num1.length()>num2.length()?num1.length():num2.length();

        int i=num1.length()-1;

        int j=num2.length()-1;

        int carry=0;
   
        String result="";

        while(length-->0)
        {

         a=i<0?0:num1.charAt(i)-48;

         b=j<0?0:num2.charAt(j)-48;

         int  sum=carry+a+b;

         if(sum>9){
          
          int rem=sum%10;

          sum/=10;

          result=rem+result;

          carry=sum;

         }  
         else{

            carry=0;

            result=sum+result;

         }

         i--;
         j--;

        }

       if(carry>0)
       {
        result=carry+result;
       }
         
return result;
    }
}



/*7. Given a string s, return the number of segments in the string.
‌
A segment is defined to be a contiguous sequence of non-space characters. */

class Segments
{
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);

	   System.out.println("Enter a String 1");

	   String s=scan.nextLine();

	   System.out.println("Segments ="+s.split("\\s+").length);

	}
}

/*8. We define the usage of capitals in a word to be right when one of the following cases holds:
1. All letters in this word are capitals, like "USA".
2. All letters in this word are not capitals, like "leetcode".
3. Only the first letter in this word is capital, like "Google".
Given a string word, return true if the usage of capitals in it is right. */

class RulesLetter{
	public static void main(String[]args)
	{
      
		Scanner scan=new Scanner(System.in);

	   System.out.println("Enter a String ");

	   String s=scan.nextLine();


	   System.out.println(isValid(s)?"Yes valid ":"Not Valid");
	}

	private static boolean isValid(String s) {
		
		 int cCnt=0;

		 int sCnt=0;

		for(int i=0;i<s.length();i++)
		{
		    char ch=s.charAt(i);

			if(ch<90)
			{
             cCnt++;
			}

			else{
				sCnt++;
			}

		}
		
		if(cCnt==1&&sCnt==s.length()-1)
		{
			return s.charAt(0)<90?true:false;
		}

		return cCnt==s.length()||sCnt==s.length();

	}
}