public class FileInvoiceDao implements InvoiceDaoNew{

    //save to file
    @Override
    public void save(Invoice invoice) {
        System.out.println("saving to file");
        System.out.println(invoice.getMarker().name);
    }
    
}
