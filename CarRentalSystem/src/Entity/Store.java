package Entity;

import java.util.List;


public class Store {
    int id;
    String name;
    Location location;
    VehicleInventoryManager inventory;
    List<Reservation> reservations;

    public Store(int id, String name, Location location, VehicleInventoryManager inventory,
            List<Reservation> reservations) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.inventory = inventory;
        this.reservations = reservations;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public VehicleInventoryManager getInventory() {
        return inventory;
    }

    public void setInventory(VehicleInventoryManager inventory) {
        this.inventory = inventory;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }

    public double createBill(){
        Bill bill = new Bill(reservations.get(0));
        System.out.println(bill.calculateCost());
        return bill.calculateCost();
    }



    

}
