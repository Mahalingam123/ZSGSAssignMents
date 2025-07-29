/*1. All the banks operating in India are controlled by RBI. RBI has set a well defined 
guideline (e.g. minimum interest rate, minimum balance allowed, maximum withdrawal 
limit etc) which all banks must follow. For example, suppose RBI has set minimum interest 
rate applicable to a saving bank account to be 4% annually; however, banks are free to use
 4% interest rate or to set any rates above it.
Write a program to implement bank functionality in the above scenario. Note: Create few 
classes namely Customer, Account, RBI (Base Class) and few derived classes (SBI, ICICI, PNB etc).
 Assume and implement required member variables and methods in each class.
Hint:
Class Customer
{
//Personal Details ...
// Few functions ...
}
Class Account
{
// Account Detail ...
// Few functions ...
}
Class RBI
{
Customer c; //hasA relationship
Account a; //hasA relationship
..
Public double GetInterestRate() { }
Public double GetWithdrawalLimit() { }
}
Class SBI extends public RBI
{
//Use RBI functionality or define own functionality.
}
Class ICICI extends public RBI
{
//Use RBI functionality or define own functionality.
} */

import java.util.ArrayList;
import java.util.Scanner;

class Person{

    private String name;

    private String address;

    private String fatherName;

    private int age;

    private long phoneNum;

    public Person(String name, String address, String fatherName, int age,long phoneNum) {

        this.name = name;

        this.address = address;

        this.fatherName = fatherName;

        this.age = age;

        this.phoneNum=phoneNum;
    }

    public String getName(){
        return name;
    }

    public String getAddress(){
        return address;
    }
    public String getFatherName(){

        return fatherName;
    }

    public int getAge(){

        return age;
    }
    
     public long getPhoneNum() {
        return phoneNum;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPhoneNum(long phoneNum) {
        this.phoneNum = phoneNum;
    }

   
    
 }

 class Account {
   
   private long accountnum;

   private double balance;

   private String accountType;

    Account(long accountnum,double balance,String accountType){

        this.accountType=accountType;

        this.balance=balance;

        this.accountnum=accountnum;

    }

    public String getAccountType(){

        return accountType;
    }

    public double getBalance(){

        return balance;
    }

    public long getAccountnum(){

        return accountnum;
    }

    public void setAccountnum(long accountnum) {
        this.accountnum = accountnum;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public void withdraw(double money)
    {
        if(this.balance-money<0){
            System.out.println("Insuffient Balance ..");
            return;
        }

        else{
         this.balance-=money;

          System.out.println("Money Withdrawed "+this.balance);

        }
    }

 public void deposit(double money){

    this.balance+=money;
   
    System.out.println("Money Deposited  " +this.balance);

 }

 }

  class RBI {

    float minimumInterstRate =4.0f;

    double minimumBalance=100;

    double maximumWidthravel=40000.0;

    static  ArrayList<Person> person=new ArrayList<>();

    static  ArrayList<Account> account=new ArrayList<>();

    public double getInterestRate(){

        return minimumInterstRate;
    }

    public double getWithdrawalLimit(){
        
        return  maximumWidthravel;
    }

    public double calculateInterest(double money,int year)
    {
       return 0;
    }


    public void  createBankAccount(String name,String fatherName,int age,String address,long phonenum,String accountType,double balance)
    {

     Person p=new Person(name,address,fatherName,age,phonenum);
     
     long accnum= (int) ((Math.random()*10000000));

     Account acc=new Account(accnum,balance,accountType);

     person.add(p);

     account.add(acc);

    System.out.println("Account Created Successfully ");

     System.out.println("Account Holder Name = "+p.getName());

     System.out.println("Your Address = "+p.getAddress());

     System.out.println("Your Father Name = "+p.getFatherName());

     System.out.println("Your Age = "+p.getAge());

     System.out.println("Your Phone Number  = "+p.getPhoneNum());

     System.out.println("Your Account number = "+acc.getAccountnum());

     System.out.println("Your Account Type = "+acc.getAccountType());

     System.out.println("Your Balance = "+acc.getBalance());

        System.out.println();
        System.out.println();
  
    }


}

class SBI extends RBI {

    float rateInterstRate=7.6f;

    double minimumBalance=1000;

    double maximumWidthravel=50000;

    public double getInterestRate(){

        return rateInterstRate;
    }

    public double getWithdrawalLimit(){
        
        return  maximumWidthravel;
    }

    public double calculateInterest(double amount,int year)
    {
          
      float  calc= ((100+this.rateInterstRate)/100);

      return amount * ( Math.pow(calc,year)) + 100*year;

    }

}

class IOB extends RBI {

    float rateInterstRate=6.6f;

    double minimumBalance=500;

    double maximumWidthravel=40000;

    public double getInterestRate(){

        return rateInterstRate;
    }

    public double getWithdrawalLimit(){
        
        return  maximumWidthravel;
    }

    public double calculateInterest(double amount,int year)
    {
          
      float  calc= ((100+this.rateInterstRate)/100);

      return amount * ( Math.pow(calc,year)) + 100*year;

    }

}

class AccessMain {
    
    public static void main(String ...args)
    {
     RBI rbi=null;
    
    Scanner scan =new Scanner(System.in);

    System.out.println("Enter 1 for SBI ");
    System.out.println("Enter 2 for IOB");
    System.out.println("Enter 3 for Exit");
    System.out.println("Enter your choice ");
     
    int choice=scan.nextInt();

    switch(choice)
    {
     case 1:
         while(true) {

             System.out.println("Enter 1 for Create Account ");
             System.out.println("Enter 2 for Widhraw ");
             System.out.println("Enter 3 for Deposit ");
             System.out.println("Enter 4 exit the Operation");
             int choices = scan.nextInt();

             scan.nextLine();

             switch (choices) {
                 case 1:

                     if(rbi!=null)
                     {
                         System.out.println("Account already Created");

                         break;
                     }

                     rbi = new SBI();

                     System.out.println("Enter Your Name ");
                     String name = scan.nextLine();
                     System.out.println("Enter YourAge ");
                     int age = scan.nextInt();
                     scan.nextLine();
                     System.out.println("Enter Your Phone number ");
                     long phoneNum = scan.nextLong();
                     scan.nextLine();
                     System.out.println("Enter Your Address ");
                     String address = scan.next();
                     System.out.println("Enter Your Father Name ");
                     String fatherName = scan.next();
                     scan.nextLine();
                     System.out.println("Enter Your Preferred Account Type ");
                     String accType = scan.nextLine();
                     System.out.println("Add Balance (Minimum Balance is= " + rbi.minimumBalance + ")");
                     double money = scan.nextDouble();

                     rbi.createBankAccount(name, fatherName, age, address, phoneNum, accType, money);

                     break;
                 case 2:
                     if (rbi == null) {
                         System.out.println("First Create Account ");

                         System.out.println();
                         break;

                     }

                     System.out.println("Enter amount to Withdraw");

                     double amount = scan.nextDouble();

                     RBI.account.getFirst().withdraw(amount);


                     break;

                 case 3:
                     if (rbi == null) {
                         System.out.println("First Create Account ");

                         break;

                     }
                     System.out.println("Enter amount to deposit");

                     double amounts = scan.nextDouble();

                     RBI.account.get(0).deposit(amounts);


                     break;

                 case 4:

                     System.exit(0);

                     break;

                 default:
                     System.out.println("Enter a correct choices Try Again");
                     break;
             }
         }

     case 2:
         while(true) {

             System.out.println("Enter 1 for Create Account ");
             System.out.println("Enter 2 for Widthraw ");
             System.out.println("Enter 3 for Deposit ");
             System.out.println("Enter 4 exit the Operation");
             int choicesIob = scan.nextInt();

             scan.nextLine();

             switch (choicesIob) {
                 case 1:
                     if(rbi!=null)
                     {
                         System.out.println("Account already Created");

                         break;
                     }

                     rbi = new IOB();

                     System.out.println("Enter Your Name ");
                     String name = scan.nextLine();
                     System.out.println("Enter YourAge ");
                     int age = scan.nextInt();
                     scan.nextLine();
                     System.out.println("Enter Your Phone number ");
                     long phoneNum = scan.nextLong();
                     scan.nextLine();
                     System.out.println("Enter Your Address ");
                     String address = scan.next();
                     System.out.println("Enter Your Father Name ");
                     String fatherName = scan.next();
                     System.out.println("Enter Your Prefered Account Type ");
                     String accType = scan.next();
                     System.out.println("Add Balance (Minimum Balance is= " + rbi.minimumBalance + ")");
                     double money = scan.nextDouble();
                     rbi.createBankAccount(name, fatherName, age, address, phoneNum, accType, money);

                     break;
                 case 2:
                     if (rbi == null) {
                         System.out.println("First Create Account ");

                         break;

                     }

                     System.out.println("Enter amount to Withdraw");

                     double amount = scan.nextDouble();

                     RBI.account.getFirst().withdraw(amount);


                     break;

                 case 3:
                     if (rbi == null) {
                         System.out.println("First Create Account ");

                         break;

                     }
                     System.out.println("Enter amount to deposit");

                     double amounts = scan.nextDouble();

                     RBI.account.getFirst().deposit(amounts);


                     break;

                 case 4:

                     System.exit(0);

                     break;

                 default:
                     System.out.println("Enter a correct choices Try Again");
                     break;
             }
         }
        case 3:

     System.exit(0);

     default:

      System.out.println("Enter Correct Choice and Start Again");
      break;
    }
   
    scan.close();

    }
}