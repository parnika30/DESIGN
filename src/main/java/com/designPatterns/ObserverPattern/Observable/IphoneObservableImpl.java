package com.designPatterns.ObserverPattern.Observable;

import com.designPatterns.ObserverPattern.Observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservableImpl implements StocksObservable{

    public List<NotificationAlertObserver> observerList = new ArrayList<>();
    int stockCount = 0;

    @Override
    public void add(NotificationAlertObserver notificationAlertObserver) {
        observerList.add(notificationAlertObserver);
    }

    @Override
    public void remove(NotificationAlertObserver notificationAlertObserver) {
        observerList.remove(notificationAlertObserver);
    }

    @Override
    public void notifySubscribers() {
        for(NotificationAlertObserver notificationAlertObserver : observerList){
            notificationAlertObserver.update();
        }
    }

    @Override
    public void setStockCount(int newStock) {
        if(stockCount == 0) notifySubscribers();
        stockCount += newStock;
    }

    @Override
    public int getStockCount() {
        return stockCount;
    }
}
