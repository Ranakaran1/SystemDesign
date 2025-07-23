package Entity;

import java.util.ArrayList;
import java.util.List;

import Products.Vehicle;

public class VehicleInventoryManager {
    List<Vehicle> vehicleList;

    public VehicleInventoryManager(){
        vehicleList = new ArrayList<Vehicle>();
    }
    public VehicleInventoryManager(List<Vehicle> li){
        vehicleList = li;
    }

    public void addVehicle(Vehicle vehicle ){
        vehicleList.add(vehicle);
    }
    public void removeVehicle(Vehicle vehicle ){
        vehicleList.remove(vehicle);
    }



}
