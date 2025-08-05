package Question3;

/*
3. Write a Java program where one thread prints only
even numbers and another prints only odd numbers from 1 to 20.
Synchronize the threads so that they print alternately (i.e., 1 2 3 4 ...).
 */

class Printing
{
    boolean isodd=true;
    

    public synchronized void isOdd(int num)
    {
        while(!isodd)
        {
          try{  wait();} catch (InterruptedException e) {throw new RuntimeException(e);}
          
        }
        System.out.println(num);

        isodd=false;
        
        notify();
        
    }

    public synchronized void isEven(int num)
    {
        while(isodd)
        {
            try{  wait();} catch (InterruptedException e) {throw new RuntimeException(e);}

        }
        System.out.println(num);

        isodd=true;

        notify();

    }
    
}


class Main{
    public static void main(String[] args) {

        Printing p=new Printing();

      Runnable odd=() ->
      {
          
        for(int i=1;i<=20;i+=2)
        {
           p.isOdd(i); 
        }
      };
        Runnable even=() ->
        {

            for(int i=2;i<=20;i+=2)
            {
                p.isEven(i);
            }
        };
     
        new Thread(odd).start();

        new Thread(even).start();
       




    }
}