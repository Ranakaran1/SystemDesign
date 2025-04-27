

public class InvoiceDao {
    Invoice invoice;
    public InvoiceDao(Invoice invoice) {
        this.invoice = invoice;
        }
    public void savetoDB(){
        // save to database
        System.out.println("saving to DB"+ invoice.calculateTotal());
    }

    // we have taken this class from previous S 
    // if we have to create new method save to file we will change the existing code.
    // insted of doinf that we make it interface then doing opeations.
}
