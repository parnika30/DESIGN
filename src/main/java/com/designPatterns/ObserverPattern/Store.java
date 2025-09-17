package com.designPatterns.ObserverPattern;

import com.designPatterns.ObserverPattern.Observable.IphoneObservableImpl;
import com.designPatterns.ObserverPattern.Observable.StocksObservable;
import com.designPatterns.ObserverPattern.Observer.EmailAlertImpl;
import com.designPatterns.ObserverPattern.Observer.MobileAlertImpl;
import com.designPatterns.ObserverPattern.Observer.NotificationAlertObserver;

public class Store {
    public static void main(String[] args) {
        StocksObservable stocksObservable  = new IphoneObservableImpl();

        NotificationAlertObserver notificationAlertObserver = new MobileAlertImpl("iphone mobile user ", stocksObservable);
        NotificationAlertObserver notificationAlertObserver2 = new EmailAlertImpl("parnika.roy30@gmail.com ", stocksObservable);

        stocksObservable.add(notificationAlertObserver);
        stocksObservable.add(notificationAlertObserver2);
        stocksObservable.setStockCount(10);
    }
}
