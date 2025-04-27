package S.src;


public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Marker marker1 = new Marker("dora","blue",2025,20);

        Invoice invoice = new Invoice(marker1, 5);
        // invoice.printInvoice();

        InvoiceDao invoiceDao = new InvoiceDao(invoice);
        invoiceDao.savetoDB();
    }
}
