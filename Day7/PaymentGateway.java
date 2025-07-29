/*2. Design a Payment Gateway System using an interface named PaymentMethod
 with a method
pay(double amount). Implement this interface in different classes like
 CreditCardPayment,
 DebitCardPayment, and UPIPayment. Write a main class where you can
 accept payment using different
 methods.*/

interface PaymentGateway {

    void pay(double amount);

}

class DebitCardPayment implements PaymentGateway
{
   public void pay(double amount){

        System.out.println("Amount Payed Successfully via DebitCard amount = "+amount);
    }

}

class UPIPayment implements PaymentGateway
{
    public void pay(double amount){

        System.out.println("Amount Payed Successfully via UPI amount = "+amount);
    }

}

class CreditCardPayment implements PaymentGateway
{
    public void pay(double amount){

        System.out.println("Amount Payed Successfully via Credit Card amount = "+amount);
    }

}

class MainPayment{
    public static  void main(String ...args)
    {
        PaymentGateway pay=new CreditCardPayment();

        pay.pay(10000);

        PaymentGateway pay1=new DebitCardPayment();

        pay.pay(20000);

        PaymentGateway pay2=new UPIPayment();

        pay.pay(198.78);

    }

}

