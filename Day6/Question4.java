/*4. Design a travel booking system using two packages:`travel.booking –
 includes a class`Ticket with ticket ID, destination, and fare.`travel.user –
  includes a class`User with user details and a method to book a ticket.
Illustrate accessing ticket data from within the user class. */

import java.util.Scanner;

import travel.User.User;



public class Question4 {
    
public static void main(String ...args){

    Scanner sc=new Scanner(System.in);

    System.out.println("Enter a Name");

    String name=sc.nextLine();

    System.out.println("Enter a Gender ");

    String gender=sc.nextLine();

    System.out.println("Enter Age");

    int age=sc.nextInt();

    User user=new User();

    user.setAge(age);

    user.setGender(gender);

    user.setName(name);
    
    user.bookTicket();
  



}

}
