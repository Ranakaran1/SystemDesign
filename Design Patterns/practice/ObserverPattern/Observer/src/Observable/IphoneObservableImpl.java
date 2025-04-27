package Observable;

import java.util.ArrayList;
import java.util.List;

import Observer.NotificationAlertObserver;

public class IphoneObservableImpl implements StockObservable {
    private List<NotificationAlertObserver> list1 = new ArrayList<>(); 
    int stockCount =0;

    @Override
    public void add(NotificationAlertObserver observer) {
        list1.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer) {
        list1.remove(observer);
    }

    @Override
    public void notifySubscriber() {
        for(NotificationAlertObserver obs: list1){
            obs.update();
        }
    }

    @Override
    public void setStockCount(int newStock) {
        if(stockCount==0){
            notifySubscriber();
        }
        this.stockCount += newStock;
    }

    @Override
    public int getStockCount() {
        return this.stockCount;
    }


}
