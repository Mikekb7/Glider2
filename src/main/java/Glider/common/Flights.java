package Glider.common;

public class Flights {
    private String flightNumber;
    private String departure;
    private String destination;
    private String airline;

    public Flights(String flightNumber, String departure, String destination, String airline){
        this.flightNumber = flightNumber;
        this.departure = departure;
        this.destination = destination;
        this.airline = airline;
    }

    public String getFlightNumber(){
        return flightNumber;
    }
    public void setFlightNumber(String flightNumber){
        this.flightNumber = flightNumber;
    }
    public String getDeparture(){
        return departure;
    }
    public void setDeparture(String departure){
        this.departure = departure;
    }

    public String getDestination(){
        return destination;
    }

    public void setDestination(String destination){
        this.destination = destination;
    }

    public String getAirlines(){
        return airline;
    }
    public void setAirlines(String airline){
        this.airline = airline;
    }
}
