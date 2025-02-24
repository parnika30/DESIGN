package com.designPatterns.PrototypePattern.Example1;

public class PremiumEmail extends Email {
    private String cc;
    private String bcc;

    //normal constructor
    public PremiumEmail(String sender, String recipient, String subject, String body) {
        super(sender, recipient, subject, body);
        this.cc = cc;
        this.bcc = bcc;
    }

    //copy constructor
    public PremiumEmail(PremiumEmail copyPremiumEmail) {
        super(copyPremiumEmail);
        this.cc = copyPremiumEmail.cc;
        this.bcc = copyPremiumEmail.bcc;
    }

    @Override
    public PremiumEmail copy() {
        return new PremiumEmail(this);
    }

    public void displayEmail() {
        super.displayEmail(); // calls the display email method from the parent Email class
        System.out.println("CC: " + cc);
        System.out.println("BCC: " + bcc);
    }
}
