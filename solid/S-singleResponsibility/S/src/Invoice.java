package S.src;

public class Invoice {
    private Marker marker;
    private int quantity;

    public Invoice(Marker marker, int quantity) {
        this.marker = marker;
        this.quantity = quantity;
    }

    public int calculateTotal(){
        return marker.getPrice()*quantity;
    }
    
    // create separate class for below methods-- a class should have one reason to change.
    // public void printInvoice(){
    //     System.out.println("Invoice for " + marker.getName() + " is " + this.calculateTotal());
    // }
    // public void saveToDB(){
    //     System.out.println("save to DB");
    // }


}
