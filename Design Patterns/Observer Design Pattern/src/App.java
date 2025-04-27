import Observable.IphoneObervableImpl;
import Observable.StockObservable;
import Observer.EmailAlertObserverImpl;
import Observer.MobileAlertObserverImpl;
import Observer.NotificationAlertObserver;

public class App {
    public static void main(String[] args) throws Exception {
        StockObservable iphoneStockObservable = new IphoneObervableImpl();

        NotificationAlertObserver observer1 = new EmailAlertObserverImpl("karan180819@gmail.com", iphoneStockObservable);
        NotificationAlertObserver observer2 = new EmailAlertObserverImpl("karan.rana@gmail.com", iphoneStockObservable);
        NotificationAlertObserver observer3 = new MobileAlertObserverImpl("karanrana1",iphoneStockObservable);

    

        iphoneStockObservable.add(observer1);
        iphoneStockObservable.add(observer2);
        iphoneStockObservable.add(observer3);


        iphoneStockObservable.setStockCount(10);

    }
}
