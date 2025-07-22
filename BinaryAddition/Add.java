class Add{   
    public static void main(String...args)
    {

        String num1="11";

        String num2="0101";

        System.out.println(AddBinary(num1, num2));

    }

    public static String AddBinary(String num1,String num2){

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