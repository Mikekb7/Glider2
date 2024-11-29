package Glider.common;
import java.util.ArrayList;

public class Customer {
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String email;
    private final String role = "Customer";
    private ArrayList<Flights> flights;
    private String action;


    public Customer(){
        flights = new ArrayList<>();
    }
    public Customer(String username, String password, String firstName, String lastName, String email){
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public String getUsername(){
        return username;
    }
    public void setUsername(String userName){
        this.username = username;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public ArrayList<Flights> getFlights(){
        return flights;
    }
    public void setFlights(ArrayList<Flights> flights){
        this.flights = flights;
    }
    public String getAction(){
        return action;
    }
    public void setAction(String action){
        this.action = action;
    }
    public String getRole(){
        return role;
    }


}
