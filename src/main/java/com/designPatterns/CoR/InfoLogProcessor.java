package com.designPatterns.CoR;

public class InfoLogProcessor extends LogProcessor{

    InfoLogProcessor(LogProcessor nextLogProcessor){
        super(nextLogProcessor);
    }

    public void log(int logLevel, String msg) {
        if(logLevel == INFO){
            System.out.print("Info: " + msg);
        }else {
            super.log(logLevel, msg);
        }
    }
}
