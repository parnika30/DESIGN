package com.designPatterns.ObserverPattern.Observer;

import com.designPatterns.ObserverPattern.Observable.StocksObservable;

public class EmailAlertImpl implements NotificationAlertObserver{

    String emailId;
    StocksObservable stocksObservable;

    public EmailAlertImpl(String emailId, StocksObservable stocksObservable){
        this.emailId = emailId;
        this.stocksObservable = stocksObservable;
    }
    @Override
    public void update() {
        sendMail(emailId);
    }

    private void sendMail(String emailId){
        System.out.print("email sent to: "+emailId);
    }

}
