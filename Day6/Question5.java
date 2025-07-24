/*5. Design a class named`BankAccount that uses the concept of 
encapsulation. The class should have the following private data members: account number, 
account holder name, and balance. Provide public getter and setter methods to access 
and modify these fields. Also, include a method to deposit and withdraw amount ensuring 
that the balance cannot go negative.
 */

import java.util.Scanner;

class Bank {
  
    private long accountnum;

    private double balance;

    private String name;

    Bank(long accountnum,double balance,String name){

        this.accountnum=accountnum;
        this.balance=balance;
        this.name=name;

    }

    public String getName()
    {
        return name;

    }

    public double getBalance()
    {
        return balance;

    }

    public long getAccountnum(){

        return accountnum;
    }

   public void setName(String name)
   {
    this.name=name;
   }

   public void setAccountnum(long accountnum) {

    this.accountnum = accountnum;

   }

   public void setBalance(double balance) {

    this.balance = balance;

   }

   public void deposit(double money)
   {
    System.out.println("Old Balance = "+getBalance());

    this.balance+=money;

    System.out.println("New balance = "+getBalance());

   }

   public void withdraw(double money)
   {

    if((this.balance-money)<0){
      
        System.out.println("Insuffisient balance ");
        return;  
    }

    System.out.println("Old Balance = "+getBalance());

    this.balance-=money;

    System.out.println("New Balance = "+getBalance());

   }
 

 }

 class Main{
    public static void main(String ...args){

        try (Scanner scan = new Scanner(System.in)) {

        System.out.println("Enter Account num");

        long accNum=scan.nextLong();

        System.out.println("Enter a AccountHolder name ");

        String name=scan.next();

        System.out.println("Enter a Account balance ");

        int balance=scan.nextInt();

        

        Bank bank=new Bank(accNum,balance,name);

        while(true) {

        System.out.println("Enter 1 for deposit ");

        System.out.println("Enter 2 for Withdraw");

        System.out.println("Enter a 3 for Exit");

        int choice=scan.nextInt();

        switch (choice) {
            case 1:
                
               System.out.println("Enter a money  for Deposit");

               double money=scan.nextDouble();

               bank.deposit(money);

              System.out.println();
              
                break;

            case 2:

               System.out.println("Enter a money  for Deposit");

               double money1=scan.nextDouble();

               bank.withdraw(money1);
               
              System.out.println();
                break;

                case 3:

                System.exit(0);
        
            default:
               
               System.out.println("Enter a Correct choice");

                break;

        }
        }

         
        
        }


       

    }
 }