package S.src;

public class InvoiceDao {
    Invoice invoice;
    public InvoiceDao(Invoice invoice) {
        this.invoice = invoice;
        }
    public void savetoDB(){
        // save to database
        System.out.println("saving to DB"+ invoice.calculateTotal());
    }
}
