package com.designPatterns.ObserverPattern.Observer;

import com.designPatterns.ObserverPattern.Observable.StocksObservable;

public class MobileAlertImpl implements NotificationAlertObserver{

    String username;
    StocksObservable stocksObservable;

    public MobileAlertImpl(String username, StocksObservable stocksObservable){
        this.username = username;
        this.stocksObservable = stocksObservable;
    }

    @Override
    public void update() {
        sendMsgOnMobile(username);
    }

    private void sendMsgOnMobile(String username){
        System.out.print("msg sent to: "+username);
    }
}
