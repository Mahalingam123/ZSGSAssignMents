package travel.User;
import java.util.Scanner;

import travel.ticket.*;
public class User {
private   String name;
private  String  gender;
private int age;

public String getName() {
    return name;
}
public String getGender() {
    return gender;
}

public int getAge() {
    return age;
}

public void setName(String name){

    this.name=name;
}
public void setGender(String gender) {
    this.gender = gender;
}

public void setAge(int age){

    this.age=age;
}



public void bookTicket(){
    Scanner scan=new Scanner(System.in);

    System.out.println("Enter a Destination");

    String Destination =scan.next();
   
   Ticket tic=new Ticket();

   tic.setTicketId((int)(Math.random()*10000000));

   tic.setDestination(Destination);

   System.out.println("Ticked Booked Sucessfully");
   
    System.out.println( "Ticket ID "+tic.getTicketId());

    System.out.println("Destination = "+tic.getDestination());

    System.out.println("User Name = "+this.getName());

    System.out.println("User gender = "+this.getGender());

     scan.close();
   

}

}
