package com.designPatterns.PrototypePattern.Example1;

public abstract class Email implements Prototype<Email> {

    private String sender;
    private String recipient;
    private String subject;
    private String body;


    //normal constructor
    public Email(String sender, String recipient, String subject, String body) {
        this.sender = sender;
        this.recipient = recipient;
        this.subject = subject;
        this.body = body;
    }

    //Copy constructor
    public Email(Email copyEmail) {
        this.sender = copyEmail.sender;
        this.recipient = copyEmail.recipient;
        this.subject = copyEmail.subject;
        this.body = copyEmail.body;
    }

    //public abstract PremiumEmail copy();

    //getter setters
    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }


    public void displayEmail() {
        System.out.println("Sender: " + sender);
        System.out.println("Recipient: " + recipient);
        System.out.println("Subject: " + subject);
        System.out.println("Body: " + body);
    }
}
