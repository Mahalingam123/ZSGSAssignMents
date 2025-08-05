package Question2;

/*
2. Write a Java program to create a thread using the Runnable interface.
--->Create a class TaskRunner that implements Runnable.
--->Inside the run() method, print the current thread name and a
 task-specific message 10 times with a delay of 1000ms.
--->In the main() method, create two Thread objects passing
different TaskRunner instances and start both threads.
--->The console should reflect the concurrent execution of both tasks.
 */

 class TaskRunner implements  Runnable {

     public void run()
     {
         for(int i=0;i<10;i++)
         {
             System.out.println("Hello I am "+Thread.currentThread().getName());

             try{Thread.sleep(1000);} catch (Exception e){}


         }

     }

 }

 class MainRun{
     public static void main(String[] args) {

         Runnable r=new TaskRunner();

         Thread  t=new Thread(r);

         Thread  t1=new Thread(r);

         t.setName("Number 1");

         t1.setName("Number 2");

         t.start();

         t1.start();

     }

 }
