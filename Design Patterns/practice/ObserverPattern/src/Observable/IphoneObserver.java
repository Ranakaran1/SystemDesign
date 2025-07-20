 package Observable;

import java.util.ArrayList;
import java.util.List;

import Observer.NotificationAlertOberver;

public class IphoneObserver implements StockObservable{

    List<NotificationAlertOberver> li = new ArrayList<>();
    int data =0;

    @Override
    public void add(NotificationAlertOberver notificationAlertOberver) {
        li.add(notificationAlertOberver);
    }

    @Override
    public void remove(NotificationAlertOberver notificationAlertOberver) {
        li.remove(notificationAlertOberver);
    }

    @Override
    public void notifyStock() {
       for(NotificationAlertOberver observer : li){
        observer.update();
       }
    }

    @Override
    public void setStockCount(int data) {
        if(this.data ==0){
            this.notifyStock();
        }
        this.data += data;
    }

    @Override
    public int getScockCount() {
        return this.data;
    }


    
}