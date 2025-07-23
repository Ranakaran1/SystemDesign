import java.util.ArrayList;
import java.util.List;


import Entity.Location;
import Entity.Reservation;
import Entity.Store;
import Entity.User;
import Entity.VehicleInventoryManager;
import Products.Car;
import Products.Vehicle;

public class App {
    public static void main(String[] args) throws Exception {
        Vehicle vehicle = new Car();
        User user = new User();
        user.setName("Sambit");
        user.setEmail("sambit@gmail.com");
        VehicleInventoryManager vehicleInventoryManager = new VehicleInventoryManager();
        vehicleInventoryManager.addVehicle(vehicle);
        Location location = new Location("4 RK Puram", "Delhi", "DL", "202001");
        Reservation reservation = new Reservation();
        List<Reservation> reservationList = new ArrayList<>();
        reservationList.add(reservation);
        Store store = new Store(1  , "Aman Store", location, vehicleInventoryManager, reservationList);
        store.createBill();

    }
}
