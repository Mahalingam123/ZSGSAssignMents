package Question5;

import java.util.LinkedList;
import java.util.Queue;

class ProducerConsumer {



     Queue<String> queue=new LinkedList<>();

     public synchronized void  producer (String name)
     {
        while (queue.size()>=5)
       {
           try{ wait();} catch (InterruptedException e) {}

       }
         queue.offer(name);

         try{Thread.sleep(500);} catch (InterruptedException _) {}

         System.out.println("Producer Created product");

        notify();

     }

     public synchronized  void  consume()
     {

         while (queue.isEmpty())
         {
             try{ wait();} catch (InterruptedException e) {}
         }

         try{Thread.sleep(1500);} catch (InterruptedException _) {}

       String s=  queue.poll();

         System.out.println("Consumer  Consumed product = "+s);

         notify();

     }
}

class Main{

    public static void main(String[] args) {

        ProducerConsumer p=new ProducerConsumer();

        Thread t=new Thread(() -> {
            for(int i=0;i<=10;i++)
            {
                p.producer("hi");
            }
        });


        Thread t1=new Thread(() ->{
            for(int i=0;i<=10;i++)
            {
                p.consume();
            }
        });

        t.start();

        t1.start();

    }


}
