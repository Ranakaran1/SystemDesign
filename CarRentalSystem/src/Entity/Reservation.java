package Entity;

import java.util.Date;

import Products.Vehicle;

public class Reservation {

    int id;
    User user;
    Vehicle vehicle;

    Date From;
    
    Date To;
    String timeFrom;
    String timeTo;
    Location location;

    public Reservation() {
    }
    

    public Reservation(int id, User user, Vehicle vehicle, Date from, Date to, String timeFrom, String timeTo,
            Location location) {
        this.id = id;
        this.user = user;
        this.vehicle = vehicle;
        From = from;
        To = to;
        this.timeFrom = timeFrom;
        this.timeTo = timeTo;
        this.location = location;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
    public Vehicle getVehicle() {
        return vehicle;
    }
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    public Date getFrom() {
        return From;
    }
    public void setFrom(Date from) {
        From = from;
    }
    public Date getTo() {
        return To;
    }
    public void setTo(Date to) {
        To = to;
    }
    public String getTimeFrom() {
        return timeFrom;
    }
    public void setTimeFrom(String timeFrom) {
        this.timeFrom = timeFrom;
    }
    public String getTimeTo() {
        return timeTo;
    }
    public void setTimeTo(String timeTo) {
        this.timeTo = timeTo;
    }
    public Location getLocation() {
        return location;
    }
    public void setLocation(Location location) {
        this.location = location;
    }

    

    

    
}
