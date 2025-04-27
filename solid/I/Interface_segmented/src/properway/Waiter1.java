package properway;

public class Waiter1 implements WaiterInterface{

    @Override
    public void serveCustomer() {
        System.out.println("Serving Customer");    
    }

    @Override
    public void takeOrder() {
        System.out.println("receiving Customer");    
    }


}
