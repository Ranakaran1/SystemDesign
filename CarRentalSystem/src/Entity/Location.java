package Entity;

public class Location {
    String Address;
    String City;
    String State;
    String Zip;
    public Location(String address, String city, String state, String zip) {
        Address = address;
        City = city;
        State = state;
        Zip = zip;
    }
    public String getAddress() {
        return Address;
    }
    public void setAddress(String address) {
        Address = address;
    }
    public String getCity() {
        return City;
    }
    public void setCity(String city) {
        City = city;
    }
    public String getState() {
        return State;
    }
    public void setState(String state) {
        State = state;
    }
    public String getZip() {
        return Zip;
    }
    public void setZip(String zip) {
        Zip = zip;
    }


}
