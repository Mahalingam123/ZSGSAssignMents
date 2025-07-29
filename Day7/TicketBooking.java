/*5. Develop a Java application for a Ticket Booking System that allows users
to book tickets for
different types of transportation modes such as Bus, Train, and Flight.
Define a common interface or abstract class`Ticket with a method`bookTicket()
that each transportation
 mode must implement differently.
Create classes`BusTicket,`TrainTicket, and`FlightTicket that extend the abstract
class or implement
 the interface.
Demonstrate runtime polymorphism by calling the`bookTicket() method using a
reference of the base
class/interface*/

import java.util.Scanner;

interface TicketBooking {

    abstract  public void bookTicket(String name,String start,String end,long ticketId);


}

class Bus implements TicketBooking
{

    @Override
    public void bookTicket(String name, String start, String end, long ticketId) {
        System.out.println("Bus  Ticket  is  Booked SuccessFully"+"\n");

        System.out.println("Your name = "+name+"\n");

        System.out.println("Your Ticket Id = "+ticketId+"\n");

        System.out.println("Your Starting Location = "+start+"\n");

        System.out.println("Your Destination  = "+end+"\n");
    }

}

class Flight implements TicketBooking
{
    @Override
    public void bookTicket(String name, String start, String end, long ticketId) {
        System.out.println("Flight  Ticket is Booked SuccessFully"+"\n");

        System.out.println("Your name = "+name+"\n");

        System.out.println("Your Ticket Id = "+ticketId+"\n");

        System.out.println("Your Starting Location = "+start+"\n");

        System.out.println("Your Destination = " +end+"\n");
    }
}

class Train implements TicketBooking{

    @Override
    public void bookTicket(String name, String start, String end, long ticketId) {

        System.out.println("Train  Ticket is Booked SuccessFully \n");

        System.out.println("Your name = "+name +"\n");

        System.out.println("Your Ticket Id = "+ticketId+"\n");

        System.out.println("Your Starting Location = "+start+"\n");

        System.out.println("Your Destination  = "+end+"\n");



    }
}

class MainTicket
{
    public static void main(String[] args) {

        TicketBooking book=null ;

        Scanner scan=new Scanner(System.in);

        while(true) {

            System.out.println("Enter 1 for Bus  Booking ");

            System.out.println("Enter 2 for Flight Booking ");

            System.out.println("Enter 3 for Train Booking");

            System.out.println("Enter 4 for exit");

            System.out.println("Enter Your Choice ");

            int ticketId= (int) (Math.random()*10000000);

            int choice = scan.nextInt();

            scan.nextLine();

            switch (choice) {
                case 1:
                    book = new Bus();

                    System.out.println("Enter Your Name");

                    String name =scan.next();

                    scan.nextLine();

                    System.out.println("Enter Your Staring Location");

                    String start=scan.nextLine();

                    System.out.println("Enter Your Destination Location ");

                    String end=scan.nextLine();

                    book.bookTicket(name, start, end, ticketId);

                    break;
                case 2:
                    book=new Flight();
                    System.out.println("Enter Your Name");

                    String name_1 =scan.nextLine();

                    System.out.println("Enter Your Starting Location");

                    String start_1=scan.nextLine();

                    System.out.println("Enter Your Destination Location ");

                    String end_1=scan.nextLine();

                    book.bookTicket(name_1, start_1, end_1, ticketId);
                    break;
                case 3:
                    book = new Train();

                    System.out.println("Enter Your Name");

                    String name_2 =scan.nextLine();

                    System.out.println("Enter Your Staring Location");

                    String start_2=scan.nextLine();

                    System.out.println("Enter Your Destination Location ");

                    String end_2=scan.nextLine();

                    book.bookTicket(name_2, start_2, end_2, ticketId);
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Enter Correct Choice Start Again");
                    break;

            }
        }

    }

}


