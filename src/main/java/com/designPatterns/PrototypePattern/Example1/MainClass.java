package com.designPatterns.PrototypePattern.Example1;

public class MainClass {
    public static void main(String[] args) {
        Email e1 = new Email("hello@world.com", "", "Test email", "This is a test email") {
            @Override
            public Email copy() {
                return null;
            }
        };

        Email e2 = e1.copy(); //calls the copy constructor
        e2.setBody("");
        e2.displayEmail();

//        PremiumEmail p1 = new PremiumEmail("hello@world.com", "", "Test email", "This is a test email", "cc", "bcc");
//        PremiumEmail p2 = p1.copy();
    }
}
