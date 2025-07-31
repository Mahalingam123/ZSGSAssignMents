/*1. Illustrate the concept-Encapsulation with the 
Payment Gateway System.[The class should encapsulate private data members 
such as transaction ID, payer name, payee name, amount, payment method, and transaction 
status. Provide appropriate public getter and setter methods to access and modify 
these details securely. Also include a method to display the transaction summary.] */

import java.util.ArrayList;

class Payment{
   
    private int transactionId;
    private String payerName;
    private int amount;
    private String payeeName;
  
    
    public void setPayeeName(String payeeName) {
        this.payeeName = payeeName;
    }
    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
    public String getPayeeName() {
        return payeeName;
    }
    public String getPaymentMethod() {
        return paymentMethod;
    }

    private String paymentMethod;

    public int getAmount() {
        return amount;
    }
    public void setPayerAmount(int amount)
    {   
     this.amount=amount;

    }
    public void setName(String payerName)
    {
      this.payerName=payerName;
    }
    public String getName()
    {
        return this.payerName;
    }
    public void setId(int id)
    {
      transactionId=id;
    }
    public int getId()
    {
        return this.transactionId;
    }

   

}

class AccessPayment{
public static void main(String[] args) {
    
 Payment pay=new Payment();

 pay.setId(12345);
 pay.setName("jhon");
 pay.setPayerAmount(1000);
 pay.setPayeeName("Jhon");
 pay.setPaymentMethod("online");

 Payment pay1=new Payment();

 pay1.setId(1234512345);
 pay1.setName("jhonyDeep");
 pay1.setPayerAmount(1000233);
 pay1.setPayeeName("Jhon");
 pay1.setPaymentMethod("online");

 Payment pay2=new Payment();

 pay2.setId(12345567);
 pay2.setName("jhon snow");
 pay2.setPayerAmount(1000999);
 pay2.setPayeeName("Jhon");
 pay2.setPaymentMethod("online");

 ArrayList<Payment> list=new ArrayList<>();

    list.add(pay);
    list.add(pay1);
    list.add(pay2);

   for(int i=0;i<list.size();i++)
   {
    System.out.println("Payer Name  = "+ list.get(i).getName());
    System.out.println("Payee Name  = "+ list.get(i).getPayeeName());
    System.out.println("amount   = "+ list.get(i).getAmount());
    System.out.println("Transaction Id = "+list.get(i).getId());
     System.out.println("Payement method  = "+ list.get(i).getPaymentMethod());

     System.out.println();

   }


}


}


