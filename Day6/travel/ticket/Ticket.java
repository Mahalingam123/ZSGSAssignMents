package travel.ticket;
public class Ticket {
   private int ticketId;

   private String destination;

   public int getTicketId()
   {
    return ticketId;
   }

   public String getDestination(){

    return destination;
   }

public void setTicketId( int ticketId)
{
    this.ticketId=ticketId;

}
public void setDestination( String destination)
{
    this.destination=destination;

}



}