package Question4;
/*
4. Create a Java program with a shared counter. Spawn 3 threads, where each
thread increments the counter 1000 times. Use synchronization to avoid race
conditions and display the final value.
 */

class Increment{
 int value=0;

 public synchronized  void incre()
 {
  this.value+=1000;
 }


}


 class Main {
  public static void main(String[] args) {

   Increment ic=new Increment();

  Thread t1=new Thread(() ->{
  ic.incre();
  });


   Thread t2=new Thread(() ->{
    ic.incre();
   });

      Thread t3=new Thread(ic::incre);

  t1.start();

  t2.start();

  t3.start();

try{ t1.join();t2.join();t3.join();} catch (Exception e) {}

   System.out.println(ic.value);
  }
}
