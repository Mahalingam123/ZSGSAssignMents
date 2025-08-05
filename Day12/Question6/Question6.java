package Question6;

/*
6. Use Threads to implement the ATM machine, where create thread to check the
 PIN number, another thread to perform the cash withdrawal, another one
 to check the balance amount and print the receipt.
 */

class Atm  {

    boolean isWithdraw=false;

    double money=100000;

    public boolean isPinCorrect(int num)
    {
        if(num > 999 && num <= 9999)
        {
            System.out.println("SuccessFully verified \n\n");

            return  true;
        }

        return false;
    }

    public synchronized  void withdraw(double money)
    {

        isWithdraw=true;

        try{ Thread.sleep(5000);} catch(InterruptedException e){}

        if(this.money-money >0)
        {
            this.money-=money;

            System.out.println("Withdraw Successfully \n\n");

            isWithdraw=false;

            notify();

        }
       else{
            isWithdraw=false;
            System.out.println("--------------Insufficient Money -----------\n\n");
        }

    }


    public synchronized void currentBalance()
    {
        while(isWithdraw) {
          try{  wait(); } catch (InterruptedException e) {}
        }
        System.out.println("Current balance = " + this.money+"\n\n");
    }

}

class Main{
    public static void main(String[] args) {

        Atm atm=new Atm();

        Runnable r= new Runnable() {
            @Override
            public void run() {

              if(atm.isPinCorrect(1000))
              {

                  Thread t2=new Thread( () ->{
                     atm.withdraw(60000);

                  });


                  Thread t3=new Thread(atm::currentBalance);

                  t2.start();

                  t3.start();


              }
            }
        };

        Thread t=new Thread(r);

        t.start();


    }
}
