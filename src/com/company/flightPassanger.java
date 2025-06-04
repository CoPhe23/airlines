package com.company;

public class flightPassanger {
    public String Flightnumber;
    public String Source;
    public String Destination;
    public String PassangerName;
    public int PassangerID;
    public String TicketID ;
    public String Seatnumber;
    public int price;
    public flightPassanger(String flightnumber, String source, String destination, String passangerName, int passangerID, String ticketID, String seatnumber, int price) {
        this.Flightnumber = flightnumber;
        this.Source = source;
        this.Destination = destination;
        this.PassangerName = passangerName;
        this.PassangerID = passangerID;
        this.TicketID = ticketID;
        this.Seatnumber = seatnumber;
        this.price = price;
    }
}
