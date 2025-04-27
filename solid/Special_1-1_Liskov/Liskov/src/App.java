import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        List<Vehicle> vehicleList = new ArrayList<>();
        vehicleList.add(new MotorCycle());
        vehicleList.add(new Car());
        vehicleList.add(new Bicycle());

        // will give error
        // for(Vehicle vehicle : vehicleList) {
        //     System.out.println(vehicle.hasEngine());
        // }

        List<EngineVehicle> vehicleList1 = new ArrayList<>();
        vehicleList1.add(new MotorCycle());
        vehicleList1.add(new Car());
        // vehicleList1.add(new Bicycle()); // will give error

        for (EngineVehicle vehicle : vehicleList1) {
            System.out.println(vehicle.hasEngine());
        }
        //way to print all vehicles that has engine.


        // vehicle
        // -
        // -
        // -
        // ----> EngineVehicle----->Car()
        // ------------------------>MotorCycle()
        // -
        // -
        // -
        // ---->Bicycle()

    }
}
