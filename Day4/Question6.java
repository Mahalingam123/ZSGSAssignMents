/* 6. Design and implement a custom Java class named MyString that mimics the
behavior of Java’s built-in String class. Your class should store character
 data internally (e.g., using a char[] or String as input) and should provide
 the following string methods,
1. int length() – Returns the number of characters.
2. char charAt(int index) – Returns the character at the specified index.
3. boolean equals(MyString other) – Checks if two MyString objects are equal.
4. MyString toUpperCase() – Returns a new string with all characters in uppercase.
5. MyString toLowerCase() – Returns a new string with all characters in lowercase.
6. MyString substring(int start, int end) – Returns a substring from start to end-1.
7. MyString concat(MyString other) – Concatenates another string to the current one.
8. boolean contains(MyString sub) – Checks if a substring exists.
9. int indexOf(char ch) – Returns the index of the first occurrence of the character.
10. MyString replace(char oldChar, char newChar) – Replaces all occurrences of a character.
* Implement proper constructors, including one that takes a char[] or String as input.
* Avoid using any built-in String methods to perform the operations internally.
* Write a main method to demonstrate the working of your MyString class.           */

import java.sql.SQLOutput;
import java.util.Scanner;

class MyString{

    String s;

    public MyString(String s)
    {
        this.s=s;
    }



    public int length()           // length
    {
       int cnt=0; boolean x=true;

       while(x)
       {
           try {
               this.charAt(cnt++);
           }
           catch(Exception e)
           {
               x=false;

               return cnt-1;
           }
       }
  return -1;
    }



    public char charAt(int index)   // char At
    {

            return this.s.toCharArray()[index];

    }


  public boolean isEqual(String s)    // equal
  {
      MyString s1=new MyString(s);

      if(this.length()!=s1.length())
      {
          return false;
      }

      for(int i=0;i<this.length();i++)
      {
          if(s1.charAt(i)!=this.charAt(i))
          {
              return false;
          }
      }
      return true;
  }

  public char toUpper(char ch)    // char Upper
  {
      if(ch>90)
      {
          ch-=32;
      }

      return ch;
  }

    public char toLower(char ch)    // char Lower
    {
        if(ch<=90)
        {
            ch+=32;
        }

        return ch;
    }


  public String  toUpperAll()    // all Upper char
  {
      String r="";

      for(int i=0;i<this.length();i++)
      {
          if(this.charAt(i) >90&&this.charAt(i)<=122)
          {
              r+=toUpper(this.charAt(i));
          }
          else{

              r+=this.charAt(i);

          }
      }
      return r;
  }



    public String  toLowerAll()     // all lower char
    {
        String r="";

        for(int i=0;i<this.length();i++)
        {
            if(this.charAt(i) <90)
            {
                r+=toLower(this.charAt(i));
            }
            else{

                r+=this.charAt(i);

            }
        }
        return r;
    }

    public  String  substr(int start,int end)    // Substring
    {
        String r="";

        for(int i=start;i<=end;i++)
        {
            r+=this.charAt(i);
        }

        return r;
    }


    public String conCat(String s1)      // Concatenation
    {

        return this.s+s1;

    }

    public int indexOf(char ch)       // Index Of

    {

     for(int i=0;i<this.length();i++)
     {
         if(ch==this.charAt(i))
         {
             return i;
         }
     }

     return -1;
    }

    // Contains Method

    public boolean contains(String s)
    {
        boolean is=false;

        MyString s1=new MyString(s);

        for(int i=0;i<this.length();)
        {


            if(this.charAt(i)==s1.charAt(0))
            {
                int cnt = 0;
                if(i<(this.length()-s1.length() )) {

                    for (int k = 0; k < s1.length(); k++) {

                        if (this.charAt(i++) == s1.charAt(k)) {
                            cnt++;
                        }
                        else{
                            break;
                        }

                        if (cnt == s1.length()) {
                            return true;
                        }
                    }
                }

            }
            else{
                i++;
            }

        }
        return false;
    }


   public String replaceChar(char ch,char replace)
   {
      String result="";

      for(int i=0;i<this.length();i++)
      {
          if(this.charAt(i)==ch)
          {
              result+=replace;
          }
          else{
              result+=this.charAt(i);
          }
      }

      return result;

   }



}

public class Question6 {
    public static void main(String[] args) throws  Exception{

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a string ");

        String s = scan.nextLine();

        MyString str = new MyString(s);

        while(true){

        System.out.println("Enter 1 for Length");

        System.out.println("Enter 2 for Concatenation");

        System.out.println("Enter 3 for char  return at position ");

        System.out.println("Enter 4 for contains ");

        System.out.println("Enter 5 for convert All Lower Case");

        System.out.println("Enter 6 for Convert All Upper Case");

        System.out.println("Enter 7 for  replace Char ");

        System.out.println("Enter 8 for Substring");

        System.out.println("Enter 9 for  Index Of");

        System.out.println("Enter 10 for Equals");

        System.out.println("Enter 11 for Exit");

        System.out.println("Enter your Choice ");

        int choice = scan.nextInt();

        switch (choice) {
            case 1:
                System.out.println("The Length Of String = " + str.length() + "\n");
                break;

            case 2:
                scan.nextLine();

                System.out.println("Enter Another String ");

                String s1 = scan.nextLine();

                System.out.println("  Concatenation  After " + str.conCat(s1));

                break;

            case 3:
                System.out.println("Enter a position");

                int position = scan.nextInt();

                System.out.println("The Character at Position  = " + str.charAt(position));

                scan.nextLine();

                break;

            case 4:

                System.out.println("Enter a String");

                String s2 = scan.next();

                System.out.println(str.contains(s2) ? "YES  it Contains " : "NO");

                break;

            case 5:

                System.out.println("Enter a String ");

                String s3 = scan.nextLine();

                System.out.println(str.toLowerAll());
                break;

            case 6:
                System.out.println("Enter a String ");

                String s4 = scan.nextLine();

                System.out.println(str.toUpperAll());

                break;

            case 7:

                System.out.println("Enter Character");

                char ch = scan.next().charAt(0);

                System.out.println("Enter Replace Character");

                char re = scan.next().charAt(0);

                System.out.println("After replace all = " + str.replaceChar(ch, re));

                break;
            case 8:
                System.out.println("Enter start index ");

                int start = scan.nextInt();

                System.out.println("Enter end index");

                int end = scan.nextInt();

                System.out.println("The Substring value = " + str.substr(start, end) +"\n");

                break;

            case 9:
                System.out.println("Enter Character ");

                char a = scan.next().charAt(0);

                System.out.println("Index Of = " + str.indexOf(a));

                scan.nextLine();

                break;


            case 10:

                scan.nextLine();

                System.out.println("Enter a String for Equals");

                String eq = scan.nextLine();

                System.out.println( str.isEqual(eq)?"The String  is Equal ":"No " +"\n");

                break;

            case 11:
                System.exit(0);

            default:
                System.out.println("Enter Correct choice");
                break;
        }

    }

    }
}
