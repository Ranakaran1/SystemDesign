package Entity;

public class Bill {
    Reservation reservation;
    String billNumber;
    String billDate;
    double totalCost;

    public Bill(Reservation reservation){
        this.reservation = reservation;
    }

    public double calculateCost(){
        return 100D;
    }

    public String getBillNumber() {
        return billNumber;
    }

    public void setBillNumber(String billNumber) {
        this.billNumber = billNumber;
    }

    public String getBillDate() {
        return billDate;
    }

    public void setBillDate(String billDate) {
        this.billDate = billDate;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }
    
}
