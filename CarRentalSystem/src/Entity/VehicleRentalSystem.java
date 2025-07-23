package Entity;

import java.util.List;

public class VehicleRentalSystem {
    List<Store> stores;
    List<User> users;

    public void addUser(User user){
        users.add(user);

    }
    public void removeUser(User user){
        users.remove(user);
    }
    public void addStore(Store store){
        stores.add(store);
    }
    public void removeStore(Store store){
        stores.remove(store);
    }
    
    
}
