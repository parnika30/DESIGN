package com.designPatterns.ObserverPattern.Observable;

import com.designPatterns.ObserverPattern.Observer.NotificationAlertObserver;

public interface StocksObservable {
    public void add (NotificationAlertObserver notificationAlertObserver);
    public void remove (NotificationAlertObserver notificationAlertObserver);
    public void notifySubscribers ();
    public void  setStockCount (int newStock);
    public int getStockCount ();
}
