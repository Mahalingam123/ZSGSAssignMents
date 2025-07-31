package com.String;

 public class StringOper{

    public String concat(String one,String two)
    {
        return one+two;
    }

    public String rev(String one)
    {
       StringBuilder sb=new StringBuilder();

       for(int i=one.length()-1;i>=0;i--)
       {
          sb.insert(0, one.charAt(i));
       }
     return sb.toString();

    }

      public int len(String one)
    {
        return one.length();
    }

}