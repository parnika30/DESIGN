package com.designPatterns.CoR;

public class DebugLogProcessor extends LogProcessor{

    DebugLogProcessor(LogProcessor nextLogProcessor){
        super(nextLogProcessor);
    }

    public void log(int logLevel, String msg) {
        if(logLevel == DEBUG){
            System.out.print("DEBUG: " + msg);
        }else {
            super.log(logLevel, msg);
        }
    }
}
