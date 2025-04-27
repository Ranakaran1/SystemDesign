public class DatabaseInvoiceDao implements InvoiceDaoNew {

    //save to DB.
    @Override
    public void save(Invoice invoice) {
        System.out.println("saving with total cost"+ invoice.calculateTotal());
        System.out.println(invoice.getMarker().color);
    }

}
