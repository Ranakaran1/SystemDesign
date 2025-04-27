

public class App {
    public static void main(String[] args) throws Exception {
        Marker marker = new Marker("Camlin","Black",2024,25);
        Invoice invoice = new Invoice(marker, 20);
        DatabaseInvoiceDao db = new DatabaseInvoiceDao();
        db.save(invoice);

    }
}
