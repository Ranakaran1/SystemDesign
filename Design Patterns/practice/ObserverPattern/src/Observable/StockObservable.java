package Observable;

import Observer.NotificationAlertOberver;

public interface StockObservable {
    
    public void add(NotificationAlertOberver notificationAlertOberver);
    public void remove(NotificationAlertOberver notificationAlertOberver);
    public void notifyStock();
    public void setStockCount(int data);
    public int getScockCount();
}
