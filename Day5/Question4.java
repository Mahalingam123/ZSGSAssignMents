/*4. Design a Java Ticket Booking System using polymorphism where Bus, Train, and Flight tickets
 share a common method but implement booking differently. */

import java.util.Scanner;

class TicketBooking{

    String name;

    int ticketId;

    String start;

    String destination;

 TicketBooking(String name,int ticketId,String start,String destination)
 {
    this.name=name;
    this.ticketId=ticketId;
    this.start=start;
    this.destination=destination;
 }

 public void bookTicket()
 {
   System.out.println("ticket booked");
 }

 }

 class Bus extends TicketBooking{

   String busName;

   int seatNo;


   Bus(String busName,int seatNo,String name,int ticketId,String start,String destination){

      super(name,ticketId,start,destination);

      this.busName=busName;

      this.seatNo=seatNo;

   }

  public void bookTicket()
  {
     System.out.println("Ticket Booked Successfully");
     System.out.println("BusName = "+this.busName);
     System.out.println("Your Seat Number = "+this.seatNo);
     System.out.println("Your Name = "+super.name);
     System.out.println("Your Ticket Id = "+super.ticketId);
     System.out.println("Start = "+this.start);
     System.out.println("Destination = "+this.destination);

  }


 }

 class Flight extends TicketBooking{
    
   String flightName;
   int seatNum;

   Flight(String flightName,int seatNum,String name,int ticketId,String start,String destination){

      super(name,ticketId,start,destination);

      this.flightName=flightName;

      this.seatNum=seatNum;

   }

    public void bookTicket()
  {
     System.out.println("Ticket Booked Successfully");
     System.out.println("Flight Name = "+this.flightName);
     System.out.println("Your Seat Number = "+this.seatNum);
     System.out.println("Your Name = "+super.name);
     System.out.println("Your Ticket Id = "+super.ticketId);
     System.out.println("Start = "+this.start);
     System.out.println("Destination = "+this.destination);

  }

 }

 class Train extends TicketBooking
 {

   String trainName;

   char birth;

   int seatNum;

   String classType;

    Train(String trainName,int seatNum,String name,int ticketId,String start,String destination,String classType,char birth){

      super(name,ticketId,start,destination);

      this.trainName=trainName;

      this.seatNum=seatNum;

      this.classType=classType;

      this.birth=birth;

   }
     public void bookTicket()
  {
     System.out.println("Ticket Booked Successfully");
     System.out.println("Train Name = "+this.trainName);
     System.out.println("Your Seat Number = "+this.seatNum);
     System.out.println("Your Name = "+super.name);
     System.out.println("Your Ticket Id = "+super.ticketId);
     System.out.println("Start = "+this.start);
     System.out.println("Destination = "+this.destination);
     System.out.println("Class  Type = "+this.classType);
     System.out.println("Preferd birth = "+this.birth);

  }

 }

 class Ticket{

   public static void main(String []args){

      TicketBooking tic=null;

      Scanner scan =new Scanner(System.in);

      System.out.println("Enter your name  ");

      String name=scan.nextLine();

      System.out.println("Starting Location ");

      String start=scan.nextLine();

      System.out.println("Destination Location ");

      String destination=scan.nextLine();

      int ticketId= (int) (Math.random()*1000000);


      System.out.println("Enter 1 for Bus Booking ");
      
      System.out.println("Enter 2 for Flight Booking ");

      System.out.println("Enter 3 for Train Booking ");

       System.out.println("Enter 4 for Exit");

      System.out.println("Enter choice ");

      int choice=scan.nextInt();

      switch (choice) {
         case 1:
              
         System.out.println("Enter a Bus name");

         String busName=scan.next();

          scan.nextLine();

         System.out.println("Enter Seatno ");

         int seatNo=scan.nextInt();

         scan.nextLine();

         tic=new Bus(busName, seatNo, name, ticketId, start, destination);

         tic.bookTicket();
         
           scan.close();
            break;
         case 2:
         
         System.out.println("Enter a Flight name");

         String flightName=scan.next();

          scan.nextLine();

         System.out.println("Enter Seatno ");

         int seatNum=scan.nextInt();

         tic=new Flight(flightName, seatNum, name, ticketId, start, destination);

         tic.bookTicket();

           scan.close();

            break;   
         case 3:
            System.out.println("Enter a Train name");

            String trainName=scan.next();

            scan.nextLine();

            System.out.println("Enter Seatno ");

            int seatNumTrain=scan.nextInt();

            System.out.println("Enter Prefered Birth (U,M,L) ");

            char birth=scan.next().charAt(0);

            scan.nextLine();

            System.out.println("Enter Preferd class (first,second,third) ");

            String classType=scan.nextLine();

            tic=new Train(trainName,seatNumTrain,name,ticketId,start,destination,classType,birth);

            tic.bookTicket();

            scan.close();

            break;
         case 4:
            System.exit(0);
            break;      
      
         default:

           System.out.println("Enter Correct Choice");
            break;
      }
      

   }

 }