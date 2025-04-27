import Observable.IphoneObservableImpl;
import Observer.EmailAlertObserverImpl;
import Observer.MobileAlertObserver;
import Observer.NotificationAlertObserver;

public class App {
    public static void main(String[] args) throws Exception {

        IphoneObservableImpl iphoneObservableImpl = new IphoneObservableImpl();

        NotificationAlertObserver mobileAlertObserver = new MobileAlertObserver(iphoneObservableImpl,"karna.gmail.com");
        iphoneObservableImpl.add(mobileAlertObserver);

        NotificationAlertObserver emailAlertObserverImpl = new EmailAlertObserverImpl(iphoneObservableImpl, "karanEmail@gmail.com");
        iphoneObservableImpl.add(emailAlertObserverImpl);

        iphoneObservableImpl.setStockCount(10);

        mobileAlertObserver.getStockCount();

    }
}
