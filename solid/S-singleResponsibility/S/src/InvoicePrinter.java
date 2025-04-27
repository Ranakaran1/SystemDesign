package S.src;

public class InvoicePrinter {
    private Invoice invoice;

    public InvoicePrinter(Invoice invoice) {
        this.invoice = invoice;
    }


    public void print(){
        System.out.println("Invoice Number: " + invoice.calculateTotal());
    }
    
}
